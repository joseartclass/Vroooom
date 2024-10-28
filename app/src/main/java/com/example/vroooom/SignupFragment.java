package com.example.vroooom;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.vroooom.ui.home.HomeFragment;


public class SignupFragment extends Fragment {
    public SignupFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_signup, container, false);

        Button signupBtn = view.findViewById(R.id.signupbtn);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLogin();
            }
        });

        return view;
    }

    public void goLogin() {

        LoginFragment loginFrag = new LoginFragment();
        String firstName = ((EditText) getView().findViewById(R.id.fname)).getText().toString();
        String lastName = ((EditText) getView().findViewById(R.id.lname)).getText().toString();
        String Email = ((EditText) getView().findViewById(R.id.email)).getText().toString();
        String contact = ((EditText) getView().findViewById(R.id.contact)).getText().toString();
        String Password = ((EditText) getView().findViewById(R.id.password)).getText().toString();

        // Replace the current fragment with HomeFragment
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView, loginFrag)  // 'fragment_container' is the FrameLayout in activity_main.xml where fragments are loaded
                .addToBackStack(null)  // Optionally add to backstack so user can navigate back
                .commit();
    }

}