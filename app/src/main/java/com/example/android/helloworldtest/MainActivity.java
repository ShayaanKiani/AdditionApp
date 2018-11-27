package com.example.android.helloworldtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //this line says create a variable in the OnCreate method of type Button
        //to link it to the button in the xml you use the findViewById function
        //and then have to use R(resource.id(the id you assign to the button)
        // .addBtn(change this depending on the button name)
        Button addBtn = (Button) findViewById(R.id.addBtn);

        //this line says when the addBtn is clicked do what is inside the on method just created
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {

                //variable decleration similar to the button
                //if you are confused as to what these variable types are in the design view
                //of the xml is the name of the objects on the screen, the variable name is
                //the same as what i assigned it in the design view
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resulttextView);

                //im creating two int variable to store the information imputed by the user
                //the problem is that user inputs are given as text so i have to convert it first
                //to a string using .toString and then that sting to a int using .parseInt
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());

                //adding both the user inputs
                int result = num1 + num2;
                //this makes the resultTextView display the result variable
                resultTextView.setText(result + "");



            }
        });

    }
}
