package mcm.edu.ph.gonzales_enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd, btnSub, btnMul, btnDiv, btnMod;

        btnAdd = findViewById(R. id.btnAdd);
        btnSub = findViewById(R. id.btnSub);
        btnMul = findViewById(R. id.btnMul);
        btnDiv = findViewById(R. id.btnDiv);
        btnMod = findViewById(R. id.btnMod);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMod.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        double operand1=0;
        double operand2=0;


        EditText op1 = findViewById(R. id.txtOperand1);
        EditText op2 = findViewById(R. id.txtOperand2);
        TextView ans = findViewById(R. id.txtAnswer);


        operand1 = Double.parseDouble(op1.getText().toString());
        operand2 = Double.parseDouble(op2.getText().toString());


        switch(v.getId())  {
            case R.id.btnAdd:
                ans.setText(Double.toString(doaddition(operand1,operand2)));
                break;

            case R.id.btnSub:
                ans.setText(Double.toString(dosubtraction(operand1,operand2)));

                break;
            case R.id.btnMul:
                ans.setText(Double.toString(domultiplication(operand1,operand2)));

                break;
            case R.id.btnDiv:
                ans.setText(Double.toString(dodivision(operand1,operand2)));

                break;
            case R.id.btnMod:
                ans.setText(Double.toString(domodulo(operand1,operand2)));
        }
    }

    public static double doaddition(double operand1, double operand2){
        double answer = 0.0;
        answer = operand1 + operand2;
        return answer;
    }

    public static double domultiplication(double operand1, double operand2){
        double answer = 0.0;
        answer = operand1 * operand2;
        return answer;
    }
    public static double dosubtraction(double operand1, double operand2){
        double answer = 0.0;
        answer = operand1 - operand2;
        return answer;
    }
    public static double dodivision(double operand1, double operand2){
        double answer = 0.0;
        answer = operand1 / operand2;
        return answer;
    }
    public static double domodulo(double operand1, double operand2){
        double answer = 0.0;
        answer = operand1 % operand2;
        return answer;
    }
}