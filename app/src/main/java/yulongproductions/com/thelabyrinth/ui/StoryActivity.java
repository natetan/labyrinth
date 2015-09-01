package yulongproductions.com.thelabyrinth.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import yulongproductions.com.thelabyrinth.R;
import yulongproductions.com.thelabyrinth.model.Page;
import yulongproductions.com.thelabyrinth.model.Story;

public class StoryActivity extends Activity {

    // Fields (Member Variables)
    private Story mStory = new Story();
    private ImageView mImageView;
    private TextView mTextView;
    private Button mChoice1;
    private Button mChoice2;
    private String mName;
    private Page mCurrentPage;

    // Class constants
    public static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent i = getIntent();
        mName = i.getStringExtra(getString(R.string.name));

        if (mName == null) {
            mName = "Pan";
        }
        Log.d(TAG, mName);

        mImageView = (ImageView) findViewById(R.id.storyImageView);
        mTextView = (TextView) findViewById(R.id.storyTextView);
        mChoice1 = (Button) findViewById(R.id.choiceButton1);
        mChoice2 = (Button) findViewById(R.id.choiceButton2);

        loadPage(0);
    }

    private void loadPage(int choice) {
        final MediaPlayer advanceNoise = MediaPlayer.create(this, R.raw.facebook_pop);
        final MediaPlayer skyrimMusic = MediaPlayer.create(this, R.raw.skyrim_main_theme);

        final MediaPlayer appMusic = MediaPlayer.create(this, mStory.getPage(choice).getSoundId());

        // The code and syntax is correct, but the moment a nonexistent "choice" pops up,
        // the default android error message pops up.
        if (mStory.doesNotExist(choice)) {
            alertUserAboutError();
        } else {
            mCurrentPage = mStory.getPage(choice);
            Drawable drawable = getResources().getDrawable(mCurrentPage.getImageId());
            mImageView.setImageDrawable(drawable);

            String pageText = mCurrentPage.getText();
            pageText = String.format(pageText, mName);
            mTextView.setText(pageText);
            appMusic.start();


            // Death Page
            if (mCurrentPage.isFinal()) {
                mChoice1.setVisibility(View.INVISIBLE);
                mChoice2.setText("Play again?");
                mChoice2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        skyrimMusic.start();
                        finish();
                    }
                });
                // Single choice page
            } else if (mCurrentPage.isOneChoice()) {
                mChoice1.setVisibility(View.INVISIBLE);
                mChoice2.setText("Continue");
                mChoice2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadPage(mCurrentPage.getChoice2().getNextPage());
                        advanceNoise.start();
                    }
                });
            } else {
                mChoice1.setText(mCurrentPage.getChoice1().getText());
                mChoice2.setText(mCurrentPage.getChoice2().getText());

                mChoice1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadPage(mCurrentPage.getChoice1().getNextPage());
                        advanceNoise.start();
                    }
                });

                mChoice2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        loadPage(mCurrentPage.getChoice2().getNextPage());
                        advanceNoise.start();
                    }
                });
            }
        }
    }

    private void alertUserAboutError() {
        AlertDialogFragment dialog = new AlertDialogFragment();
        dialog.show(getFragmentManager(), "error_message");
    }
}
