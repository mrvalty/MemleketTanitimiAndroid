package com.example.ankaratanitimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.Button;

import cn.pedant.SweetAlert.SweetAlertDialog;
@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {

    Button _btnBasla;
    SweetAlertDialog pDialog;
    private AbsoluteLayout pnl;
    private ViewGroup.LayoutParams btn1Lp,btn2Lp;

    private void init(){
        pnl = new AbsoluteLayout(this);

        btn1Lp= new AbsoluteLayout.LayoutParams(200,100,0,0);
        _btnBasla.setLayoutParams(btn1Lp);
        pnl.addView(_btnBasla,btn1Lp);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        _btnBasla=(Button)findViewById(R.id.btn_basla);
        _btnBasla.setOnClickListener(new Basla());


    }


    private class Basla implements View.OnClickListener {
        @Override
        public void onClick(View view) {
             Intent nextPage = new Intent(MainActivity.this,AnaSayfaActivity.class);
             startActivity(nextPage);
        }
    }
}