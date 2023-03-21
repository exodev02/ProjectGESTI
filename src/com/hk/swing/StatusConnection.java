package com.hk.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import com.hk.dbc.dbConnection;
import java.awt.FontMetrics;

public class StatusConnection extends JPanel {

    private final int width = 48;
    private final int heigth = 24;
    private dbConnection cnx = new dbConnection();

    public StatusConnection() {
        setOpaque(false);
        setSize(width, heigth);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (cnx.connectionStatus() == 1) {
            g2.setColor(Color.green);
            g2.fillRoundRect(0, 0, width, heigth, heigth, heigth);
            createHintText(g2);
        } else {
            g2.setColor(Color.red);
            g2.fillRoundRect(0, 0, width, heigth, heigth, heigth);
            createHintText(g2);
        }
        g2.dispose();
        super.paintComponent(g);
    }

    private void createHintText(Graphics2D g) {
        FontMetrics fm = g.getFontMetrics();
        int c0 = getBackground().getRGB();
        int c1 = Color.WHITE.getRGB();
        int m = 0xfefefefe;
        int c2 = ((c0 & m) >>> 1) + ((c1 & m) >>> 1);

        if (cnx.connectionStatus() == 1) {
            g.setColor(new Color(c2, true));
            g.drawString("ON", ((getWidth() - fm.stringWidth("ON")) / 2), getHeight() / 2 + fm.getAscent() / 2 - 2);
        } else {
            g.setColor(new Color(c2, true));
            g.drawString("OFF", ((getWidth() - fm.stringWidth("OFF")) / 2), getHeight() / 2 + fm.getAscent() / 2 - 2);
        }
    }
}
