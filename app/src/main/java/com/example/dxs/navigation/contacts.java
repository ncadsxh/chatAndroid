package com.example.dxs.navigation;

/**
 * Created by dxs on 3/8/2017.
 */

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class contacts extends Fragment{



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.contact, container, false);

        String names[] = {"a","b","c","a","b","c","a","b","c","a","b","c","a","b","c","a","b","c","a","b","c"};
        RelativeLayout contactLayout = (RelativeLayout)rootView.findViewById(R.id.contactRelativeLayout);
        ListView contactlistView = (ListView) rootView.findViewById(R.id.contactList);
        ListAdapter contactListAdapter = new contactAdapter(this.getContext(), names);
                //ArrayAdapter<String>(rootView.getContext(), android.R.layout.simple_list_item_1, names);
        contactlistView.setAdapter(contactListAdapter);

        contactlistView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String contactName = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(getContext(), contactName, Toast.LENGTH_SHORT).show();
                    }
                }
        );


       /* Button button2 = (Button)rootView.findViewById(R.id.button2);
        button2.setText("changed");*/


          /*
        ListAdapter newList = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,contactsNameList);
        ListView contactListView = (ListView)rootView.findViewById(R.id.contactList);
        contactListView.setAdapter(newList);




        //ListAdapter testAdapter = new ArrayAdapter<String>(this, contactList);
        ListAdapter contactListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contactsNameList);

    */



        return rootView;
    }




}
