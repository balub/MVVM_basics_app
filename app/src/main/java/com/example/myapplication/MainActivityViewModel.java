package com.example.myapplication;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    public int getButtonClick() {
        return buttonClick;
    }

    private int buttonClick =0;

    public int increase(){
        return buttonClick++;
    }

}
