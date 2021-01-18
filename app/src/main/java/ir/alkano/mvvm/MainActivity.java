package ir.alkano.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.TextView;

import ir.alkano.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //textView = findViewById(R.id.text_view);
        textView = binding.textView;

    }
}