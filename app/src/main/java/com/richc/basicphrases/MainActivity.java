package com.richc.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonToggle (View view) {

        int viewId = view.getId();
        String btnId="";

        btnId = getResources().getResourceEntryName(viewId);
        Log.i("button tapped", btnId);

        int rawResId = getResources().getIdentifier(btnId, "raw", "com.richc.basicphrases");
        Log.i("resource ID", Integer.toString(rawResId));

        MediaPlayer mp = MediaPlayer.create(this, rawResId);
        mp.start();
    }
}
