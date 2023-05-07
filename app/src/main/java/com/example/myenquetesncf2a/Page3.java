package com.example.myenquetesncf2a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page3 extends AppCompatActivity implements View.OnClickListener {
private Button btSuivant2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        this.btSuivant2=(Button)findViewById(R.id.idSuivant2);
        this.btSuivant2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
  if(v.getId()==R.id.idSuivant2){
      // On récupère l'email et le rer
      String email = this.getIntent().getStringExtra("email").toString();
      String rer = this.getIntent().getStringExtra("rer").toString();

      // On passe à la page 2
      Intent unIntent = new Intent(this, PageFinActivity.class);
      unIntent.putExtra("rer", rer);
      unIntent.putExtra("email", email);
      this.startActivity(unIntent);
  }
    }
}