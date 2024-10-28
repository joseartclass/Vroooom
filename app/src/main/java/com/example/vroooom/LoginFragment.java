package com.example.vroooom;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class LoginFragment extends Fragment {

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        // Find button and set onClickListener
        Button loginButton = view.findViewById(R.id.button2);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMain(v);
            }
        });

        return view;
    }

    public void goToMain(View v) {
        // Get email and password values (if needed)
        String Email = ((EditText) getView().findViewById(R.id.emailInput)).getText().toString();
        String Password = ((EditText) getView().findViewById(R.id.passwordInput)).getText().toString();

        // Create Intent to redirect to MainActivity
        Intent i = new Intent(getActivity(), MainActivity.class);
        startActivity(i);
    }
}
