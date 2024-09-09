package lesson1;

import java.awt.*;

public class Sun {
    private int x;
    private int y;
    private int r;
    private int n;
    private int l;
    private Color c;

    public Sun(int x, int y, int r, int n, int l, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.n = n;
        this.l = l;
        this.c = c;
    }

    public int getX() {

        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public int getN() {
        return n;
    }

    public int getL() {
        return l;
    }

    public Color getC() {
        return c;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void draw(Graphics2D g){
        g.setPaint(c);
        g.fillOval(x-r, y-r, r + r, r + r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++){
            double a = i * da;
            double x1 = r * Math.cos(a);
            double x2 = (r + l) * Math.cos(a);
            double y1 = r * Math.sin(a);
            double y2 = (r + l) * Math.sin(a);
            g.drawLine((int) (x1 + x), (int) (y1+y), (int) (x2+x), (int) (y2+y));
        }
    }
}
