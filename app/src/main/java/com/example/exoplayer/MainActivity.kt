package com.example.exoplayer

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
  // added change
        val videoView = findViewById<VideoView>(R.id.xml_video_view)
        val packageName = "android.resource://" + getPackageName() + "/" + R.raw.trial
        val uri = Uri.parse(packageName)
        videoView.setVideoURI(uri)

        // video controller variables
        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
    }
}