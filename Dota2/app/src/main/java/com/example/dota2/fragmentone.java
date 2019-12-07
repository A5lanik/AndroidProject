package com.example.dota2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class fragmentone extends Fragment {
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_fragmentone, container, false);
        textView=view.findViewById(R.id.text);
        textView.setText("Movies,  are a type of visual communication \n" +
                "which uses moving pictures and soundto tell \n" +
                "stories or teach peoplesomething.People in \n" +
                "every part of the world watch movies as a \n" +
                "type of entertainment,a way to have fun. \n" +
                "For some people,fun movies can mean movies\n" +
                "that make them laugh,while for others it \n" +
                "can mean movies that make them cry, or feel\n" +
                "afraid. ");
        return view;
    }


}
