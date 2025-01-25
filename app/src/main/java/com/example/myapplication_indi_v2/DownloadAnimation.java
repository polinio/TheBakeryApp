package com.example.myapplication_indi_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.view.animation.TranslateAnimation;

public class DownloadAnimation extends AppCompatActivity {
    private ImageView breadImageView, steam1ImageView, steam2ImageView, steam3ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_animation);

        breadImageView = findViewById(R.id.breadImageView);
        steam1ImageView = findViewById(R.id.steam1ImageView);
        steam2ImageView = findViewById(R.id.steam2ImageView);
        steam3ImageView = findViewById(R.id.steam3ImageView);

        steam1ImageView.setVisibility(View.INVISIBLE);
        steam2ImageView.setVisibility(View.INVISIBLE);
        steam3ImageView.setVisibility(View.INVISIBLE);

        // Start the fade-in animation
        fadeInBread();
    }

    private void fadeInBread() {
        // Create fade-in animation
        AlphaAnimation fadeIn = new AlphaAnimation(0f, 1f);
        fadeIn.setDuration(2000); // Set animation duration to 2 seconds (2000 milliseconds)
        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Optional: Hide steam images initially
                steam1ImageView.setVisibility(View.INVISIBLE);
                steam2ImageView.setVisibility(View.INVISIBLE);
                steam3ImageView.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                showAndAnimateSteam();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Not used for this animation
            }
        });

        // Apply animation to bread image view
        breadImageView.startAnimation(fadeIn);
    }

    private void showAndAnimateSteam() {
        steam1ImageView.setVisibility(View.VISIBLE);
        steam2ImageView.setVisibility(View.VISIBLE);
        steam3ImageView.setVisibility(View.VISIBLE);

        // Create fade-in animations for each steam image view
        AlphaAnimation fadeInSteam1 = new AlphaAnimation(0f, 1f);
        fadeInSteam1.setDuration(1000); // Fade in for 1 second

        AlphaAnimation fadeInSteam2 = new AlphaAnimation(0f, 1f);
        fadeInSteam2.setDuration(1000); // Fade in for 1 second

        AlphaAnimation fadeInSteam3 = new AlphaAnimation(0f, 1f);
        fadeInSteam3.setDuration(1000); // Fade in for 1 second

        // Create upward movement animation
        TranslateAnimation moveUp = new TranslateAnimation(0, 0, 0, -50);
        moveUp.setDuration(1500); // Move up for 1 second
        moveUp.setFillAfter(true); // Keep at the end position

        // Create downward movement animation
        TranslateAnimation moveDown = new TranslateAnimation(0, 0, 0, 50);
        moveDown.setDuration(2500); // Move down for 1 second
        moveDown.setFillAfter(true); // Keep at the end position

        // Combine fade-in animations with movement animations
        AnimationSet animationSet1 = new AnimationSet(true);
        animationSet1.addAnimation(fadeInSteam1);
        animationSet1.addAnimation(moveUp);
        animationSet1.addAnimation(moveDown);

        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(fadeInSteam2);
        animationSet2.addAnimation(moveUp);
        animationSet2.addAnimation(moveDown);

        AnimationSet animationSet3 = new AnimationSet(true);
        animationSet3.addAnimation(fadeInSteam3);
        animationSet3.addAnimation(moveUp);
        animationSet3.addAnimation(moveDown);

        // Start the combined animations on all steam image views
        steam1ImageView.startAnimation(animationSet1);
        steam2ImageView.startAnimation(animationSet2);
        steam3ImageView.startAnimation(animationSet3);

        // Start the transition to MainActivity after the animation ends
        animationSet3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Not used in this case
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(DownloadAnimation.this, MainActivity.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Not used in this case
            }
        });
    }
}