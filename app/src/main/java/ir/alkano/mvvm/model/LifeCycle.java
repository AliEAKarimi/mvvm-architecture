package ir.alkano.mvvm.model;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class LifeCycle implements LifecycleObserver {
    private static final String TAG = "Life Cycle";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        Log.d(TAG, "ON_CREATE: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        Log.d(TAG, "ON_DESTROY: ");
    }
}
