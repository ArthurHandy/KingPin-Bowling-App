package com.example.kingpin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Main Activity displays First Fragment and main_menu
 * @author Group7
 */
public class MainActivity extends AppCompatActivity {

    /**
     * FirebaseAuth authorization for user login/logout
     */
    private FirebaseAuth mAuth;

    /**
     * Firebase mAuthListener checks for changes
     */
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get firebase instance
        mAuth = FirebaseAuth.getInstance();

        //implement mAuthListener for user
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    getSupportActionBar().setTitle("Welcome, " + user.getDisplayName() + "!");
                } else {

                }
            }
        };

    }


    @Override
    protected void onStart() {
        super.onStart();
        //Get current user
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if (currentUser == null){
            Intent intent = new Intent(MainActivity.this,Login.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        else if(id == R.id.action_logout){
//                mAuth.signOut();
//
//                Intent intent = new Intent(MainActivity.this,Login.class);
//                startActivity(intent);
//                finish();
//        }

        //logout option
        if(id == R.id.action_logout){
            mAuth.signOut();

            Intent intent = new Intent(MainActivity.this,Login.class);
            startActivity(intent);
            finish();
        }

        //if logout selected logout user
        return super.onOptionsItemSelected(item);
    }


}