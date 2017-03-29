package com.example.dxs.navigation;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dxs on 3/17/2017.
 */

public class contactAdapter extends ArrayAdapter<String>{

    public contactAdapter(@NonNull Context context, String [] contacts) {
        super(context, R.layout.contactrow, contacts);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater contactInflater = LayoutInflater.from(getContext());
        View customView = contactInflater.inflate(R.layout.contactrow,parent,false);


        String contactName = getItem(position);
        TextView contactText = (TextView) customView.findViewById(R.id.contactTextView);
        ImageView contactImage = (ImageView) customView.findViewById(R.id.contactPicView);

        contactText.setText(contactName);
        contactImage.setImageResource(R.drawable.contactpic);

        return customView;
        //return super.getView(position, convertView, parent);
    }
}
