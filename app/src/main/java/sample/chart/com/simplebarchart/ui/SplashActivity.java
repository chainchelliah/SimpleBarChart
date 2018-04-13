package sample.chart.com.simplebarchart.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import sample.chart.com.simplebarchart.R;
import sample.chart.com.simplebarchart.base.BaseActivity;
import sample.chart.com.simplebarchart.constant.Constant;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                moveToChartScreen();
            }
        }, Constant.SPLASH_DISPLAY_LENGTH);
    }

    private void moveToChartScreen() {
        Intent mainIntent = new Intent(SplashActivity.this, DemoActivity.class);
        startActivity(mainIntent);
        finish();
    }
}
