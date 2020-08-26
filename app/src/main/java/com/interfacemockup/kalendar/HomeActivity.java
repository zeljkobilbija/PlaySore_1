package com.interfacemockup.kalendar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.analytics.HiAnalytics;
import com.huawei.hms.analytics.HiAnalyticsInstance;
import com.huawei.hms.analytics.HiAnalyticsTools;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.aaid.HmsInstanceId;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomeActivity extends AppCompatActivity {

    private static String TAG = "Home Activiti Token je";
    private static int SPLASH_TIME_OUT = 3500;

    private HmsInstanceId hmsInstanceId;
    private CircleImageView image;
    private Animation sideAnimation;
    private TextView _pravoslavac;
    private Animation _sideAnimationpravoslavac;
    private TextView _pravoslavac_dva;
    private Animation _sideAnimationpravoslavac_dva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




        //Animacija 1
        image = (CircleImageView) findViewById(R.id.imageView2);
        sideAnimation = AnimationUtils.loadAnimation(this, R.anim.side_animation);
        image.setAnimation(sideAnimation);
        //Animacija 2
        _pravoslavac = (TextView) findViewById(R.id.textView3);
        _sideAnimationpravoslavac = AnimationUtils.loadAnimation(this, R.anim.side_animation_pravoslavac);
        _pravoslavac.setAnimation(_sideAnimationpravoslavac);
        //Animacija 3
        _pravoslavac_dva = (TextView) findViewById(R.id.textView5);
        _sideAnimationpravoslavac_dva = AnimationUtils.loadAnimation(this, R.anim.side_animation_pravoslavac_dva);
        _pravoslavac_dva.setAnimation(_sideAnimationpravoslavac_dva);



        Bundle bundle = new Bundle();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);


        GlobalnaClassa glob = GlobalnaClassa.getInstance();
        glob.setPokaziAdMob(true);

        HiAnalyticsTools.enableLog();
        HiAnalyticsInstance instance = HiAnalytics.getInstance(this);



    }


//    private void getToken() {
//        new Thread() {
//            @Override
//            public void run() {
//                try {
//                    // read from agconnect-services.json
//                    String appId = AGConnectServicesConfig.fromContext(HomeActivity.this).getString("client/app_id");
//                    String token = HmsInstanceId.getInstance(HomeActivity.this).getToken(appId, "HCM");
//                    Log.i(TAG, "get token:" + token);
//                    if(!TextUtils.isEmpty(token)) {
//                        sendRegTokenToServer(token);
//                        Log.e(TAG, "get token not failed, ");
//                    }
//                } catch (ApiException e) {
//                    Log.e(TAG, "get token failed, " + e);
//                }
//            }
//        }.start();
//    }
//    private void sendRegTokenToServer(String token) {
//        Log.i(TAG, "sending token to server. token:" + token);
//    }
//
//    // This method callback must be completed in 10 seconds. Otherwise, you need to start a new Job for callback processing.
//
//    public void onNewToken(String token) {
//        Log.i(TAG, "received refresh token:" + token);
//        // send the token to your app server.
//        if (!TextUtils.isEmpty(token)) {
//            refreshedTokenToServer(token);
//        }
//    }
//    private void refreshedTokenToServer(String token) {
//        Log.i(TAG, "sending token to server. token:" + token);
//    }


}
