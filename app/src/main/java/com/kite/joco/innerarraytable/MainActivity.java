package com.kite.joco.innerarraytable;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(new Person("Ricsi",26,"kék"));
        personArrayList.add(new Person("Pisti",27,"feket"));
        personArrayList.add(new Person("Józsi",43,"bordó"));
        /*personArrayList.add(new Person("Ricsi",26,"kék"));
        personArrayList.add(new Person("Ricsi",26,"kék"));
        personArrayList.add(new Person("Ricsi",26,"kék"));
        personArrayList.add(new Person("Ricsi",26,"kék"));*/

        TableLayout tblMain = (TableLayout) findViewById(R.id.tblMain);
        for (int i=0;i<personArrayList.size();i++) {

            //TableRow tr = (TableRow) LayoutInflater.from(this).inflate(R.layout.hellorow,null);
            //tblMain.addView(tr);

            TableRow tableRow = new TableRow(this);
            tableRow.setId(i);

            //tableRow.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT));

            View trxView = (TableRow) LayoutInflater.from(this).inflate(R.layout.rowlayout,null,false);

            Person p = personArrayList.get(i);
            /*TextView tvEletkor = (TextView) trxView.findViewById(R.id.tvEletkor);
            TextView tvNev =  (TextView) trxView.findViewById(R.id.tvPersonName);
            TextView tvSzin = (TextView) trxView.findViewById(R.id.tvSzin);
            tvEletkor.setText(p.getEletkor());
            tvNev.setText(p.getNev());
            tvSzin.setText(p.getKedvencSzin());*/
            /*TextView tvEletkor = new TextView(this);
            tvEletkor.setText(p.getEletkor());
            trx.addView(tvEletkor);*/
            tableRow.addView(trxView);
            tblMain.addView(tableRow);

            TableRow use = (TableRow) findViewById(i);
            TextView tvEletkor = (TextView) use.findViewById(R.id.tvEletkor);
            TextView tvNev =  (TextView) use.findViewById(R.id.tvPersonName);
            TextView tvSzin = (TextView) use.findViewById(R.id.tvSzin);
            tvEletkor.setText(p.getEletkor());
            tvNev.setText(p.getNev());
            tvSzin.setText(p.getKedvencSzin());

        }
        //tblMain.requestLayout();

    }
}
