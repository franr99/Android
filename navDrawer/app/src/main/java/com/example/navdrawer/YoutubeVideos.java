package com.example.navdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeVideos extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    YouTubePlayerView yt;
    String clave = "AIzaSyDpT-ZX0A5k18DQ3Rwsr2KmZpYXswvWAUs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_view);
        yt = (YouTubePlayerView)findViewById(R.id.youtube);
        yt.initialize(clave,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

            youTubePlayer.cueVideo("Jgu6DVjCb8s");

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

        if (youTubeInitializationResult.isUserRecoverableError()) {

            youTubeInitializationResult.getErrorDialog(this,1).show();
        }else{
            String error = "Error al incializar youtube" + youTubeInitializationResult.toString();
            Toast.makeText(getApplication(),error,Toast.LENGTH_LONG).show();
        }
    }

    public void OnActivityResult(int requestCode, int resultCode, Intent data){
        if(resultCode==1){

        }
    }
}
