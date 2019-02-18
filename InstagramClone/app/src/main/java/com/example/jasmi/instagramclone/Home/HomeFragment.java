package com.example.jasmi.instagramclone.Home;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.os.Bundle;
import com.example.jasmi.instagramclone.R;

public class HomeFragment extends Fragment {
    private static final String TAG = "HomeFragment";

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        return view;
    }
}
