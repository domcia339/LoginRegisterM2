package com.example.domi.loginregister;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Domi on 10.05.2017.
 */

public class Tab3 extends Fragment {


    public  Tab3(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3, container, false);
        String[] menuItems= {"lala", "kkkkkk", "jjjjjj"};

        ListView listView= (ListView) rootView.findViewById(R.id.mainMenu);

        ArrayAdapter<String> listViewAdapter= new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, menuItems);

        listView.setAdapter(listViewAdapter);


        return rootView;
    }

}
