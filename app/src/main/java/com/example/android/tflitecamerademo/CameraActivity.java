package com.example.android.tflitecamerademo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.firebase.FirebaseApp;

/**
 * Main {@code Activity} class for the Camera app.
 */
public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        FirebaseApp.initializeApp(this);
        if (null == savedInstanceState) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();
        }
    }
}
