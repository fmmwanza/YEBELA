package com.example.mwanza.citymov;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {

    private ArrayAdapter eventItemArrayAdapter;
    private Toolbar toolbar;
    public ListView mainListEvent;
    private Context mCtx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ActionBar actionBar = getActionBar();
        toolbar = (Toolbar) findViewById(R.id.toolbar_list); // Attaching the layout to the toolbar object
        setSupportActionBar(toolbar);

        mCtx = this; // save my context
        ListView mainListEvent = (ListView)findViewById(R.id.list_event);

        eventItemArrayAdapter = new EventAdapter(this, new String[15]);

        mainListEvent.setAdapter(eventItemArrayAdapter);

        mainListEvent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(mCtx, Details.class);
                startActivity(intent);
            }
        });

    }

//    @Override
//    protected void onListItemClick(ListView l, View v, int position, long id) {
//        Intent intent = new Intent(this, Details.class);
//        startActivity(intent);
//    }



}
