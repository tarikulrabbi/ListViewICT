package com.rabbi.tarikul.listviewict;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] countryNames;
    int[] flags = {
            R.drawable.england, R.drawable.india, R.drawable.newzealand, R.drawable.southafrica,
            R.drawable.pakistan, R.drawable.australia, R.drawable.bangladesh, R.drawable.srilanka,
            R.drawable.westindies, R.drawable.afghanistan, R.drawable.zimbabwe,R.drawable.ireland
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listviewId);
        countryNames = getResources().getStringArray(R.array.country_names);

        final CustomAdapter adapter = new CustomAdapter(this, countryNames, flags);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = countryNames[position];
                Toast.makeText(MainActivity.this,"You are clicked "+value,Toast.LENGTH_LONG).show();
                if(position==0){
                    String url = "https://www.ecb.co.uk/";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(position==1){
                    String url = "http://www.bcci.tv/";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(position==2){
                    String url = "https://www.nzc.nz/cricketnation";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(position==3){
                    String url = "http://cricket.co.za/";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(position==4){
                    String url = "https://www.pcb.com.pk/";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(position==5){
                    String url = "https://www.cricket.com.au/";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(position==6){
                    String url = "http://www.tigercricket.com.bd/";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(position==7){
                    String url = "http://www.srilankacricket.lk/";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(position==8){
                    String url = "http://cricketwestindies.org/";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(position==9){
                    String url = "http://cricket.af/";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(position==10){
                    String url = "http://www.zimcricket.org/";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if(position==11){
                    String url = "http://www.cricketireland.ie/";
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            }
        });
    }
}
