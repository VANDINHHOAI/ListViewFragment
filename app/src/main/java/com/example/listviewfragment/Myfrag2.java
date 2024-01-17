package com.example.listviewfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Myfrag2 extends Fragment {
    TextView t;

    public Myfrag2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_myfrag2, container, false);
        t = (TextView) v.findViewById(R.id.tex1);
        Bundle b = getArguments();
        if (b != null) {
            String s = b.getString("s");
            t.setText(s);
        }
        return v;
    }
}