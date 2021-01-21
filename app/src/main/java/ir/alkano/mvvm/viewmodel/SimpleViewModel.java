package ir.alkano.mvvm.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class SimpleViewModel extends ViewModel {
    private MutableLiveData<String> userId;

    public MutableLiveData<String> getUserId() {
        if (userId == null) {
            userId = new MutableLiveData<>();
            getRandomUserId();
        }
        return userId;
    }

    public void getRandomUserId() {
        Random random_id = new Random();
        userId.setValue("USER_ID : " + random_id.nextInt(2020 + 1399));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
