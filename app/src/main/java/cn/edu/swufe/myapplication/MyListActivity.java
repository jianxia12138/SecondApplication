package cn.edu.swufe.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MyListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    List<String> data = new ArrayList<String>();
    private String TAG = "MyList";
    ArrayAdapter adapter;
    private AdapterView listv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        ListView listView = findViewById(R.id.mylist);
        //init data
        for(int i=0;i<10;i++){
            data.add("item" + i );
        }

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
        listView.setEmptyView(findViewById(R.id.nodata));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i(TAG,"onItemClick: position=" + position);
        Log.i(TAG,"onItemClick: parent=" + parent);
        adapter.remove(listv.getItemAtPosition(position));
        //adapter.notifyDataSetChanged();

    }
}
