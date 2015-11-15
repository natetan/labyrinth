package yulongproductions.com.thelabyrinth.ui;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import yulongproductions.com.thelabyrinth.R;


public class MainActivity extends Activity {
    public static final String TAG = MainActivity.class.getSimpleName();

    private EditText mNameField;
    private Button mStartButton;
    private MediaPlayer player;
    private MediaPlayer mainTheme;
    private AutoCompleteTextView monthTextView;
    private String[] months;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.player = MediaPlayer.create(this, R.raw.gameboy_start_up);
        this.mainTheme = MediaPlayer.create(this, R.raw.dead_silence);
        this.mainTheme.start();
        this.mainTheme.setLooping(true);
        mNameField = (EditText)findViewById(R.id.nameEditText);
        mStartButton = (Button)findViewById(R.id.startButton);

        // Sets the ArrayAdapter to the AutoCompleteTextView
        monthTextView = (AutoCompleteTextView)findViewById(R.id.months);
        this.months = getResources().getStringArray(R.array.month_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, this.months);
        monthTextView.setAdapter(adapter);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameField.getText().toString();
                mainTheme.stop();
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
        this.mainTheme.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.mainTheme.stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.mainTheme.stop();
    }
}
