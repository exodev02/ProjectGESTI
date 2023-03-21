package com.hk.swing;

import javax.swing.JLabel;
import javax.swing.Timer;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock extends JLabel {

    private Timer timer;

    public Clock() {
        timer = new Timer(1000, e -> {
            LocalTime lt = LocalTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
            String hora = lt.format(format);
            setText(hora);
        });
        timer.start();
    }
}
