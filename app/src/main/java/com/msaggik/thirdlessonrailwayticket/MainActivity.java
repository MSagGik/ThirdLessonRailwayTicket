package com.msaggik.thirdlessonrailwayticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // создание объекта сущности железнодорожного билета
    RailwayTicket railwayTicket = new RailwayTicket("Вологда", "Санкт-Петербург",
            "10.00 1 февраля", "12 часов", 125);

    // создание дополнительных полей для вывода на экран полученных значений
    private TextView railwayTicketOut; // поле вывода информации о билете

    // вывод на экран полученных значений
    @Override
    protected void onCreate(Bundle savedInstanceState) { // создание жизненного цикла активности
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // присваивание жизненному циклу активити представления activity_main

        // присваивание переменным активити элементов представления activity_main
        railwayTicketOut = findViewById(R.id.railwayTicketOut); // вывод информации о билете

        // запонение экрана
        railwayTicketOut.setText(railwayTicket.toString());
    }
}