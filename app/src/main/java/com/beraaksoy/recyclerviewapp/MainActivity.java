package com.beraaksoy.recyclerviewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        RecyclerView.Adapter mAdapter = new MainAdapter(listStates());

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<State> listStates() {
        ArrayList<State> mStates = new ArrayList<>();
        mStates.add(new State("Virginia", R.drawable.virginia));
        mStates.add(new State("Maryland", R.drawable.virginia));
        mStates.add(new State("Oregon", R.drawable.virginia));
        mStates.add(new State("Delaware", R.drawable.virginia));
        mStates.add(new State("New York", R.drawable.virginia));
        mStates.add(new State("Idaho", R.drawable.virginia));
        mStates.add(new State("California", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("Virginia", R.drawable.virginia));
        mStates.add(new State("Maryland", R.drawable.virginia));
        mStates.add(new State("Oregon", R.drawable.virginia));
        mStates.add(new State("Delaware", R.drawable.virginia));
        mStates.add(new State("New York", R.drawable.virginia));
        mStates.add(new State("Idaho", R.drawable.virginia));
        mStates.add(new State("California", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("Virginia", R.drawable.virginia));
        mStates.add(new State("Maryland", R.drawable.virginia));
        mStates.add(new State("Oregon", R.drawable.virginia));
        mStates.add(new State("Delaware", R.drawable.virginia));
        mStates.add(new State("New York", R.drawable.virginia));
        mStates.add(new State("Idaho", R.drawable.virginia));
        mStates.add(new State("California", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("Virginia", R.drawable.virginia));
        mStates.add(new State("Maryland", R.drawable.virginia));
        mStates.add(new State("Oregon", R.drawable.virginia));
        mStates.add(new State("Delaware", R.drawable.virginia));
        mStates.add(new State("New York", R.drawable.virginia));
        mStates.add(new State("Idaho", R.drawable.virginia));
        mStates.add(new State("California", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        mStates.add(new State("New Orleans", R.drawable.virginia));
        return mStates;
    }
}
