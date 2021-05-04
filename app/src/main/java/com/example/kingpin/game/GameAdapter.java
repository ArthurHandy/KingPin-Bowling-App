package com.example.kingpin.game;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.kingpin.R;

import java.util.List;

public class GameAdapter extends ArrayAdapter<Game> {
        private int resourceId;
        public GameAdapter(Context context, int textViewResourceId,
                           List<Game> objects) {
            super(context, textViewResourceId, objects);
            resourceId = textViewResourceId;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Game g = getItem(position);
//            View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            View view;
            ViewHolder viewHolder;
            if (convertView == null) {
                view = LayoutInflater.from(getContext()).inflate(resourceId, null);
                viewHolder = new ViewHolder();
                viewHolder.gameName = (TextView) view.findViewById(R.id.game_name);
                viewHolder.gameScore = (TextView) view.findViewById(R.id.game_score);
                view.setTag(viewHolder);
            } else {
                view = convertView;
                viewHolder = (ViewHolder) view.getTag();
            }
            viewHolder.gameName.setText(g.getName());
            viewHolder.gameScore.setText(g.getTotalScore());
            return view;
        }

        class ViewHolder{
            TextView gameName;
            TextView gameScore;
        }
}

