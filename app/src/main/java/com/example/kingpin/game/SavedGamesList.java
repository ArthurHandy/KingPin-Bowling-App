package com.example.kingpin.game;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kingpin.ChartGame;
import com.example.kingpin.Constants;
import com.example.kingpin.R;
import com.example.kingpin.ScoreSaved;
import com.example.kingpin.game.Game;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.github.mikephil.charting.animation.Easing;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * SavedGamesList fragment displays the Game objects added by user
 */
public class SavedGamesList extends Fragment {

    /**
     * ListView listView to display games
     */
    ListView listView;

    //Declare Intent gameIntent
    Intent gameIntent;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        //gameIntent from ViewGame class
        gameIntent = new Intent(this.getContext(), ViewGame.class);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listgames, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Initialize listView
        listView = view.findViewById(R.id.listViewGames);


        //Get user form Firebase
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        //Get UserId
        String userId = user.getUid();

        //mref is database reference for Games
        DatabaseReference mRef = FirebaseDatabase.getInstance().getReference().child(userId).child("Games");

        //ArrayList of Game objects
        final ArrayList<Game> list = new ArrayList<Game>();

        //GameAdapter for listView based on fragment_gamedetail
        GameAdapter adapter = new GameAdapter(this.getContext(),
                R.layout.fragment_gamedetail, list);
        listView.setAdapter(adapter);

        //mRef for all Game objects
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list.clear();
                //For all "Games"
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Game g1 = snapshot.getValue(Game.class);
                    System.out.println(g1.getName());
                    System.out.println(g1.getTotalScore());;
                    list.add(g1);

                }

                adapter.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        /**
         * Select a Game in the listView to display their charts
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Game g = list.get(position);
                gameIntent.putExtra("GAME_SELECTED", g);
                startActivity(gameIntent);
            }
        });


    }
}
