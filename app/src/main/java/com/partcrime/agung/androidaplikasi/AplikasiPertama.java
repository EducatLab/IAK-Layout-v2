package com.partcrime.agung.androidaplikasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AplikasiPertama extends AppCompatActivity {

    TextView share, isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplikasi_pertama);
        share = (TextView) findViewById(R.id.TombolShare);
        isi = (TextView) findViewById(R.id.desc);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, isi.getText().toString());
                intent.setType("text/plain");
                startActivity(intent);
            }
        });

    }
}
