package com.example.mwanza.citymov;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;



//public class Main2Activity extends ListActivity {

public class Main2Activity extends ListActivity {

    private ArrayAdapter eventItemArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        eventItemArrayAdapter = new EventAdapter(this, new String[15]);
        setListAdapter(eventItemArrayAdapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(this, Details.class);
        startActivity(intent);

    }
}
