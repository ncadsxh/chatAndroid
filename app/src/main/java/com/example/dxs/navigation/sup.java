package com.example.dxs.navigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by dxs on 3/8/2017.
 */


public class sup extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sup, container, false);
        WebView web = (WebView) rootView.findViewById(R.id.crepemeetsbing);
        web.loadUrl("www.crepemeetsbing.com");

        return rootView;
    }

}