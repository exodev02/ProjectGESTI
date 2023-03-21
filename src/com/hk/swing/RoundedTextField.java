package com.hk.swing;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RoundedTextField extends JTextField {

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    private String hint = "";
    private Color borderColor = Color.WHITE;

    public RoundedTextField() {
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setBackground(new Color(0, 0, 0, 0));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(borderColor);
        int width = getWidth() - 1;
        int height = getHeight() - 1;

        g2.draw(new RoundRectangle2D.Double(0, 0, width, height, height, height));

        if (getHint().equals("") && getText().length() == 0) {
            createHintText(g2);
        }
        g2.dispose();
        super.paintComponent(g);
    }

    private void createHintText(Graphics2D g) {
        FontMetrics fm = g.getFontMetrics();
        int c0 = getBackground().getRGB();
        int c1 = getForeground().getRGB();
        int m = 0xfefefefe;
        int c2 = ((c0 & m) >>> 1) + ((c1 & m) >>> 1);
        g.setColor(new Color(c2, true));
        g.drawString(getHint(), ((getWidth() - fm.stringWidth(getHint())) / 2), getHeight() / 2 + fm.getAscent() / 2 - 2);
    }
}
