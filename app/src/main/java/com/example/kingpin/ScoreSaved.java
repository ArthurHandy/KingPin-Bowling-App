package com.example.kingpin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.kingpin.game.Game;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Objects;

public class ScoreSaved extends Fragment {


    TextView displayNameText;
    TextView displayScoreText;
    ListView listView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_score, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        displayNameText = view.findViewById(R.id.displayName);
        displayScoreText = view.findViewById(R.id.displayScore);

        listView = view.findViewById(R.id.listView);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        String userId = user.getUid();

        DatabaseReference mRef = FirebaseDatabase.getInstance().getReference().child(userId).child("Games");

        final ArrayList<String> list = new ArrayList<String>();

        final ArrayAdapter adapter = new ArrayAdapter<String>(this.getContext(), R.layout.fragment_gamedetail, list);
        listView.setAdapter(adapter);

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list.clear();
                for(DataSnapshot snapshot : dataSnapshot.getChildren()){
                    Game g1 = snapshot.getValue(Game.class);
//                    String displayText = g1.
                    System.out.println(g1.getName());
                    System.out.println(g1.getTotalScore());
//                    list.add(snapshot.getValue().toString());
//                    list.add(Objects.requireNonNull(g1).getName());
                   displayNameText.setText(g1.getName());
                   displayScoreText.setText(g1.getTotalScore());
                }

                adapter.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });




        view.findViewById(R.id.homeBTN).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ScoreSaved.this)
                        .navigate(R.id.action_ScoreFragment_to_FirstFragment);
            }
        });
    }
}
