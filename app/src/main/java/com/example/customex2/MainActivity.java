package com.example.customex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] maintitle ={
            "California","Harrisburg",
            "New York City","Statue of Liberty",
            "Texas",
    };

    String[] subtitle ={
            "Description 1","Description 2",
            "Description 3","Description 4",
            "Description 5",
    };

    Integer[] imgid={
            R.drawable.cali,R.drawable.harrisburg,
            R.drawable.new_york,R.drawable.soliberty,
            R.drawable.texas,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter = new MyListAdapter(this,maintitle,subtitle,imgid);
        list = findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Toast.makeText(getApplicationContext(),"You have selected first option",Toast.LENGTH_LONG).show();
                }

                if(i==1){
                    Toast.makeText(getApplicationContext(),"You have selected second option",Toast.LENGTH_LONG).show();
                }

                if(i==2){
                    Toast.makeText(getApplicationContext(),"You have selected third option",Toast.LENGTH_LONG).show();
                }

                if(i==3){
                    Toast.makeText(getApplicationContext(),"You have selected fourth option",Toast.LENGTH_LONG).show();
                }

                if(i==4){
                    Toast.makeText(getApplicationContext(),"You have selected fifth option",Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}
