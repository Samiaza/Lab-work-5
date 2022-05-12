package com.example.laba5;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView mVideoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoPlayer = (VideoView) findViewById(R.id.videoView);
        Uri mVideoUri = Uri.parse("android.resource://" + getPackageName() +
                "/" + R.raw.video);
        mVideoPlayer.setVideoURI(mVideoUri);
        MediaController mediaController = new MediaController(this);
        mVideoPlayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(mVideoPlayer);
    }

    public void onStartClick(View view) {
        mVideoPlayer.start();
    }

    public void onPauseClick(View view) {
        mVideoPlayer.pause();
    }

    public void onStopClick(View view) {
        mVideoPlayer.stopPlayback();
        mVideoPlayer.resume();
    }
}