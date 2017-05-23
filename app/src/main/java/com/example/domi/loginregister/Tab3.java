package com.example.domi.loginregister;

import android.content.Intent;
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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Domi on 10.05.2017.
 */

public class Tab3 extends Fragment {


    public Tab3() {

    }

    public Tables tables = new Tables();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.mainMenu); //mainMenu in xml

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                tables.menuItems
        );

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id){

                if(position==0){
                    tables.postab3=position;
                    Toast.makeText(getActivity(), "First Item"+ tables.postab3, Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(getActivity(), ListOfSmallActivity.class);
                    startActivity(intent);

                }else if (position==1){
                    tables.postab3=position;
                    Toast.makeText(getActivity(), "Second Item"+ tables.postab3, Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(getActivity(), ListOfSmallActivity.class);
                    startActivity(intent);
                }else if (position==2){
                    tables.postab3=position;
                    Toast.makeText(getActivity(), "Third Item"+ tables.postab3, Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(getActivity(), ListOfSmallActivity.class);
                    startActivity(intent);
                }
            }

        });
        return rootView;
    }

}
