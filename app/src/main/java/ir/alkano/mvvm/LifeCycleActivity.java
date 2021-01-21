package ir.alkano.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ir.alkano.mvvm.model.LifeCycle;

public class LifeCycleActivity extends AppCompatActivity {
    private LifeCycle lifeCycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        lifeCycle = new LifeCycle();
        lifeCycle.onCreate();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        lifeCycle.onDestroy();
    }
}