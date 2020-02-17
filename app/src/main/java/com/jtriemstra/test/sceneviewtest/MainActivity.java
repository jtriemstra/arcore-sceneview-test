package com.jtriemstra.test.sceneviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.ar.sceneform.SceneView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onPause() {
        super.onPause();
        SceneView x = (SceneView) findViewById(R.id.scene_view);
        x.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        SceneView x = (SceneView) findViewById(R.id.scene_view);
        try {
            x.resume();
        }
        catch (Exception e){
            
        }
    }
}
