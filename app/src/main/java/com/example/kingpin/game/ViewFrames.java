package com.example.kingpin.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.kingpin.MainActivity;
import com.example.kingpin.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * ViewFrames activity to show all the frames in the listView
 */
public class ViewFrames extends AppCompatActivity {

    /**
     * Game object g1
     */
    Game g1;

    /**
     * ListView to add frames
     */
    ListView listView;


    /**
     * Initialize ArrayList of Frame objects
     */
    private List<Frame> list = new ArrayList<Frame>();


    /**
     * Button back for navigation
     */
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_frames);

        //GET INTENT from ViewGame
        Intent gIntent = getIntent();


        //initialize button to PREVBTN
        back = (Button) findViewById(R.id.frame_prevBTN);

        //Get game from previous activity
        g1 = (Game) gIntent.getSerializableExtra("GAME_SELECTED");


        //Initialize each frame with name score and type
        Frame frame1 = new Frame("Frame 1", g1.getFrame1score(), g1.getFrame1type());
        Frame frame2 = new Frame("Frame 2", g1.getFrame2score(), g1.getFrame2type());
        Frame frame3 = new Frame("Frame 3", g1.getFrame3score(), g1.getFrame3type());
        Frame frame4 = new Frame("Frame 4", g1.getFrame4score(), g1.getFrame4type());
        Frame frame5 = new Frame("Frame 5", g1.getFrame5score(), g1.getFrame5type());
        Frame frame6 = new Frame("Frame 6", g1.getFrame6score(), g1.getFrame6type());
        Frame frame7 = new Frame("Frame 7", g1.getFrame7score(), g1.getFrame7type());
        Frame frame8 = new Frame("Frame 8", g1.getFrame8score(), g1.getFrame8type());
        Frame frame9 = new Frame("Frame 9", g1.getFrame9score(), g1.getFrame9type());
        Frame frame10 = new Frame("Frame 10", g1.getFrame10score(), g1.getFrame10type());


        //Add each frame
        list.add(frame1);
        list.add(frame2);
        list.add(frame3);
        list.add(frame4);
        list.add(frame5);
        list.add(frame6);
        list.add(frame7);
        list.add(frame8);
        list.add(frame9);
        list.add(frame10);


        //Create adpater to add frames to listview
        FrameAdapter adapter = new FrameAdapter(
                this, R.layout.fragment_framedetail, list);
        listView = (ListView) findViewById(R.id.listViewFrames);
        listView.setAdapter(adapter);


        /**
         * Create on click button that navigates to home page
         */
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewFrames.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}