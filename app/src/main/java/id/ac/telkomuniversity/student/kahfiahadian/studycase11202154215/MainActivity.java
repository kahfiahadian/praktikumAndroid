package id.ac.telkomuniversity.student.kahfiahadian.studycase11202154215;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "id.ac.telkomuniversity.student.kahfiahadian.studycase11202154215.extra.MESSAGE";
    private EditText namaMakanan;
    private EditText jumlahMakanan;
    private TextView resto;
    private int total,hasil;
    private int saldo = 65500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaMakanan = (EditText) findViewById(R.id.editText_makanan);
        jumlahMakanan = (EditText) findViewById(R.id.editText_jumlah);
        resto = (TextView) findViewById(R.id.restaurant);

    }

    public void launchEatbus(View view) {
        String menu = namaMakanan.getText().toString();
        String jumlah = jumlahMakanan.getText().toString();
        total = Integer.parseInt(jumlah.trim());

        hasil = total * 50000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);
        bundle.putString("Jumlah",jumlah);
        bundle.putString("Total",String.valueOf(hasil));
        bundle.putString("Restaurant","Eatbus");

        Intent a = new Intent(this,secondactivity.class);

        a.putExtras(bundle);

        startActivity(a);
        if (hasil > saldo){
            Toast.makeText(this,"Jangan disini makan malamnya, ini berat biar dia saja ",Toast.LENGTH_LONG).show();
        }

    }

    public void launchApnormal(View view) {
        String menu = namaMakanan.getText().toString();
        String jumlah = jumlahMakanan.getText().toString();
        total = Integer.parseInt(jumlah.trim());

        hasil = total * 30000;

        Bundle bundle = new Bundle();
        bundle.putString("Menu", menu);
        bundle.putString("Jumlah",jumlah);
        bundle.putString("Total",String.valueOf(hasil));
        bundle.putString("Restaurant","Apnormal");

        Intent a = new Intent(this,secondactivity.class);

        a.putExtras(bundle);

        startActivity(a);
        if (hasil > saldo){
            Toast.makeText(this,"Jangan disini makan makannya, ini berat biar dia saja ",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this,"MANTAB DJIWAAA",Toast.LENGTH_LONG).show();
        }
    }
}
