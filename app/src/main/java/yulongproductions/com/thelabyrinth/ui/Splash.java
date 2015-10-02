package yulongproductions.com.thelabyrinth.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import yulongproductions.com.thelabyrinth.R;

/**
 * Created by Yulong on 10/1/2015.
 */
public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        final ImageView spinningCircle = (ImageView) findViewById(R.id.spinImage);
        final Animation rotation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
        final Animation fadeOut = AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_fade_out);

        spinningCircle.startAnimation(rotation);
        rotation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                spinningCircle.startAnimation(fadeOut);
                finish();
                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
