package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.str.MStudent;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<MStudent> mStrList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivPicture;
        public TextView tvSchool;
        public TextView tvName;
        public TextView tvBirthYear;

        public ViewHolder(View view) {
            super(view);
            ivPicture = view.findViewById(R.id.ivPicture);
            tvSchool = view.findViewById(R.id.tvSchool);
            tvName = view.findViewById(R.id.tvName);
            tvBirthYear = view.findViewById(R.id.tvBirthYear);
        }

        public ImageView getIvPicture() {
            return ivPicture;
        }

        public TextView getTvSchool() {
            return tvSchool;
        }

        public TextView getTvName() {
            return tvName;
        }

        public TextView getTvBirthYear() {
            return tvBirthYear;
        }
    }

    public CustomAdapter(List<MStudent> dataSet) {
        mStrList = dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.tvName.setText(mStrList.get(position).mName);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mStrList.size();
    }

}
