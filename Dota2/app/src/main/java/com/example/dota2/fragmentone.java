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
        textView.setText("Movies,  are a type of visual communication which uses moving pictures and sound to\n" +
                "tell stories or teach peoplesomething.People in every part of the world watch \n" +
                "movies as a type of entertainment,a way to have fun. For some people,fun movies can\n" +
                "mean movies that make them laugh,while for others it can mean movies that make \n" +
                "them cry, or feel afraid. ");
        return view;
    }


}
