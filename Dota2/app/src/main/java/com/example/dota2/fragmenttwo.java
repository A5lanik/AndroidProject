package com.example.dota2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class fragmenttwo extends Fragment {
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_fragmenttwo, container, false);
        textView=view.findViewById(R.id.text2);
        textView.setText("Warner Bros.\n" +
                "Sony Pictures Motion Picture Group\n" +
                "Walt Disney Studios\n" +
                "Universal Pictures\n" +
                "20th Century Fox\n" +
                "Paramount Pictures\n" +
                "Lionsgate Films\n" +
                "The Weinstein Company\n" +
                "Metro-Goldwyn-Mayer Studios\n" +
                "DreamWorks Pictures");
        return view;
    }





}
