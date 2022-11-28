package com.example.tecmilenio_nutriapp.ui.EstimacionGET;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GetViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}