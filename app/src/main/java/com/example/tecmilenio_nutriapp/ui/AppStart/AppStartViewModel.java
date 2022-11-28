package com.example.tecmilenio_nutriapp.ui.AppStart;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AppStartViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AppStartViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}