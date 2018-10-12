package com.example.test.bangundatarapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class belahketupat extends AppCompatActivity {
    //Deklarasi variabel komponen
    EditText d1, d2;
    Button b;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //memanggil file xml
        setContentView(R.layout.activity_belahketupat);

        //Deklarasi yang dikaitkan dengan id file xml
        d1 = (EditText) findViewById(R.id.diagonal1);
        d2 = (EditText) findViewById(R.id.diagonal2);
        b = (Button) findViewById(R.id.button6);
        hasil = (TextView) findViewById(R.id.jawabanbk);

        //aksi jika tombol button di klik
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toas
                if(d1.length()== 0 && d2.length()== 0){
                    Toast.makeText(getApplication(),"Diagonal 1 dan Diagonal 2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(d1.length() == 0){
                    Toast.makeText(getApplication(), "Diaogonal 1 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(d2.length() == 0){
                    Toast.makeText(getApplication(), "Diagonal 2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    //Deklarasi variabel perhitungan
                    String isiPanjang = d1.getText().toString();
                    String isiLebar = d2.getText().toString();
                    double d1 = Double.parseDouble(isiPanjang);
                    double d2 = Double.parseDouble(isiLebar);
                    double hs = belah_ketupat(d1,d2);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double belah_ketupat(double d1, double d2){
        return d1*d2;
    }
}
