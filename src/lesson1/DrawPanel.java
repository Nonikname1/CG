package lesson1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

public class DrawPanel extends JPanel {
    private static final Random rnd = new Random();
    private java.util.List<Sun> suns = new ArrayList<>();
    private static final Color[] COLORS = {Color.BLACK, Color.ORANGE, Color.YELLOW, Color.GRAY};
    private Timer t = new Timer(40, new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for (Sun s : suns) {
                s.setX(s.getX() - 1);
            }
            repaint();
        }
    });

    public DrawPanel() {
        for (int i = 0; i < 5; i++) {
            suns.add(new Sun(
                    100 + rnd.nextInt(400),
                    50 + rnd.nextInt(150),
                    10 + rnd.nextInt(90),
                    3 + rnd.nextInt(100),
                    10 + rnd.nextInt(190),
                    COLORS[rnd.nextInt(COLORS.length)]
            ));

        }
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    for (Sun s : suns) {
                        s.setX(s.getX() - 1);
                    }
                } else if (SwingUtilities.isRightMouseButton(e)) {
                    for (Sun s : suns) {
                        s.setX(s.getX() + 1);
                    }
                }
                repaint();
            }
        });
        t.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(200, 250, 280, 280);
        g.drawLine(200, 250, 340, 150);
        g.drawLine(340, 150, 480, 250);

        for (Sun s : suns) {
            s.draw((Graphics2D) g);
        }
    }
}
