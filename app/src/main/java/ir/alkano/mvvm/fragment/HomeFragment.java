package ir.alkano.mvvm.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import ir.alkano.mvvm.R;

public class HomeFragment extends Fragment {
    private Button showDetailBtn;

    public HomeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        showDetailBtn = view.findViewById(R.id.show_detail_btn);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showDetailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("Key", "AlKaNo");
                //NavDirections navDirections = HomeFragmentDirections.actionHomeFragmentToDetailFragment();
                //Navigation.findNavController(showDetailBtn).navigate(navDirections);
                Navigation.findNavController(showDetailBtn).navigate(R.id.action_homeFragment_to_detailFragment, bundle);
            }
        });
    }
}
