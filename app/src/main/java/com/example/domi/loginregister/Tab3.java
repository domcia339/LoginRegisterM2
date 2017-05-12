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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
            int position, long id){

                if(position==0){
                    //Toast.makeText(getActivity(), "First Item", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(getActivity(), ListOfActivity.class);
                    startActivity(intent);

                }else if (position==1){
                    Toast.makeText(getActivity(), "Second Item", Toast.LENGTH_SHORT).show();
                }else if (position==2){
                    Toast.makeText(getActivity(), "Third Item", Toast.LENGTH_SHORT).show();
                }
            }

        });


        return rootView;
    }

}
