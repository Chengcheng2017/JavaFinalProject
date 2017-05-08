package chengcheng.leaguage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import chengcheng.leaguage.Homep.HomePage;
import chengcheng.leaguage.LearningP.LearningPath;

public class Recommendation extends AppCompatActivity {
    private CheckBox check1;
    private CheckBox check2;
    private CheckBox check3;
    private CheckBox check4;
    private Button skipB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);

        check1 = (CheckBox) findViewById(R.id.checkbox1);
        check2 = (CheckBox) findViewById(R.id.checkbox2);
        check3 = (CheckBox) findViewById(R.id.checkbox3);
        check4 = (CheckBox) findViewById(R.id.checkbox4);

        skipB = (Button) findViewById(R.id.add_button);
        skipB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean select[] = new Boolean[4];
                select[0] = check1.isChecked();
                select[1] = check2.isChecked();
                select[2] = check3.isChecked();
                select[3] = check4.isChecked();
                Intent intent = new Intent(Recommendation.this, LearningPath.class);
                intent.putExtra("SELECT", select);
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.skip_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            Intent intent = new Intent(Recommendation.this, HomePage.class);
            startActivity(intent);
            return super.onOptionsItemSelected(item);
    }
}

