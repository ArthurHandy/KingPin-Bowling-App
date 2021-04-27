package com.example.kingpin;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

//import androidx.navigation.fragment.navArgs;


public class EnterScore extends Fragment {

    // array of scores  fram 1 --> 10
    private final int [] arrayScores =  new int[20];

    private int totalScore = 0;
    int num=0;
    int num1=0, num2=0;

    int numScore=0;

    //frame scores
    EditText frame1_roll1;
    EditText frame1_roll2;

    Button frame_BTN1;

    EditText frame2_roll1;
    EditText frame2_roll2;

    Button frame_BTN2;

    EditText frame3_roll1;
    EditText frame3_roll2;

    Button frame_BTN3;

    EditText frame4_roll1;
    EditText frame4_roll2;

    Button frame_BTN4;

    EditText frame5_roll1;
    EditText frame5_roll2;

    Button frame_BTN5;

    EditText frame6_roll1;
    EditText frame6_roll2;

    Button frame_BTN6;

    EditText frame7_roll1;
    EditText frame7_roll2;

    Button frame_BTN7;

    EditText frame8_roll1;
    EditText frame8_roll2;

    Button frame_BTN8;

    EditText frame9_roll1;
    EditText frame9_roll2;

    Button frame_BTN9;

    EditText frame10_roll1;
    EditText frame10_roll2;

    Button frame_BTN10;

    TextView bottomScore;



//    Button mButton;
//    EditText mEdit;
//    TextView mText;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.enter_score, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


//        setContentView(R.layout.enter_score);

//        int score = calcScore(view, frame1_roll1, frame1_roll2, totalScore);

//        mButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                frame1_roll1   = (EditText)view.findViewById(R.id.frame1_roll1);
//                mText = (TextView)view.findViewById(R.id.totalScore);
//                mText.setText(frame1_roll1.getEditableText());
//            }
//        });

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

//        view.findViewById(R.id.frame1BTN).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        view.findViewById(R.id.savescoreBTN).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                NavHostFragment.findNavController(EnterGame.this)
//                        .navigate(R.id.action_EnterFragment_to_FirstFragment);

//                int r1 = Integer.parseInt(frame1_roll1.getText().toString());
//                int r2 = Integer.parseInt(frame1_roll2.getText().toString());
//                String score = String.valueOf(r1+r2);
//                String score = String.valueOf(calcScore(view, frame1_roll1, frame1_roll2, totalScore));





            }
        });

        bottomScore = view.findViewById(R.id.totalScore);

//        frame1_roll1 = view.findViewById(R.id.frame1_roll1);
//        frame1_roll2 = view.findViewById(R.id.frame1_roll2);
//        frame_BTN1 = view.findViewById(R.id.frame1BTN);
//
//        totalScore += displayScore(view, frame1_roll1, frame1_roll2, frame_BTN1, totalScore,0);
//        dScore(view, frame_BTN1, totalScore,0);
//
//
//        frame2_roll1 = view.findViewById(R.id.frame2_roll1);
//        frame2_roll2 = view.findViewById(R.id.frame2_roll2);
//        frame_BTN2 = view.findViewById(R.id.frame2BTN);
//
//        totalScore += displayScore(view, frame2_roll1, frame2_roll2, frame_BTN2, totalScore,2);
//
//        dScore(view, frame_BTN2, totalScore,2);
//
//
//        frame3_roll1 = view.findViewById(R.id.frame3_roll1);
//        frame3_roll2 = view.findViewById(R.id.frame3_roll2);
//        frame_BTN3 = view.findViewById(R.id.frame3BTN);
//
//        totalScore += displayScore(view, frame3_roll1, frame3_roll2, frame_BTN3, totalScore,4);
//
//
//        frame4_roll1 = view.findViewById(R.id.frame4_roll1);
//        frame4_roll2 = view.findViewById(R.id.frame4_roll2);
//        frame_BTN4 = view.findViewById(R.id.frame4BTN);
//
//        totalScore += displayScore(view, frame4_roll1, frame4_roll2, frame_BTN4, totalScore,3);
//
//        frame5_roll1 = view.findViewById(R.id.frame5_roll1);
//        frame5_roll2 = view.findViewById(R.id.frame5_roll2);
//        frame_BTN5 = view.findViewById(R.id.frame5BTN);
//
//        totalScore += displayScore(view, frame5_roll1, frame5_roll2, frame_BTN5, totalScore,4);
//
//        frame6_roll1 = view.findViewById(R.id.frame6_roll1);
//        frame6_roll2 = view.findViewById(R.id.frame6_roll2);
//        frame_BTN6 = view.findViewById(R.id.frame6BTN);
//
//        totalScore += displayScore(view, frame6_roll1, frame6_roll2, frame_BTN6, totalScore,5);
//
//
//        frame7_roll1 = view.findViewById(R.id.frame7_roll1);
//        frame7_roll2 = view.findViewById(R.id.frame7_roll2);
//        frame_BTN7 = view.findViewById(R.id.frame7BTN);
//
//        frame8_roll1 = view.findViewById(R.id.frame8_roll1);
//        frame8_roll2 = view.findViewById(R.id.frame8_roll2);
//        frame_BTN8 = view.findViewById(R.id.frame8BTN);
//
//        frame9_roll1 = view.findViewById(R.id.frame9_roll1);
//        frame9_roll2 = view.findViewById(R.id.frame9_roll2);
//        frame_BTN9 = view.findViewById(R.id.frame9BTN);
//
//        frame10_roll1 = view.findViewById(R.id.frame10_roll1);
//        frame10_roll2 = view.findViewById(R.id.frame10_roll2);
//        frame_BTN10 = view.findViewById(R.id.frame10BTN);

//        String score = String.valueOf(totalScore);
//        bottomScore.setText(score);

//        frame1_roll1.setOnKeyListener(new View.OnKeyListener() {
//            public boolean onKey(View v, int keyCode, KeyEvent event) {
//                if(KeyEvent.KEYCODE_ENTER == keyCode) {
//                    j.requestFocus();
//                    if(frame1_roll1.getText().toString()!=""){
//                        int r1= Integer.parseInt(frame1_roll1.getText().toString());
//                    }
//
//            }
//        });

//        frame1_roll2.setOnKeyListener(new View.OnKeyListener() {
//            public boolean onKey(View v, int keyCode, KeyEvent event) {
//                if(KeyEvent.KEYCODE_ENTER == keyCode) {
////                    j.requestFocus();
//                    if(frame1_roll1.getText().toString()!="")
//                        num = Integer.parseInt(frame1_roll1.getText().toString());
//                    if (num >= 0 && num <= 10) {
////                        bottomScore.setText(String.valueOf(num));
//
//                        String score = String.valueOf(calcScore(view, frame1_roll1, frame1_roll2, totalScore));
//
//
//                        bottomScore.setText(score);
//                    }
//                    return true;
//                }
//                else
//                {
//                    return false;
//                }
//
//            }
//        });


    }


        public int calcScore(View view, EditText roll1, EditText roll2) {
        // Get the value of the text view
//        String sR1 = (EditText)findViewById(R.id.frame1_roll1);

        int r1 = Integer.parseInt(roll1.getText().toString());
        int r2 = Integer.parseInt(roll2.getText().toString());

        int subTotalScore = r1 + r2;

        return subTotalScore;


//        TextView showCountTextView = inflater.inflate(R.layout.enter_score, container, false).findViewById(R.id.cumulativeScore);

//        showCountTextView.setText(numScore1);

    }

    public int calcTotalScore(View view, TextView score, int subTotalScore) {
        // Get the value of the text view
//        String sR1 = (EditText)findViewById(R.id.frame1_roll1);

        int frameScore = Integer.parseInt(score.getText().toString());

        subTotalScore += frameScore;

        return subTotalScore;

//        TextView showCountTextView = inflater.inflate(R.layout.enter_score, container, false).findViewById(R.id.cumulativeScore);

//        showCountTextView.setText(numScore1);

    }

//    public int displayScore(EditText frame1, EditText frame2, Button saveScore_BTN, int subTotalScore, int i){
//
//        saveScore_BTN.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View view) {
//                if(frame1.getText().toString()!="" && frame2.getText().toString()!="") {
//                    num1 = Integer.parseInt(frame1_roll1.getText().toString());
//                    num2 = Integer.parseInt(frame1_roll1.getText().toString());
//                }
//                if (num1 >= 0 && num1 <= 10 && num2 >= 0 && num2 <= 10) {
////                        bottomScore.setText(String.valueOf(num));
//
//                    numScore = calcScore(view, frame1, frame2, subTotalScore);
//                    String score = String.valueOf(numScore);
//
//                    bottomScore.setText(score);
//                }
//            }
//        });
//        return numScore;
//    }

/////////////////////////////////////////////////////////////////////////////////////////////
//    question_score.child("score").addValueEventListener(new ValueEventListener() {
//        @Override
//        public void onDataChange(DataSnapshot dataSnapshot) {
//            String previousScore = dataSnapshot.getValue(String.class);
//            if (previousScore!=null){
//                int finalScore = Integer.parseInt(previousScore) + current_score;
//                question_score.child("score").setValue(String.valueOf(finalScore));
//            }
//        }
//
//        @Override
//        public void onCancelled(DatabaseError databaseError) {
//
//        }
//    });
//
//    DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
//rootRef.child("score").setValue(1);
//////////////////////////////////////////////////////////////////////////////////////////////

//    public int displayScore(View view, EditText frame1, EditText frame2, Button saveScore_BTN, int subTotalScore, int i){
//        saveScore_BTN.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
////                    j.requestFocus();
//                    if(frame1.getText().toString()!="" && frame2.getText().toString()!=""){
//                        num1 = Integer.parseInt(frame1_roll1.getText().toString());
//                        num2 = Integer.parseInt(frame1_roll1.getText().toString());
//                        if (num1 < 0 && num1 > 10){
//
//                        }
//                        else if(num2 < 0 && num2 > 10) {
////                        bottomScore.setText(String.valueOf(num));
//                        }
//                            numScore = calcScore(view, frame1, frame2);
//
////                            subTotalScore += numScore;
//                            arrayScores[i]=num1;
//                            arrayScores[i+1]=num2;
//
//
//
//                            String score = String.valueOf(numScore);
////
////
////                            bottomScore.setText(score);
//                        }
//                    }
//            }
//        });
//
//        return numScore;
//    }

    public void dScore(View view,Button saveScore_BTN, int subTotalScore, int i) {

        saveScore_BTN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                    j.requestFocus();

                String score = String.valueOf(subTotalScore);


                bottomScore.setText(score);
            }


        });
    }

}