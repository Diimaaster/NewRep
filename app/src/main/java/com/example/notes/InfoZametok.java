package com.example.notes;

import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class InfoZametok extends Fragment {
   public static final String ARG_INDEX = "arg_index";

   public static InfoZametok newInstance(int index){
       InfoZametok fragment = new InfoZametok();
       Bundle bundle = new Bundle();
       bundle.putInt(ARG_INDEX, index);
       fragment.setArguments(bundle);
       return fragment;
   }

   private TextView textView;

   @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
       super.onViewCreated(view,savedInstanceState);
       textView = view.findViewById(R.id.tv_info);
   }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(getArguments() != null){
            int index = getArguments().getInt(ARG_INDEX);
            TypedArray array = getResources().obtainTypedArray(R.array.info);
            int textid = array.getResourceId(index,0);
            textView.setText(textid);
        }
    }
}