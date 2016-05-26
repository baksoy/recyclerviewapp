package com.beraaksoy.recyclerviewapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private ArrayList<State> mStates;

    public MainAdapter(ArrayList<State> names) {
        mStates = names;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        State current = mStates.get(position);
        holder.mNameView.setText(current.getName());
        holder.mFlagView.setImageResource(current.getFlag());
    }

    @Override
    public int getItemCount() {
        return mStates.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mNameView;
        public ImageView mFlagView;

        public ViewHolder(View view) {
            super(view);
            mNameView = (TextView) view.findViewById(R.id.person_name);
            mFlagView = (ImageView) view.findViewById(R.id.state_flag);
        }
    }
}
