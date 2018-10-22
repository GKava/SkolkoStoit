package com.gkain.skolkostoitgoogleplay;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager verticalLinearLayoutManager;
    private CustomLisrtAdapter adapter;
    private EditText editText;
    int sendText;
    private static final String TAG = "MainActivity";
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        editText = (EditText) findViewById(R.id.editText);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        verticalLinearLayoutManager = new LinearLayoutManager(this);
        verticalLinearLayoutManager.setStackFromEnd(false);
        recyclerView.setLayoutManager(verticalLinearLayoutManager);
        adapter = new CustomLisrtAdapter();
        recyclerView.setAdapter(adapter);
    }

    public void click(View view) {
        if (editText.getText().toString().equals("")) {
            //
        } else {
            sendText = Integer.parseInt(editText.getText().toString());
            adapter.deleteMessage();
            adapter.addMessage(new ModelItems("Большая пачка Lays", sendText / 87));
            adapter.addMessage(new ModelItems("Печенье Oreo", sendText / 100));
            adapter.addMessage(new ModelItems("Литр молока", sendText / 50));
            adapter.addMessage(new ModelItems("Цветные карандаши", sendText / 57));
            adapter.addMessage(new ModelItems("Зубная паста", sendText / 97));
            adapter.addMessage(new ModelItems("Квадракоптер ", sendText / 3000));
            adapter.addMessage(new ModelItems("Целая пицца ", sendText / 500));
            adapter.addMessage(new ModelItems("Гитара ", sendText / 25000));
            adapter.addMessage(new ModelItems("Святящиеся наклейки ", sendText / 80));
            adapter.addMessage(new ModelItems("Стикеры ", sendText / 30));
            adapter.addMessage(new ModelItems("Блокнот", sendText / 27));
            adapter.addMessage(new ModelItems("Коврик для мыши", sendText / 200));
            adapter.addMessage(new ModelItems("Влажные салфетки", sendText / 80));
            adapter.addMessage(new ModelItems("USB кабель", sendText / 150));
            adapter.addMessage(new ModelItems("Беспроводные наушники ", sendText / 700));
            adapter.addMessage(new ModelItems("Микронаушники ", sendText / 800));
            adapter.addMessage(new ModelItems("Набор акварели", sendText / 1500));
            adapter.addMessage(new ModelItems("Бумеранг", sendText / 100));
            adapter.addMessage(new ModelItems("Спиннер", sendText / 100));
            adapter.addMessage(new ModelItems("Навигатор", sendText / 3500));
            adapter.addMessage(new ModelItems("Подушка антистресс ", sendText / 1000));
            adapter.addMessage(new ModelItems("Неокуб ", sendText / 1000));
            adapter.addMessage(new ModelItems("Селфи штатив", sendText / 300));
            adapter.addMessage(new ModelItems("Селиаконовый бампер на телефон ", sendText / 150));
            adapter.addMessage(new ModelItems("Фильтр для воды (походный)", sendText / 1200));
            adapter.addMessage(new ModelItems("Гироскутер ", sendText / 15000));
            adapter.addMessage(new ModelItems("Спортивные колготки ", sendText / 900));
            adapter.addMessage(new ModelItems("Халат ", sendText / 700));
            adapter.addMessage(new ModelItems("Спальный мешок ", sendText / 990));
            adapter.addMessage(new ModelItems("Спортивная сумка", sendText / 800));
            adapter.addMessage(new ModelItems("Светильник", sendText / 1500));
            adapter.addMessage(new ModelItems("3D принтер ", sendText / 15000));
            adapter.addMessage(new ModelItems("Камера скрытого видеонаблюдения ", sendText / 1500));
            adapter.addMessage(new ModelItems("Пара носок ", sendText / 25));
            adapter.addMessage(new ModelItems("Зимние перчатки", sendText / 300));
            adapter.addMessage(new ModelItems("Футболка с принтом", sendText / 1000));
            adapter.addMessage(new ModelItems("Кольцо всевластия", sendText / 60));
            editText.setText("");

        }
    }
}
