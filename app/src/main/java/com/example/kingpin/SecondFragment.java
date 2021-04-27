package com.example.kingpin;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

//import androidx.navigation.fragment.navArgs;


public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @SuppressLint("StringFormatInvalid")
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        Integer count = SecondFragmentArgs.fromBundle(getArguments()).getMyArg();
//        @SuppressLint("StringFormatMatches") String countText = getString(R.string.random_heading, count);
//        TextView headerView = view.getRootView().findViewById(R.id.textview_header);
//        headerView.setText(countText);
//
//        Random random = new java.util.Random();
//        Integer randomNumber = 0;
//        if (count > 0) {
//            randomNumber = random.nextInt(count + 1);
//        }
//
//        TextView randomView = view.getRootView().findViewById(R.id.textview_random);
//        randomView.setText(randomNumber.toString());

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }
}