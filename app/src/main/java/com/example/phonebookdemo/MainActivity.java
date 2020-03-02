package com.example.phonebookdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Student> studentDatalist;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerViewId);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        studentDatalist=new ArrayList<>();
        studentDatalist.add(new Student("Abdullah","Dhaka","01994215664",R.drawable.person,R.drawable.phone,R.drawable.message));
        studentDatalist.add(new Student("Tusar","Dhaka","01994215664",R.drawable.person,R.drawable.phone,R.drawable.message));
        studentDatalist.add(new Student("Noman","Dhaka","01994215664",R.drawable.person,R.drawable.phone,R.drawable.message));
        studentDatalist.add(new Student("Avijit","Dhaka","01994215664",R.drawable.person,R.drawable.phone,R.drawable.message));
        studentDatalist.add(new Student("Robi","Dhaka","01994215664",R.drawable.person,R.drawable.phone,R.drawable.message));
        studentDatalist.add(new Student("Redoy","Dhaka","01994215664",R.drawable.person,R.drawable.phone,R.drawable.message));


        customAdapter=new CustomAdapter(MainActivity.this,studentDatalist);

        recyclerView.setAdapter(customAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);

        MenuItem menuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                customAdapter.getFilter().filter(newText);
                return true;
            }
        });



        return true;
    }
}
