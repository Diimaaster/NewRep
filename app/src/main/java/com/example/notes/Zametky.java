package com.example.notes;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Zametky extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_zametky, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle sevedInstanceState){
        super.onViewCreated(view,sevedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        String[] array = getResources().getStringArray(R.array.name);

        for(int i = 0; i < array.length; i++){
            String name = array[i];
            TextView textView = new TextView(linearLayout.getContext());
            textView.setText(name);
            textView.setTextSize(60f);
            linearLayout.addView(textView);
        }
    }

}