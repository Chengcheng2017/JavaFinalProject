package chengcheng.leaguage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login() {
        Intent intent = new Intent(Welcome.this, LogIn.class);
        startActivity(intent);
    }

    public void Signup() {
        Intent intent = new Intent(Welcome.this, SignUp.class);
        startActivity(intent);
    }

}
