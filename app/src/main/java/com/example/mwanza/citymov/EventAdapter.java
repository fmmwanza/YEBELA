package com.example.mwanza.citymov;

/**
 * Created by mwanza on 24/06/15.
 */
import com.example.mwanza.citymov.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class EventAdapter extends ArrayAdapter {

    private LayoutInflater inflater;

    public EventAdapter(Activity activity, String[] items){
        super(activity, R.layout.row_event, items);
        inflater = activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        return inflater.inflate(R.layout.row_event, parent, false);
    }

}
