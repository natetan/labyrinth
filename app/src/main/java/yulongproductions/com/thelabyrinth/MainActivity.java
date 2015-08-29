package yulongproductions.com.thelabyrinth;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import yulongproductions.com.thelabyrinth.ui.StoryActivity;


public class MainActivity extends Activity {
    public static final String TAG = MainActivity.class.getSimpleName();

    private EditText mNameField;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final MediaPlayer player = MediaPlayer.create(this, R.raw.gameboy_start_up);
        final MediaPlayer skyrimMusic = MediaPlayer.create(this, R.raw.skyrim_main_theme);
        skyrimMusic.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField = (EditText)findViewById(R.id.nameEditText);
        mStartButton = (Button)findViewById(R.id.startButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameField.getText().toString();
                skyrimMusic.stop();
                player.start();
                startStory(name);
            }
        });

        Log.d(TAG, "Main code is running");

    }

    private void startStory(String name) {
        Intent i = new Intent(this, StoryActivity.class);
        i.putExtra(getString(R.string.name), name);
        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mNameField.setText("");
    }
}
