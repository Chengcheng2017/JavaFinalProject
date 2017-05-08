package chengcheng.leaguage;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {

    private EditText emailAddress;
    private EditText password;
    private EditText userName;
    private EditText userAge;
    private EditText country;

    private FirebaseAuth auth = FirebaseAuth.getInstance();
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference userRef = database.getReference("user");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        emailAddress = (EditText) findViewById(R.id.email_edit_text);
        password = (EditText) findViewById(R.id.password_edit_text);
        userName = (EditText) findViewById(R.id.password_edit_username);
        userAge = (EditText) findViewById(R.id.age_edit_text);
        country = (EditText) findViewById(R.id.country_edit_text);
    }


    public void signUp(View view) {
        String e = emailAddress.getText().toString();
        String p = password.getText().toString();

        auth.createUserWithEmailAndPassword(e, p)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (!task.isSuccessful()) {
                                    Toast.makeText(SignUp.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(SignUp.this, task.getResult().getUser().getEmail() + " logged in successful",
                                            Toast.LENGTH_SHORT).show();
                                    if (!userName.equals("") && !userAge.equals("") && !country.equals("")) {
                                        User u = new User(userName.getText().toString(), Integer.parseInt(userAge.getText().toString()), country.getText().toString(), null, null);
                                        FirebaseUser user = auth.getCurrentUser();
                                        String id = user.getUid();
                                        userRef.child(id).setValue(u);
                                        Intent intent = new Intent(SignUp.this, Recommendation.class);
                                        startActivity(intent);
                                    } else {
                                        Toast.makeText(SignUp.this, task.getResult().getUser().getEmail() + " Fill out all the fields",
                                                Toast.LENGTH_SHORT).show();
                                    }
                                }
                            }
                        }

                );

    }


}
