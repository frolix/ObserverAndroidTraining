package com.example.livedata.view.fragment;


import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.livedata.R;
import com.example.livedata.viewmodel.MainViewModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends Fragment {
    protected MainViewModel model;
    int firstNumber;
    int secondNumber;

    TextView result;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        model = ViewModelProviders.of(getActivity()).get(MainViewModel.class);

    }

    public ResultFragment() {
        // Required empty public constructor
    }


}
