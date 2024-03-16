package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

public class ThirdFragment extends Fragment {
    public ThirdFragment() {
        super(R.layout.fragment_third);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        TextView textView = view.findViewById(R.id.TextViewFifth);
        getParentFragmentManager().setFragmentResultListener("Key1", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle bundle) {
                String result = bundle.getString("bundleKey1");
                textView.setText(result);
            }
        });
        return view;
    }
}