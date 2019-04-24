package com.example.livedata.view.fragment;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.livedata.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DevideFragment extends ResultFragment {


    public DevideFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_devide, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        observer();

    }

    @SuppressLint("SetTextI18n")
    private void observer() {
        model.getFirstNumber().observe(this,number->{
            if (number != null){
                firstNumber = number;
                try {
                    result.setText(String.valueOf(firstNumber/secondNumber));
                }catch (Exception e){
                    result.setText(getString(R.string.zero_error));
                }
            }
        });
        model.getSecondNumber().observe(this,number->{
            if (number != null){
                secondNumber = number;
                try {
                    result.setText(String.valueOf(firstNumber/secondNumber));
                }catch (Exception e){
                    result.setText(getString(R.string.zero_error));
                }
            }
        });
    }

    private void init(View view) {
        result = view.findViewById(R.id.divide_result);
    }
}
