package com.example.livedata.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<Integer> firstNumber;
    private MutableLiveData<Integer> secondNumber;

    public MainViewModel() {
        firstNumber = new MutableLiveData<>();
        secondNumber = new MutableLiveData<>();

        firstNumber.setValue(0);
        secondNumber.setValue(0);
    }

    public MutableLiveData<Integer> getFirstNumber() {
        return firstNumber;
    }

    public MutableLiveData<Integer> getSecondNumber() {
        return secondNumber;
    }


    public void UpdateFirstNumber(int newValue){
        firstNumber.setValue(newValue);
    }
    public void UpdateSecondNumber(int newValue){
        secondNumber.setValue(newValue);
    }

}
