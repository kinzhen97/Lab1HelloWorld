package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global or module level variable
    private EditText editTextName, editTextAge;
    private TextView textViewMessage;

    //onCreate = main() function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView method display the UI
        //R = resources class
        setContentView(R.layout.activity_main);

        //Linking program with UI
        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);

        textViewMessage = (TextView)findViewById(R.id.textViewMessage);

    }
    //A method to handle View click event
    public void DisplayMessage(View view){
        String name;
        int age;
        name = editTextName.getText().toString();
        age = Integer.parseInt(editTextAge.getText().toString());
        age++;
        textViewMessage.setText("Hi " + name + " ,you will be " + age + " years old in 2018. ");
    }

    //A method to handle Reset event
    public void ResetScreen(View view){
        editTextName.setText(" ");
        editTextAge.setText(" ");
        textViewMessage.setText(" ");
    }
}
