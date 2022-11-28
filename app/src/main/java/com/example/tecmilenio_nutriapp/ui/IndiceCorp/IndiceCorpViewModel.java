package com.example.tecmilenio_nutriapp.ui.IndiceCorp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IndiceCorpViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public IndiceCorpViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}