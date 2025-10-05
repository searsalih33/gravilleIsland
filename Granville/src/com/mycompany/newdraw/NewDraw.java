package com.mycompany.newdraw;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class NewDraw extends JPanel implements KeyListener {
    static BufferedImage image1;
    long imageDisplayTime = 0;
    boolean showImage = false;
    static final int BALL_WIDTH = 10;
    static int Width = 1200;
    static int Height = 620;
    static int LeftX = 40;
    static int RightX = Width + LeftX;
    static int TopY = 70;
    static int BottomY = Height + TopY;
    static int bally = 590;
    static int ballx = 850;
    int point = 0;
    boolean onPinkShape = false;
    boolean onYellowShape = false;
    boolean onBlueShape = false;
    boolean onPinkShap = false;
    boolean onYellowSh = false;
    boolean onBlueS = false;
    boolean onPi = false;
    boolean oYello = false;
    boolean onl = false;
    boolean onPinkSh = false;
    boolean onYellowShe = false;
    boolean onBlueape = false;
    boolean onPiShape = false;
    boolean onYeowShape = false;
    boolean onBlShape = false;
    boolean onBlueRect1 = false;
    boolean onBlueRect2 = false;
    boolean onBlueRect3 = false;
    boolean onBlueRect4 = false;
    boolean onBlueRect5 = false;
    boolean onBlueRect6 = false;
    boolean onBlueRect7 = false;
    int lives = 3;


    int[] xa1 = {845, 845, 835, 835, 825, 825, 815, 815, 805, 805, 740, 740};
    int[] ya1 = {250, 180, 180, 190, 190, 180, 180, 190, 190, 180, 180, 250};
    int[] xa = {450, 450, 420, 420, 394, 394, 370, 370, 350, 350, 330, 330, 310, 310};
    int[] ya = {250, 210, 210, 200, 200, 210, 210, 190, 190, 170, 170, 190, 190, 250};
    int[] xaa = {585, 585, 565, 565, 529, 529};
    int[] yaa = {230, 170, 170, 160, 160, 230};
    int[] xa11 = {1170, 1120, 1120};
    int[] ya11 = {290, 340, 240};
    int[] xa111 = {1075, 1045, 1005, 1035};
    int[] ya111 = {215, 175, 225, 265};
    int[] xa1111 = {1115, 1065, 1045, 1015, 1000, 1095};
    int[] ya1111 = {375, 345, 367, 350, 375, 410};
    int[] xa2 = {1090, 1000, 990, 1075};
    int[] ya2 = {420, 395, 425, 450};
    int[] xa22 = {570, 530, 470, 560};
    int[] ya22 = {510, 480, 540, 560};
    int[] xa222 = {520, 460, 390, 455};
    int[] ya222 = {460, 415, 465, 525};
    int[] xa2222 = {440, 390, 320, 370};
    int[] ya2222 = {400, 350, 390, 450};
    int[] xa3 = {450, 350, 400};
    int[] ya3 = {280, 280, 320};
    int[] xa33 = {510, 440, 500, 550};
    int[] ya33 = {305, 350, 405, 370};
    int[] xa333 = {670, 560, 600, 620};
    int[] ya333 = {280, 280, 320, 320};



    @Override
    public void keyTyped(KeyEvent e) {
    }

    private void displayPictures() {
        if (onPinkShape || onYellowSh || onBlueRect3 || onPi || onYellowShe) {
            lives--;
            try {
                image1 = ImageIO.read(new File("image/loseLife.jpg"));
            } catch (IOException ex) {
                System.out.println("Lose life image not found");
            }
            showImage = true;
            imageDisplayTime = System.currentTimeMillis();
            return;
        }


        if (onYellowShape || onBlueShape || onPinkShap || onBlueS || oYello) {
            try {
                image1 = ImageIO.read(new File("image/ronaldo.jpg"));
            } catch (IOException ex) {
                System.out.println("Ronaldo image not found");
            }
            point = point + 10;
            showImage = true;
            imageDisplayTime = System.currentTimeMillis();
        }
        else if (onl || onPinkSh || onBlueape || onPiShape || onYeowShape || onBlShape ||
                onBlueRect1 || onBlueRect2 || onBlueRect4 || onBlueRect5 || onBlueRect6 || onBlueRect7) {
            try {
                image1 = ImageIO.read(new File("image/messi.jpg"));
            } catch (IOException ex) {
                System.out.println("Messi image not found");
            }
            point = point + 10;
            showImage = true;
            imageDisplayTime = System.currentTimeMillis();
        }
    }


    @Override
    public void keyPressed(KeyEvent e) {
        int speed = 10;
        if (e.getKeyCode() == KeyEvent.VK_UP && bally - speed >= TopY) {
            bally -= speed;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN && bally + BALL_WIDTH + speed <= BottomY) {
            bally += speed;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && ballx + BALL_WIDTH + speed <= RightX) {
            ballx += speed;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT && ballx - speed >= LeftX) {
            ballx -= speed;
        }

        onPinkShape = isBallOnShape(xa, ya, 14);
        onYellowShape = isBallOnShape(xaa, yaa, 6);
        onBlueShape = isBallOnShape(new int[]{470, 515, 515, 470}, new int[]{170, 170, 240, 240}, 4);
        onPinkShap = isBallOnShape(xa1, ya1, 12);
        onYellowSh = isBallOnShape(xa11, ya11, 3);
        onBlueS = isBallOnShape(xa111, ya111, 4);
        onPi = isBallOnShape(xa1111, ya1111, 6);
        oYello = isBallOnShape(xa2, ya2, 4);
        onl = isBallOnShape(xa22, ya22, 4);
        onPinkSh = isBallOnShape(xa222, ya222, 4);
        onYellowShe = isBallOnShape(xa2222, ya2222, 4);
        onBlueape = isBallOnShape(xa3, ya3, 3);
        onPiShape = isBallOnShape(xa33, ya33, 4);
        onYeowShape = isBallOnShape(xa333, ya333, 4);
        onBlShape = isBallOnShape(xaa, yaa, 6);
        onBlueRect1 = isBallOnRectangle(620, 370, 65, 100);
        onBlueRect2 = isBallOnRectangle(470, 170, 45, 70);
        onBlueRect3 = isBallOnRectangle(770, 490, 40, 96);
        onBlueRect4 = isBallOnRectangle(820, 490, 40, 40);
        onBlueRect5 = isBallOnRectangle(820, 545, 40, 40);
        onBlueRect6 = isBallOnRectangle(870, 180, 100, 60);
        onBlueRect7 = isBallOnRectangle(610, 515, 100, 60);

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            displayPictures();
        }

        if (ballx < LeftX) {
            ballx = LeftX;
        }
        if (ballx + BALL_WIDTH > RightX) {
            ballx = RightX - BALL_WIDTH;
        }
        if (bally < TopY) {
            bally = TopY;
        }
        if (bally + BALL_WIDTH > BottomY) {
            bally = BottomY - BALL_WIDTH;
        }
    }

    private boolean isBallOnShape(int[] xPoints, int[] yPoints, int nPoints) {
        int insideS = 0;
        for (int i = 0; i < nPoints; i++) {
            int x1 = xPoints[i];
            int y1 = yPoints[i];
            int x2 = xPoints[(i + 1) % nPoints];
            int y2 = yPoints[(i + 1) % nPoints];
            if (((y1 <= bally + BALL_WIDTH / 2 && bally + BALL_WIDTH / 2 < y2) || (y2 <= bally + BALL_WIDTH / 2 && bally + BALL_WIDTH / 2 < y1)) && (ballx + BALL_WIDTH / 2 < (x2 - x1) * (bally + BALL_WIDTH / 2 - y1) / (y2 - y1) + x1)) {
                insideS++;
            }
        }
        return insideS % 2 == 1;
    }
    private boolean isBallOnRectangle(int x, int y, int width, int height) {
        return ballx + BALL_WIDTH > x && ballx < x + width &&
                bally + BALL_WIDTH > y && bally < y + height;
    }



    @Override
    public void keyReleased(KeyEvent e) {
    }

    //This is where the frame is painted.
    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        //Background
        //Background
        Color b = new Color(114, 213, 255);
        Color c = new Color(176, 187, 188);
        g.setColor(b);
        g.fillRect(LeftX, TopY, Width, Height);

        int[] x = {352, 693, 817, 900, 960, 993, 960, 1068, 1192, 1050, 267, 240, 150};
        int[] y = {587, 587, 662, 625, 662, 587, 512, 475, 287, 137, 137, 175, 325};
        g.setColor(c);
        g.fillPolygon(x, y, 13);

        int[] xa = {450, 450, 420, 420, 394, 394, 370, 370, 350, 350, 330, 330, 310, 310};
        int[] ya = {250, 210, 210, 200, 200, 210, 210, 190, 190, 170, 170, 190, 190, 250};
        g.setColor(Color.PINK);
        g.fillPolygon(xa, ya, 14);

        int[] xaa = {585, 585, 565, 565, 529, 529};
        int[] yaa = {230, 170, 170, 160, 160, 230};
        g.setColor(Color.YELLOW);
        g.fillPolygon(xaa, yaa, 6);

        int[] xa1 = {845, 845, 835, 835, 825, 825, 815, 815, 805, 805, 740, 740};
        int[] ya1 = {250, 180, 180, 190, 190, 180, 180, 190, 190, 180, 180, 250};
        g.setColor(Color.PINK);
        g.fillPolygon(xa1, ya1, 12);

        int[] xa11 = {1170, 1120, 1120};
        int[] ya11 = {290, 340, 240};
        g.setColor(Color.GREEN);
        g.fillPolygon(xa11, ya11, 3);

        int[] xa111 = {1075, 1045, 1005, 1035};
        int[] ya111 = {215, 175, 225, 265};
        g.setColor(Color.BLUE);
        g.fillPolygon(xa111, ya111, 4);

        int[] xa1111 = {1115, 1065, 1045, 1015, 1000, 1095};
        int[] ya1111 = {375, 345, 367, 350, 375, 410};
        g.setColor(Color.PINK);
        g.fillPolygon(xa1111, ya1111, 6);

        int[] xa2 = {1090, 1000, 990, 1075};
        int[] ya2 = {420, 395, 425, 450};
        g.setColor(Color.PINK);
        g.fillPolygon(xa2, ya2, 4);

        int[] xa22 = {570, 530, 470, 560};
        int[] ya22 = {510, 480, 540, 560};
        g.setColor(Color.PINK);
        g.fillPolygon(xa22, ya22, 4);

        int[] xa222 = {520, 460, 390, 455};
        int[] ya222 = {460, 415, 465, 525};
        g.setColor(Color.PINK);
        g.fillPolygon(xa222, ya222, 4);

        int[] xa2222 = {440, 390, 320, 370};
        int[] ya2222 = {400, 350, 390, 450};
        g.setColor(Color.PINK);
        g.fillPolygon(xa2222, ya2222, 4);

        int[] xa3 = {450, 350, 400};
        int[] ya3 = {280, 280, 320};
        g.setColor(Color.GREEN);
        g.fillPolygon(xa3, ya3, 3);

        int[] xa33 = {510, 440, 500, 550};
        int[] ya33 = {305, 350, 405, 370};
        g.setColor(Color.PINK);
        g.fillPolygon(xa33, ya33, 4);

        int[] xa333 = {670, 560, 600, 620};
        int[] ya333 = {280, 280, 320, 320};
        g.setColor(Color.PINK);
        g.fillPolygon(xa333, ya333, 4);

        g.setColor(Color.BLUE);
        g.fillRect(620, 370, 65, 100);

        g.setColor(Color.BLUE);
        g.fillRect(470, 170, 45, 70);

        g.setColor(Color.BLUE);
        g.fillRect(770, 490, 40, 96);

        g.setColor(Color.BLUE);
        g.fillRect(820, 490, 40, 40);

        g.setColor(Color.BLUE);
        g.fillRect(820, 545, 40, 40);

        g.setColor(Color.BLUE);
        g.fillRect(870, 180, 100, 60);

        g.setColor(Color.BLUE);
        g.fillRect(610, 515, 100, 60);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(15));
        g2d.drawLine(300, 267, 990, 267);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(15));
        g2d.drawLine(300, 267, 600, 507);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(15));
        g2d.drawLine(600, 507, 700, 498);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(15));
        g2d.drawLine(700, 490, 720, 267);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(15));
        g2d.drawLine(720, 267, 600, 365);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(15));
        g2d.drawLine(600, 365, 520, 267);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(15));
        g2d.drawLine(520, 267, 400, 347);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(15));
        g2d.drawLine(600, 365, 600, 507);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(15));
        g2d.drawLine(990, 267, 700, 498);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(15));
        g2d.drawLine(600, 507, 590, 585);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Points: " + point, 50, 50);
        g.drawString("Lives: " + lives, 200, 50);

        //Ball
        g.setColor(Color.WHITE);
        g.fillOval(ballx, bally, BALL_WIDTH, BALL_WIDTH);


        if (showImage && image1 != null) {
            g.drawImage(image1, 300, 70, 400, 400, this);
            }

        if (showImage && System.currentTimeMillis() - imageDisplayTime > 2000) {
            showImage = false;
            image1 = null;
        }

    }

    static void main(String[] args) throws InterruptedException {
        NewDraw expo = new NewDraw();
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(1000, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addKeyListener(expo);
        f.add(expo);

        while (expo.point < 50 && expo.lives > 0) {
            f.repaint();
        }
        f.dispose();
        if (expo.lives == 0) {
            System.out.println("Game Over! You lost all lives.");
        } else {
            System.out.println("Your total point is " + expo.point + " YOU WIN!");
        }
    }
}