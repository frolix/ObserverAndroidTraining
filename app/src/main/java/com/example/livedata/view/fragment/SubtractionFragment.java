package com.example.livedata.view.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.livedata.R;
import com.example.livedata.viewmodel.MainViewModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class SubtractionFragment extends ResultFragment {


    public SubtractionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_subtraction, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        observe();
    }

    private void observe() {
        model.getFirstNumber().observe(this,number ->{
            if (number != null){
                firstNumber = number;
                result.setText(String.valueOf(firstNumber - secondNumber));
            }
        });
        model.getSecondNumber().observe(this,number->{
            if (number != null){
                secondNumber = number;
                result.setText(String.valueOf(firstNumber-secondNumber));
            }
        });
    }

    private void init(View view) {
        result = view.findViewById(R.id.substraction_result);
    }

}
