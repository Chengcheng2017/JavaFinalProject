package chengcheng.leaguage;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
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
        userName = (EditText) findViewById(R.id.userName_edit_text);
        userAge = (EditText) findViewById(R.id.age_edit_text);
        country = (EditText) findViewById(R.id.country_edit_text);
    }


    public void SignUp(View view) {
        String e = emailAddress.getText().toString();
        String p = password.getText().toString();


        auth.createUserWithEmailAndPassword(e, p)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (!task.isSuccessful()) {
                            Toast.makeText(SignUp.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
                        } else {
                            String id = userName.getText().toString();
                            User u = new User(userName, Integer.parseInt(userAge.getText().toString()), country.getText().toString(), );
                            userRef.child(id).setValue(u);

                            finish();
//                            FirebaseUser user = auth.getCurrentUser();
//                            FirebaseDatabase database = FirebaseDatabase.getInstance();
//                            DatabaseReference userRef = database.getReference(user.getUid() + "/info");
//                            userRef.child("name").setValue("xi wei");
                            Intent intent = new Intent(SignUp.this, Recommendation.class);
                            startActivity(intent);
                        }

                    }
                });
    }
}
