package id.ac.telkomuniversity.student.kahfiahadian.studycase11202154215;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import static id.ac.telkomuniversity.student.kahfiahadian.studycase11202154215.MainActivity.EXTRA_MESSAGE;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        Intent intent = getIntent();
        String message =
                intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView_resto = (TextView) findViewById(R.id.textView_resto);
        TextView textView_menu = (TextView) findViewById(R.id.textView_menu);
        TextView textView_harga = (TextView) findViewById(R.id.textView_harga);
        TextView textView_porsi = (TextView) findViewById(R.id.textView_porsi);


        if (getIntent().getExtras()!=null){

            Bundle bundle = getIntent().getExtras();
            textView_menu.setText(bundle.getString("Menu"));
            textView_porsi.setText(bundle.getString("Jumlah"));
            textView_harga.setText(bundle.getString("Total"));
            textView_resto.setText(bundle.getString("Restaurant"));
        }

        else
        {
            textView_menu.setText(getIntent().getStringExtra("Menu"));
            textView_porsi.setText(getIntent().getStringExtra("Jumlah"));
            textView_harga.setText(getIntent().getStringExtra("Total"));
            textView_resto.setText(getIntent().getStringExtra("Restaurant"));
        }



        }

    }



