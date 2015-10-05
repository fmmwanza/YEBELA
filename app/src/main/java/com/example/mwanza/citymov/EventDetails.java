package com.example.mwanza.citymov;

/**
 * Created by mwanza on 03/07/15.
 */

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class EventDetails extends ListActivity{


    private ArrayAdapter eventItemArrayAdapter;

    public EventDetails(){
        eventItemArrayAdapter = new EventAdapter(this, new String[15]);
        setListAdapter(eventItemArrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        TextView t = (TextView) v.findViewById(R.id.eventTitle);
        t.setText("Event clicked ... oh oh oh oh");
    }
}
