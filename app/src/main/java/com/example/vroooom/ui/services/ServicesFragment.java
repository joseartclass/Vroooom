package com.example.vroooom.ui.services;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.vroooom.R;
import com.example.vroooom.databinding.FragmentHomeBinding;

public class ServicesFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_services, container, false);

        return view;
    }


}