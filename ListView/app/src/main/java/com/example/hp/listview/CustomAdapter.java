package com.example.hp.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HP on 12/23/2017.
 */

public class CustomAdapter extends ArrayAdapter<SingleItem> {

    private ArrayList<SingleItem> items;
    private int singleLayout;
    private Context context;

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<SingleItem> items) {
        super(context, resource, items);

        this.items = items;
        this.singleLayout = resource;
        this.context = context;
    }

    static class ViewHolder {
        TextView title;
        ImageView icon;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView==null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.single_item, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.title = convertView.findViewById(R.id.textView);
            viewHolder.icon = convertView.findViewById(R.id.imageView);


            convertView.setTag(viewHolder);

        }else viewHolder = (ViewHolder) convertView.getTag();


        SingleItem singleItem = items.get(position);

        String title = singleItem.getTitle();

        viewHolder.title.setText(title);
        viewHolder.icon.setImageResource(items.get(position).getThumb());


        return convertView;
    }
}
