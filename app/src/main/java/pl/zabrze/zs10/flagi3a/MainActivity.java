package pl.zabrze.zs10.flagi3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int licznik = 0;
    private int licznikzlychodp = 0;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void zlaodpowiedz(View view) {
        Toast.makeText(this, "Ten kolor jest w fladze Polski!", Toast.LENGTH_SHORT).show();
        licznikzlychodp++;
    }

    public void dobraodpowiedz(View view) {
        view.setVisibility(View.INVISIBLE);
        licznik++;
        if(licznik == 4){
            textView.setText("To są kolory flagi Polski :)!!!");
            Toast.makeText(this, "Liczba twoich błędów: " + licznikzlychodp, Toast.LENGTH_SHORT).show();
        }
    }
}