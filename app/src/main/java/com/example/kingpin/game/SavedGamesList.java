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


public class SavedGamesList extends Fragment {

    ListView listView;

    TextView gameName;
    TextView gameScore;

    Intent gameIntent;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        gameIntent = new Intent(this.getContext(), ViewGame.class);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listgames, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        listView = view.findViewById(R.id.listViewGames);


        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        String userId = user.getUid();

        DatabaseReference mRef = FirebaseDatabase.getInstance().getReference().child(userId).child("Games");

        final ArrayList<Game> list = new ArrayList<Game>();

//        final ArrayAdapter adapter = new ArrayAdapter<Game>(this.getContext(), R.layout.fragment_gamedetail, list);

        GameAdapter adapter = new GameAdapter(this.getContext(),
                R.layout.fragment_gamedetail, list);
        listView.setAdapter(adapter);

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Game g1 = snapshot.getValue(Game.class);
//                    String displayText = g1.
                    System.out.println(g1.getName());
                    System.out.println(g1.getTotalScore());
//                    list.add(snapshot.getValue().toString());
                    list.add(g1);

                }

                adapter.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Game g = list.get(position);
//                gameIntent.put
                gameIntent.putExtra("GAME_SELECTED", g);
                startActivity(gameIntent);
            }
        });



//        view.findViewById(R.id.homeBTN).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(ScoreSaved.this)
//                        .navigate(R.id.action_ScoreFragment_to_FirstFragment);
//            }
//        });


    }
}

//public class SavedGamesList extends AppCompatActivity {
//
//    ListView listView;
//
//    TextView gameName;
//    TextView gameScore;
//
//    Intent gameIntent;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_list_games);
//
//        listView = findViewById(R.id.listViewGames);
//
//
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//
//        String userId = user.getUid();
//
//        DatabaseReference mRef = FirebaseDatabase.getInstance().getReference().child(userId).child("Games");
//
//        final ArrayList<Game> list = new ArrayList<Game>();
//
////        final ArrayAdapter adapter = new ArrayAdapter<Game>(this.getContext(), R.layout.fragment_gamedetail, list);
//
//        GameAdapter adapter = new GameAdapter(this,
//                R.layout.fragment_gamedetail, list);
//        listView.setAdapter(adapter);
//
//        mRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                list.clear();
//                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
//                    Game g1 = snapshot.getValue(Game.class);
////                    String displayText = g1.
//                    System.out.println(g1.getName());
//                    System.out.println(g1.getTotalScore());
////                    list.add(snapshot.getValue().toString());
//                    list.add(g1);
//
//                }
//
//                adapter.notifyDataSetChanged();
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,
//                                    int position, long id) {
//                Game g = list.get(position);
////                gameIntent.put
//                gameIntent.putExtra("GAME_SELECTED", g);
//                startActivity(gameIntent);
//            }
//        });
//
//    }

//    @Override
//    public View onCreateView(
//            LayoutInflater inflater, ViewGroup container,
//            Bundle savedInstanceState
//    ) {
//        gameIntent = new Intent(this.getContext(), ViewGame.class);
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_listgames, container, false);
//    }
//
//    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//
//
//        listView = view.findViewById(R.id.listViewGames);
//
//
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//
//        String userId = user.getUid();
//
//        DatabaseReference mRef = FirebaseDatabase.getInstance().getReference().child(userId).child("Games");
//
//        final ArrayList<Game> list = new ArrayList<Game>();
//
////        final ArrayAdapter adapter = new ArrayAdapter<Game>(this.getContext(), R.layout.fragment_gamedetail, list);
//
//        GameAdapter adapter = new GameAdapter(this.getContext(),
//                R.layout.fragment_gamedetail, list);
//        listView.setAdapter(adapter);
//
//        mRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                list.clear();
//                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
//                    Game g1 = snapshot.getValue(Game.class);
////                    String displayText = g1.
//                    System.out.println(g1.getName());
//                    System.out.println(g1.getTotalScore());
////                    list.add(snapshot.getValue().toString());
//                    list.add(g1);
//
//                }
//
//                adapter.notifyDataSetChanged();
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,
//                                    int position, long id) {
//                Game g = list.get(position);
////                gameIntent.put
//                gameIntent.putExtra("GAME_SELECTED", g);
//                startActivity(gameIntent);
//            }
//        });
//
//
//
////        view.findViewById(R.id.homeBTN).setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                NavHostFragment.findNavController(ScoreSaved.this)
////                        .navigate(R.id.action_ScoreFragment_to_FirstFragment);
////            }
////        });
//
//
//    }
//}
