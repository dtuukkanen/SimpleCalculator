package danieltuukkanen.eu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numberField1;
    private EditText numberField2;
    private TextView result;
    private int number1;
    private  int number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberField1 = findViewById(R.id.number1);
        numberField2 = findViewById(R.id.number2);
        result = findViewById(R.id.result);
    }

    public void addition(View view) {
        number1 = Integer.parseInt(String.valueOf(numberField1.getText().toString()));
        number2 = Integer.parseInt(String.valueOf(numberField2.getText().toString()));
        int addition = number1 + number2;
        result.setText(String.valueOf(addition));
    }

    public void subtraction(View view) {
        number1 = Integer.parseInt(String.valueOf(numberField1.getText().toString()));
        number2 = Integer.parseInt(String.valueOf(numberField2.getText().toString()));
        int subtraction = number1 - number2;
        result.setText(String.valueOf(subtraction));
    }

    public void multiplication(View view) {
        number1 = Integer.parseInt(String.valueOf(numberField1.getText().toString()));
        number2 = Integer.parseInt(String.valueOf(numberField2.getText().toString()));
        int multiplication = number1 * number2;
        result.setText(String.valueOf(multiplication));
    }

    public void division(View view) {
        number1 = Integer.parseInt(String.valueOf(numberField1.getText().toString()));
        number2 = Integer.parseInt(String.valueOf(numberField2.getText().toString()));
        int division = number1 / number2;
        result.setText(String.valueOf(division));
    }
}