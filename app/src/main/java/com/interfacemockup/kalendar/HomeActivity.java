package com.interfacemockup.kalendar;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

import org.jsoup.Jsoup;

import java.io.IOException;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomeActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3500;
    private FirebaseAnalytics mFirebaseAnalytics;
    private FirebaseAuth mAuth;

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


        mAuth = FirebaseAuth.getInstance();

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);





        FirebaseMessaging.getInstance().setAutoInitEnabled(true);

        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.METHOD, "odjebi");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SIGN_UP, bundle);


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

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    private void updateUI(FirebaseUser currentUser){

    }



}
