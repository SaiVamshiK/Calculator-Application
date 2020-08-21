package com.example.sai_vamshi_k.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private double num1,num2,dans;
    EditText value;
    TextView answer,firans;
    String s1,s2,op="D",ans;
    String str="Your Value";
    public void fun0(View view)
    {
        if(value.getText().toString().equals(str))
        {
            value.setText("0");
        }
        else {
            value.append("0");
        }
    }
    public void fun1(View view)
    {
        if(value.getText().toString().equals(str))
        {
            value.setText("1");
        }
        else {
            value.append("1");
        }
    }
    public void fun2(View view)
    {
        if(value.getText().toString().equals(str))
        {
            value.setText("2");
        }
        else {
            value.append("2");
        }
    }
    public void fun3(View view)
    {
        if(value.getText().toString().equals(str))
        {
            value.setText("3");
        }
        else {
            value.append("3");
        }
    }
    public void fun4(View view)
    {
        if(value.getText().toString().equals(str))
        {
            value.setText("4");
        }
        else {
            value.append("4");
        }
    }
    public void fun5(View view)
    {
        if(value.getText().toString().equals(str))
        {
            value.setText("5");
        }
        else {
            value.append("5");
        }
    }
    public void fun6(View view)
    {
        if(value.getText().toString().equals(str))
        {
            value.setText("6");
        }
        else {
            value.append("6");
        }
    }
    public void fun7(View view)
    {
        if(value.getText().toString().equals(str))
        {
            value.setText("7");
        }
        else {
            value.append("7");
        }
    }
    public void fun8(View view)
    {
        if(value.getText().toString().equals(str))
        {
            value.setText("8");
        }
        else {
            value.append("8");
        }
    }
    public void fun9(View view)
    {
        if(value.getText().toString().equals(str))
        {
            value.setText("9");
        }
        else {
            value.append("9");
        }
    }
    public void funplus(View view) {
        if (!(op.equals("D")) && !(Double.toString(num1).equals(""))&&!(value.getText().toString().equals(""))) {
            s2 = value.getText().toString();
            num2 = Double.parseDouble(s2);
            System.out.println(op);
            if(op.equals("+")) {
                dans = num1 + num2;
                System.out.println(op);
                num1 = dans;
                firans.setText(Double.toString(num1) + '+');
                value.setText(null);
                op="+";
            } else if (op.equals("-")) {
                dans = num1 - num2;
                num1 = dans;
                firans.setText(Double.toString(num1) + '+');
                value.setText(null);
                op="+";
            } else if (op.equals("*")) {
                dans = num1 * num2;
                num1 = dans;
                firans.setText(Double.toString(num1) + '+');
                value.setText(null);
                op="+";
            } else if (op.equals("/")) {
                dans = num1 / num2;
                num1 = dans;
                firans.setText(Double.toString(num1) + '+');
                value.setText(null);
                op="+";
            }
        }
        else{
            if (!(value.getText().toString().equals(str)) && (!(value.getText().toString().equals("")))) {
                s1 = value.getText().toString();
                num1 = Double.parseDouble(s1);
                op = "+";
                value.setText(null);
                firans.setText(s1 + '+');
            } else {
                Toast.makeText(this, "Please enter number to compute", Toast.LENGTH_SHORT).show();
            }
         }
    }
    public void funminus(View view)
    {
        if (!(op.equals("D")) && !(Double.toString(num1).equals(""))&&!(value.getText().toString().equals(""))) {
            s2 = value.getText().toString();
            num2 = Double.parseDouble(s2);
            System.out.println(op);
            if(op.equals("+")) {
                dans = num1 + num2;
                System.out.println(op);
                num1 = dans;
                firans.setText(Double.toString(num1) + '-');
                value.setText(null);
                op="-";
            } else if (op.equals("-")) {
                dans = num1 - num2;
                num1 = dans;
                firans.setText(Double.toString(num1) + '-');
                value.setText(null);
                op="-";
            } else if (op.equals("*")) {
                dans = num1 * num2;
                num1 = dans;
                firans.setText(Double.toString(num1) + '-');
                value.setText(null);
                op="-";
            } else if (op.equals("/")) {
                dans = num1 / num2;
                num1 = dans;
                firans.setText(Double.toString(num1) + '-');
                value.setText(null);
                op="-";
            }
        }
        else
        {
            if (!(value.getText().toString().equals(str)) && (!(value.getText().toString().equals("")))) {
                s1 = value.getText().toString();
                num1 = Double.parseDouble(s1);
                op = "-";
                value.setText(null);
                firans.setText(s1 + '-');
            } else {
                Toast.makeText(this, "Please enter number to compute", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void funmulti(View view)
    {
        if (!(op.equals("D")) && !(Double.toString(num1).equals(""))&&!(value.getText().toString().equals(""))) {
            s2 = value.getText().toString();
            num2 = Double.parseDouble(s2);
            System.out.println(op);
            if(op.equals("+")) {
                dans = num1 + num2;
                System.out.println(op);
                num1 = dans;
                firans.setText(Double.toString(num1) + '*');
                value.setText(null);
                op="*";
            } else if (op.equals("-")) {
                dans = num1 - num2;
                num1 = dans;
                firans.setText(Double.toString(num1) + '*');
                value.setText(null);
                op="*";
            } else if (op.equals("*")) {
                dans = num1 * num2;
                num1 = dans;
                firans.setText(Double.toString(num1) + '*');
                value.setText(null);
                op="*";
            } else if (op.equals("/")) {
                dans = num1 / num2;
                num1 = dans;
                firans.setText(Double.toString(num1) + '*');
                value.setText(null);
                op="*";
            }
        }
        else
        {
            if (!(value.getText().toString().equals(str)) && (!(value.getText().toString().equals("")))) {
                s1 = value.getText().toString();
                num1 = Double.parseDouble(s1);
                op = "*";
                value.setText(null);
                firans.setText(s1 + '*');
            } else {
                Toast.makeText(this, "Please enter number to compute", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void fundiv(View view)
    {
        if (!(op.equals("D")) && !(Double.toString(num1).equals(""))&&!(value.getText().toString().equals(""))) {
            s2 = value.getText().toString();
            num2 = Double.parseDouble(s2);
            System.out.println(op);
            if(op.equals("+")) {
                dans = num1 + num2;
                System.out.println(op);
                num1 = dans;
                firans.setText(Double.toString(num1) + '/');
                value.setText(null);
                op="/";
            } else if (op.equals("-")) {
                dans = num1 - num2;
                num1 = dans;
                firans.setText(Double.toString(num1) + '/');
                value.setText(null);
                op="/";
            } else if (op.equals("*")) {
                dans = num1 * num2;
                num1 = dans;
                firans.setText(Double.toString(num1) + '/');
                value.setText(null);
                op="/";
            } else if (op.equals("/")) {
                dans = num1 / num2;
                num1 = dans;
                firans.setText(Double.toString(num1) + '/');
                value.setText(null);
                op="/";
            }
        }
        else
        {
            if (!(value.getText().toString().equals(str)) && (!(value.getText().toString().equals("")))) {
                s1 = value.getText().toString();
                num1 = Double.parseDouble(s1);
                op = "/";
                value.setText(null);
                firans.setText(s1 + '/');
            } else {
                Toast.makeText(this, "Please enter number to compute", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void funequal(View view)
    {
        if(!(value.getText().toString().equals(str))&&(!(value.getText().toString().equals("")))) {
            s2 = value.getText().toString();
            num2 = Double.parseDouble(s2);
            value.setText("Your Value");
            firans.setText(null);
            if (op.equals("+")) {
                dans = num1 + num2;
            }
            if (op.equals("-")) {
                dans = num1 - num2;
            }
            if (op.equals("*")) {
                dans = num1 * num2;
            }
            if (op.equals("/")) {
                dans = num1 / num2;
            }
            if(op.equals("D"))
            {
                dans = num2;
            }
            ans = Double.toString(dans);
            answer.setText(ans);
            value.setText(ans);
            op = "D";
        }
        else
        {
            Toast.makeText(this, "Please enter number to compute", Toast.LENGTH_SHORT).show();
        }
    }
    public void funclear(View view)
    {
        if(!(value.getText().toString().equals(str))) {
            value.setText(null);
        }
        answer.setText(null);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value=(EditText)findViewById(R.id.ValeditText);
        answer=(TextView)findViewById(R.id.anstextView);
        firans=(TextView)findViewById(R.id.firsttextView);
    }
}
