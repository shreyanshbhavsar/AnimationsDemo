package shreyansh.bhavsar.animations;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ImageView logo;
    TextView tagLine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Hide the StatusBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Hide the ActionBar
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();

        //Set content after above lines
        setContentView(R.layout.activity_main);

        logo = (ImageView)findViewById(R.id.logoimage);
        tagLine = (TextView) findViewById(R.id.taglinetv);

        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                logo.animate().translationYBy(-200f).setDuration(2000);
                tagLine.animate().alpha(1f).setDuration(3500);

                //Intent intent = new Intent(MainActivity.this,AnimationActivity.class);


            }
        },500);
    }
}
