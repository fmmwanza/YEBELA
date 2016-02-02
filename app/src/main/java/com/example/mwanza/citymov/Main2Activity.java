package com.example.mwanza.citymov;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatCallback;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toolbar;


public class Main2Activity extends ListActivity {

    private ArrayAdapter eventItemArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        delegate = AppCompatDelegate.create(this, this);
//        delegate.onCreate(savedInstanceState);
//        delegate.setContentView(R.layout.activity_main2);

        setContentView(R.layout.activity_main2);

        eventItemArrayAdapter = new EventAdapter(this, new String[15]);
        setListAdapter(eventItemArrayAdapter);

//        Toolbar toolbar= (Toolbar) findViewById(R.id.my_awesome_toolbar);
//        delegate.setSupportActionBar(toolbar);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(this, Details.class);
        startActivity(intent);

    }



}
