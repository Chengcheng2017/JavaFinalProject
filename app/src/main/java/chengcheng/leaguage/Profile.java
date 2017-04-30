package chengcheng.leaguage;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import chengcheng.leaguage.Homep.HomePage;
import chengcheng.leaguage.LearningP.LearningPath;

public class Profile extends AppCompatActivity {
    private TextView friends;
    private TextView learningPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        friends = (TextView) findViewById(R.id.friends);
        friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this,Friends.class);
                startActivity(intent);
            }
        });
        learningPath = (TextView) findViewById(R.id.learning_path);
        learningPath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, LearningPath.class);
                startActivity(intent);
            }
        });

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_home:
                                Intent intent = new Intent(Profile.this, HomePage.class);
                                startActivity(intent);
                                break;
                            case R.id.action_information:
                                Toast.makeText(Profile.this, "Please ignore this button...",
                                        Toast.LENGTH_LONG).show();
                                break;

                            case R.id.action_profile:
                                break;
                        }
                        return true;
                    }
                });
    }
}
