package com.example.handler;


import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import okhttp3.OkHttpClient;

public class Main2Activity extends AppCompatActivity {

    ArrayList<MyItem> myitems = new ArrayList<MyItem>();
    EditText editText;
    Button button;
    OkHttpClient client = new OkHttpClient();
    Handler handler = new Handler();
    String e = "";
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.edittext);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this, editText.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });


        // String m = "";

//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    ArrayList<MyItem> myitem = new ArrayList<MyItem>();
//                    myitem=run1("http://192.168.43.156:8000/api/sensor");
//                   // Log.d("URLL", "onCreate: " + run1("http://192.168.43.156:8000/api/sensor").get((run1("http://192.168.43.156:8000/api/sensor").size()) - 1).getTemperature_ambiamte());
//                    Log.d("URLL", "run: "+myitem.get((myitem.size())-1).getTemperature_ambiamte());
//                    textView.setText(""+myitem.get(0).getTemperature_ambiamte());
//               // textView.setText(""+Math.random()=);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                handler.postDelayed(this, 5000);
//            }
//        }, 5000);
//        try {
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //populateListView();
    }

//    ArrayList<MyItem> run1(String url) throws IOException {
//        Request request = new Request.Builder()
//                .url(url)
//                .build();
//        try (Response response = client.newCall(request).execute()) {
//            ResponseBody responseBody = response.body();
//            String ms = responseBody.string();
//            //String ms = response.body().string();
//            // Log.d("URL", "run: " + ms);
//
//            try {
//                JSONArray array = new JSONArray(ms);
//                JSONObject json_data = array.getJSONObject(0);
//                MyItem resultRow = new MyItem();
//                resultRow.setTemperature_ambiamte(json_data.getInt("temperatureAmbiante"));
////                    resultRow.setSurname(json_data.getString("prenom"));
////                    Log.d("1234", "run: " + resultRow);
////                    resultRow.setTelephone("Lit n°" + json_data.getString("numerolit"));
//                //resultRow.setTelephone("Lit n°" + 1);
////                    JSONArray obj = new JSONArray(json_data.getString("patients"));
////                    JSONObject b = obj.getJSONObject(0);
//                myitems.add(0,resultRow);
//
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            return myitems;
//        }
//    }


}
