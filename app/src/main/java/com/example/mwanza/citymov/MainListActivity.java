package com.example.mwanza.citymov;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;


public class MainListActivity extends Activity {

    private ListView eventListView;
    private ArrayAdapter eventItemArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        eventItemArrayAdapter = new EventAdapter(this, new String[15]);

      //  eventItemArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, stringArray);
        eventListView = (ListView) findViewById(R.id.eventList);
        eventListView.setAdapter(eventItemArrayAdapter);
    }

}
