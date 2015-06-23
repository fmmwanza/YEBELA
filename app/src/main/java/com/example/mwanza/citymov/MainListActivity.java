package com.example.mwanza.citymov;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainListActivity extends Activity {

    private ListView eventListView;
    private String[] stringArray ;
    private ArrayAdapter eventItemArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        stringArray = new String[10];
        for (int i = 0; i < stringArray.length; i++){
            stringArray[i] = "String" + i;
        }

        eventItemArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, stringArray);
        eventListView = (ListView) findViewById(R.id.listViewId);
        eventListView.setAdapter(eventItemArrayAdapter);
    }

}
