package ir.alkano.mvvm;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import ir.alkano.mvvm.databinding.ActivitySimpleDataBindingBinding;
import ir.alkano.mvvm.model.User;

public class SimpleDataBindingActivity extends AppCompatActivity {
    private TextView textView;
    private ActivitySimpleDataBindingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_simple_data_binding);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_data_binding);

        //textView = findViewById(R.id.text_view);
        textView = binding.textView;

        User user = new User();
        user.setName("Ali Karimi");
        user.setEmail("alieakarimi@gmail.com");
        binding.setUser(user);

    }
}