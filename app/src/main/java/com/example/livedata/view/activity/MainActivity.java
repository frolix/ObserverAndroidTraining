package com.example.livedata.view.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.livedata.R;
import com.example.livedata.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private MainViewModel mainViewModel;

    private EditText firsNumberEdit;
    private EditText secondNumberEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setListeners();
    }

    private void setListeners() {
        firsNumberEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!TextUtils.isEmpty(s.toString())){
                    int number = Integer.valueOf(s.toString());
                    mainViewModel.UpdateFirstNumber(number);
                }
            }
        });

        secondNumberEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!TextUtils.isEmpty(s.toString())){
                    int number = Integer.valueOf(s.toString());
                    mainViewModel.UpdateSecondNumber(number);
                }
            }
        });


    }

    private void init() {
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        firsNumberEdit = findViewById(R.id.first_number_edit);
        secondNumberEdit = findViewById(R.id.second_number_edit);

    }
}
