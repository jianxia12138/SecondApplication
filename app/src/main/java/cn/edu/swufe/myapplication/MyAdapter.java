package cn.edu.swufe.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*class MyAdapter {
    public MyAdapter(MyList2Activity myList2Activity, int list_item, ArrayList<HashMap<String, String>> listItems) {

    }
}*/
public class MyAdapter extends ArrayAdapter{
    private static final String TAG = "MyAdapter";

    public MyAdapter(Context context,int resource,ArrayAdapter<HashMap<String,String>>list){
        super(context, resource , (List) list);
    }

    @NonNull
    @Override
    public View getView(int position , View convertView, ViewGroup parent){
        View itemView = convertView;
        if(itemView==null){
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Map<String,String> map = (Map<String, String>)getItem(position);
        TextView title = (TextView) itemView.findViewById(R.id.itemTitle);
        TextView detail = (TextView) itemView.findViewById(R.id.itemDetail);

        title.setText("Title:" + map.get("ItemTitle"));
        detail.setText("Detail:" + map.get("ItemDetail"));

        return itemView;
    }
}
