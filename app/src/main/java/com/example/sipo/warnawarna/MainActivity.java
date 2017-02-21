package com.example.sipo.warnawarna;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;


public class MainActivity extends ActionBarActivity implements TextToSpeech.OnInitListener{

    TextToSpeech TTS;
    ListView lv;
    TextView tv;

    final String[] list = {"Hitam","Cokelat","Merah","Jingga","Kuning","Hijau","Biru","Ungu","Abu abu","Putih"};

    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv =(TextView)findViewById(R.id.textView);
        lv =(ListView)findViewById(R.id.listView);
        TTS = new TextToSpeech(MainActivity.this,MainActivity.this);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,list);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),""+list[position],Toast.LENGTH_SHORT).show();
                switch (position){
                    case 0:
                        tv.setText("Black");
                        TTS.speak(tv.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                        break;
                    case 1:
                        tv.setText("Brown");
                        TTS.speak(tv.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                        break;
                    case 2:
                        tv.setText("Red");
                        TTS.speak(tv.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                        break;
                    case 3:
                        tv.setText("Orange");
                        TTS.speak(tv.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                        break;
                    case 4:
                        tv.setText("Yellow");
                        TTS.speak(tv.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                        break;
                    case 5:
                        tv.setText("Green");
                        TTS.speak(tv.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                        break;
                    case 6:
                        tv.setText("Blue");
                        TTS.speak(tv.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                        break;
                    case 7:
                        tv.setText("Purple");
                        TTS.speak(tv.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                        break;
                    case 8:
                        tv.setText("Grey");
                        TTS.speak(tv.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                        break;
                    case 9:
                        tv.setText("White");
                        TTS.speak(tv.getText().toString(),TextToSpeech.QUEUE_ADD,null);
                        break;

                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onInit(int status) {
        TTS.setLanguage(Locale.ENGLISH);
    }
}
