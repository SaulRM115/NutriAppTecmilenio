package com.example.tecmilenio_nutriapp.ui.CuadroDS;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CuadroDSViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CuadroDSViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}