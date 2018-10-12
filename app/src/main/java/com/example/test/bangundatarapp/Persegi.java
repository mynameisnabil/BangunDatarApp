package com.example.test.bangundatarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Persegi extends AppCompatActivity {
    //Deklarasi variabel komponen
    EditText p, l;
    Button b;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //memanggil file xml
        setContentView(R.layout.activity_persegi);

        //Deklarasi yang dikaitkan dengan id file xml
        p = (EditText) findViewById(R.id.panjangpp);
        l = (EditText) findViewById(R.id.lebarpp);
        b = (Button) findViewById(R.id.button);
        hasil = (TextView) findViewById(R.id.Jawabanpp);

        //aksi jika tombol button di klik
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toas
                if(p.length()== 0 && l.length()== 0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(p.length() == 0){
                    Toast.makeText(getApplication(), "Panjang tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(l.length() == 0){
                    Toast.makeText(getApplication(), "Lebar tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    //Deklarasi variabel perhitungan
                    String isiPanjang = p.getText().toString();
                    String isiLebar = l.getText().toString();
                    double pj = Double.parseDouble(isiPanjang);
                    double lb = Double.parseDouble(isiLebar);
                    double hs = persegi (pj,lb);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double persegi(double pj, double lb){
        return pj*lb;
    }
}
