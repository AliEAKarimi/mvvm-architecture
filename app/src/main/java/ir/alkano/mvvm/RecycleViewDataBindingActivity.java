package ir.alkano.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import ir.alkano.mvvm.databinding.ActivityRecycleViewDataBindingBinding;

public class RecycleViewDataBindingActivity extends AppCompatActivity {
    private ActivityRecycleViewDataBindingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_recycle_view_data_binding);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycle_view_data_binding);

    }
}