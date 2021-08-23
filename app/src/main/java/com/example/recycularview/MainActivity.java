package com.example.recycularview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecyclerView();

    }

    private void initData()
    {
        userList=new ArrayList<>();
        userList.add(new ModelClass(R.drawable.rajasri,"Rajasri"," 10:45Am",
                "Hello, How Are you??","---------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.lik,"Madhuuu"," 10:45Am",
                "Hello..","---------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.shazu,"Shazuuu"," 10:45Am",
                "hiiiii","---------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.rosh,"Roshni"," 10:45Am",
                "Are you fine??","---------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.ishu,"Ishwarya"," 10:45Am",
                "Hello, How Are you??","---------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.rajasri,"Raji"," 10:45Am",
                "hiiii","---------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.rajasri,"Rajasri"," 10:45Am",
                "Hello, How Are you??","---------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.lik,"Madhuuu"," 10:45Am",
                "Hello..","---------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.shazu,"Shazuuu"," 10:45Am",
                "hiiiii","---------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.rosh,"Roshni"," 10:45Am",
                "Are you fine??","---------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.ishu,"Ishwarya"," 10:45Am",
                "Hello, How Are you??","---------------------------------------------------------------"));
        userList.add(new ModelClass(R.drawable.rajasri,"Raji"," 10:45Am",
                "hiiii","---------------------------------------------------------------"));
    }

    private void initRecyclerView()
    {
        recyclerView=findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(this );
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}