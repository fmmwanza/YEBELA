package com.example.mwanza.citymov;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by mwanza on 04/02/16.
 */
public class Tab_upcoming extends Fragment {

    private ArrayAdapter eventItemArrayAdapter;
    private Context mCtx;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_upcoming, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        ListView mainListEvent = (ListView)getView().findViewById(R.id.list_event);

        eventItemArrayAdapter = new EventAdapter( getActivity(), new String[15]);

        mainListEvent.setAdapter(eventItemArrayAdapter);
//
        mainListEvent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent( getActivity(), Details.class);
                startActivity(intent);
            }
        });
    }
}
