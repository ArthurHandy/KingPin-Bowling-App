//package com.example.kingpin.game;
//
//import android.support.v4.view.ViewPager;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//
//import com.epicodus.myrestaurants.R;
//import com.epicodus.myrestaurants.adapters.RestaurantPagerAdapter;
//import com.epicodus.myrestaurants.models.Restaurant;
//
//import org.parceler.Parcels;
//
//import java.util.ArrayList;
//
//import butterknife.Bind;
//import butterknife.ButterKnife;
//
//public class GameDetails extends Fragment {
//    @Bind(R.id.viewPager) ViewPager mViewPager;
//    private GameListAdapter.GamePagerAdapter adapterViewPager;
//    ArrayList<Game> games = new ArrayList<>();
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_listgames);
//        ButterKnife.bind(this);
//
//        games = Parcels.unwrap(getIntent().getParcelableExtra("games"));
//
//        int startingPosition = Integer.parseInt(getIntent().getStringExtra("position"));
//
//        adapterViewPager = new GameListAdapter.GamePagerAdapter(getSupportFragmentManager(), games);
//        mViewPager.setAdapter(adapterViewPager);
//        mViewPager.setCurrentItem(startingPosition);
//    }
//}