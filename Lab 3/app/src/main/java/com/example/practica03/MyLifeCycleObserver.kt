package com.example.practica03

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyLifeCycleObserver: DefaultLifecycleObserver {
    override fun onCreate(lifecycler: LifecycleOwner) {
        super.onCreate(lifecycler)
        Log.d("MylifeCyclerObserver","OnCreate");
    }

    override fun onStart(lifecycler: LifecycleOwner) {
        super.onStart(lifecycler)
        Log.d("MylifeCyclerObserver","OnStart");
    }

    override fun onPause(lifecycler: LifecycleOwner) {
        super.onPause(lifecycler)
        Log.d("MylifeCyclerObserver","OnPause")
    }

    override fun onResume(lifecycler: LifecycleOwner) {
        super.onResume(lifecycler)
        Log.d("MylifeCyclerObserver","OnResume")

    }

    override fun onStop(lifecycler: LifecycleOwner) {
        super.onStop(lifecycler)
        Log.d("MylifeCyclerObserver","OnStop")
    }

    override fun onDestroy(lifecycler: LifecycleOwner) {
        super.onDestroy(lifecycler)
        Log.d("MylifeCyclerObserver","OnDestroy")
    }
}