package com.example.navdrawer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    List<YoutubeVideos> youtubeVideosList;

    public VideoAdapter(){

    }
    public VideoAdapter(List<YoutubeVideos> youtubeVideosList){
        this.youtubeVideosList = youtubeVideosList;
    }

    @NonNull
    @Override
    public VideoAdapter.VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view, parent, false);
        return new VideoViewHolder(view);
    }

    public void onBindViewHolder(VideoViewHolder holder, int position){
        holder.videoWeb.loadData(youtubeVideosList.get(position).getVideo(),"text/html","utf-8");
    }

    public int getItemCount(){ return youtubeVideosList.size();}

    public class VideoViewHolder extends RecyclerView.ViewHolder{
        WebView videoWeb;

        public VideoViewHolder(View itemView){
            super(itemView);
            videoWeb = (WebView)itemView.findViewById(R.id.videoWebView);

            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient(){

            });
        }
    }
}
