package com.example.practica03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(MyLifeCycleObserver())
        Toast.makeText(this,"OnCreate",Toast.LENGTH_SHORT).show();
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"OnStart",Toast.LENGTH_SHORT).show();
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"OnResume",Toast.LENGTH_SHORT).show();
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"OnPause",Toast.LENGTH_SHORT).show();
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"OnStop",Toast.LENGTH_SHORT).show();
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"OnRestart",Toast.LENGTH_SHORT).show();

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"OnDestroy",Toast.LENGTH_SHORT).show();
        super.onDestroy()
    }
}