package com.example.hp.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView= findViewById(R.id.list);

        String[] title = {"one", "two", "three", "four", "five"," six", "seven", "eight", "nine", "ten"};
        int[] image = {R.drawable.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,
                R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,
                R.mipmap.ic_launcher_round,};


        ArrayList<SingleItem> items = new ArrayList <>();

       for(int i = 0; i<title.length; i++){
           SingleItem save = new SingleItem(title[i], image[i]);
           items.add(save);

       }

       CustomAdapter adapter = new CustomAdapter(MainActivity.this, R.layout.single_item, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                /*switch (position)
                {
                    case 0:
                        Toast.makeText(MainActivity.this, "item!!!!!!!!!!!!0", Toast.LENGTH_SHORT).show();
                }*/
                Toast.makeText(MainActivity.this, "item!!!!!!!!!!!! "+ new Integer(position+1), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
