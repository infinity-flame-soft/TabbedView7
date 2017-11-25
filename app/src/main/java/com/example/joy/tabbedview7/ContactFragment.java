package com.example.joy.tabbedview7;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by joy on 11/23/17.
 */

public class ContactFragment extends Fragment {


    private View view;
    private TextView textView;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_contact,container,false);

        //---------------initialize--------------------------------------------
        textView=view.findViewById(R.id.text);
        button=view.findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText("ouch !!!");


            }
        });




        return view;


    }
}
