package com.example.test.bangundatarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class jajargenjang extends AppCompatActivity {
    //Deklarasi variabel komponen
    EditText a, t;
    Button b;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //memanggil file xml
        setContentView(R.layout.activity_jajargenjang);

        //Deklarasi yang dikaitkan dengan id file xml
        a = (EditText) findViewById(R.id.alas);
        t = (EditText) findViewById(R.id.tinggi);
        b = (Button) findViewById(R.id.button5);
        hasil = (TextView) findViewById(R.id.txt_hasil15);

        //aksi jika tombol button di klik
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toas
                if(a.length()== 0 && t.length()== 0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(a.length() == 0){
                    Toast.makeText(getApplication(), "Alas tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(t.length() == 0){
                    Toast.makeText(getApplication(), "Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    //Deklarasi variabel perhitungan
                    String isiPanjang = a.getText().toString();
                    String isiLebar = t.getText().toString();
                    double a = Double.parseDouble(isiPanjang);
                    double t = Double.parseDouble(isiLebar);
                    double hs = segitiga (a,t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double segitiga(double a, double t){
        return a*t;
    }
}
