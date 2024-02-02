// Number 15 Puzzle development...
package com.thippeswamy.app.LockedAppliction;

import com.thippeswamy.app.ApplicationLocker.LoginSystemAppliction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberPuzzleGame implements ActionListener {
    JFrame gameFrame;
    JFrame optionFrame;
    int gridSize = 0;
    int maxGridSize = 6;

    JButton[][] gameButtons = new JButton[maxGridSize][maxGridSize];
    JButton[] optionButtons = new JButton[maxGridSize];
    int times = 0;

    public NumberPuzzleGame() {
        optionFrame = new JFrame("My Puzzle");
        optionFrame.setVisible(true);
        optionFrame.setSize(100 * (maxGridSize - 1), 100 * (maxGridSize - 1));
        optionFrame.setLayout(new GridLayout((maxGridSize - 1), (maxGridSize - 1)));
        optionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        optionFrame.setLocation(dim.width / 2 - optionFrame.getSize().width / 2, dim.height / 2 - optionFrame.getSize().height / 2);
        Font fobj = new Font("Times New Roman", Font.BOLD, 32);
        String[] Fill = {"3 x 3", "4 x 4", "5 x 5", "6 x 6", "7 x 7"};
        for (int i = 0; i < maxGridSize - 1; i++) {
            optionButtons[i] = new JButton(Fill[i]);
            optionFrame.add(optionButtons[i]);
            optionButtons[i].setFont(fobj);
            optionButtons[i].setForeground(Color.BLUE);
            optionButtons[i].addActionListener(this);
        }
    }

    public static void main(String[] args) {
        LoginSystemAppliction login = new LoginSystemAppliction("NumberPuzzleGame");
        login.run("NumberPuzzleGame");
    }

    public void startGame() {
        gameFrame = new JFrame("My Puzzle");
        optionFrame.setVisible(false);
        gameFrame.setVisible(true);
        gameFrame.setSize(100 * gridSize, 100 * gridSize);
        gameFrame.setLayout(new GridLayout(gridSize, gridSize));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        gameFrame.setLocation(dim.width / 2 - gameFrame.getSize().width / 2, dim.height / 2 - gameFrame.getSize().height / 2);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font fobj = new Font("Times New Roman", Font.BOLD, 34);
        int index_for_pointer = 0;
        int[] INDEX = new int[gridSize * gridSize];
        String[] Fill = new String[gridSize * gridSize];
        String[] Filll = new String[gridSize * gridSize];
        int[] index = new int[gridSize * gridSize];
        //Double.toString

        for (int y = 0; y < gridSize * gridSize; y++) {
            if (y != 0) {
                Filll[y] = Integer.toString(y);
            } else {
                Filll[y] = "";
            }
            index[y] = y + 50;
            INDEX[y] = y + 50;
        }

        if (index_for_pointer == 0) {
            for (int ia = 0; ia < gridSize * gridSize; ia++) {
                int ramdom, times;
                for (int y1 = 0; y1 == 0; ) {
                    ramdom = (int) (Math.random() * 100);
                    if (ramdom < gridSize * gridSize && ramdom >= 0) {
                        times = 1;
                        for (int y2 = 0; y2 < gridSize * gridSize; y2++) {
                            if (ramdom == index[y2])
                                times++;
                        }
                        if (times == 1) {
                            y1 = 5;
                            index[ia] = ramdom;
                        }
                    }
                }
            }
            for (int i = 0; i < (gridSize * gridSize); i++) {
                Fill[i] = Filll[index[i]];
            }
        }
        int x = 0;
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                gameButtons[i][j] = new JButton(Fill[x++]);
                gameFrame.add(gameButtons[i][j]);

                gameButtons[i][j].setFont(fobj);
                gameButtons[i][j].setForeground(Color.BLUE);

                gameButtons[i][j].addActionListener(this);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < gridSize; i++)
            for (int j = 0; j < gridSize; j++)
                if (e.getSource() == gameButtons[i][j]) {
                    String s = gameButtons[i][j].getLabel();
                    times++;
                    if (i != 0) {
                        if (gameButtons[i - 1][j].getLabel().isEmpty()) {
                            gameButtons[i - 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i != gridSize - 1) {
                        if (gameButtons[i + 1][j].getLabel().isEmpty()) {
                            gameButtons[i + 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j != 0) {
                        if (gameButtons[i][j - 1].getLabel().isEmpty()) {
                            gameButtons[i][j - 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j != gridSize - 1) {
                        if (gameButtons[i][j + 1].getLabel().isEmpty()) {
                            gameButtons[i][j + 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 0) {
                        if (gameButtons[i][j + 2].getLabel().isEmpty()) {
                            gameButtons[i][j + 2].setLabel(gameButtons[i][j + 1].getLabel());
                            gameButtons[i][j + 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 2) {
                        if (gameButtons[i][j - 2].getLabel().isEmpty()) {
                            gameButtons[i][j - 2].setLabel(gameButtons[i][j - 1].getLabel());
                            gameButtons[i][j - 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 0 && gridSize >= 5) {
                        if (gameButtons[i][j + 4].getLabel().isEmpty()) {
                            gameButtons[i][j + 4].setLabel(gameButtons[i][j + 3].getLabel());
                            gameButtons[i][j + 3].setLabel(gameButtons[i][j + 2].getLabel());
                            gameButtons[i][j + 2].setLabel(gameButtons[i][j + 1].getLabel());
                            gameButtons[i][j + 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 0 && gridSize >= 6) {
                        if (gameButtons[i][j + 5].getLabel().isEmpty()) {
                            gameButtons[i][j + 5].setLabel(gameButtons[i][j + 4].getLabel());
                            gameButtons[i][j + 4].setLabel(gameButtons[i][j + 3].getLabel());
                            gameButtons[i][j + 3].setLabel(gameButtons[i][j + 2].getLabel());
                            gameButtons[i][j + 2].setLabel(gameButtons[i][j + 1].getLabel());
                            gameButtons[i][j + 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 1 && gridSize >= 6) {
                        if (gameButtons[i][j + 4].getLabel().isEmpty()) {
                            gameButtons[i][j + 4].setLabel(gameButtons[i][j + 3].getLabel());
                            gameButtons[i][j + 3].setLabel(gameButtons[i][j + 2].getLabel());
                            gameButtons[i][j + 2].setLabel(gameButtons[i][j + 1].getLabel());
                            gameButtons[i][j + 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 2 && gridSize >= 6) {
                        if (gameButtons[i][j + 3].getLabel().isEmpty()) {
                            gameButtons[i][j + 3].setLabel(gameButtons[i][j + 2].getLabel());
                            gameButtons[i][j + 2].setLabel(gameButtons[i][j + 1].getLabel());
                            gameButtons[i][j + 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 4 && gridSize >= 5) {
                        if (gameButtons[i][j - 4].getLabel().isEmpty()) {
                            gameButtons[i][j - 4].setLabel(gameButtons[i][j - 3].getLabel());
                            gameButtons[i][j - 3].setLabel(gameButtons[i][j - 2].getLabel());
                            gameButtons[i][j - 2].setLabel(gameButtons[i][j - 1].getLabel());
                            gameButtons[i][j - 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 5 && gridSize >= 6) {
                        if (gameButtons[i][j - 5].getLabel().isEmpty()) {
                            gameButtons[i][j - 5].setLabel(gameButtons[i][j - 4].getLabel());
                            gameButtons[i][j - 4].setLabel(gameButtons[i][j - 3].getLabel());
                            gameButtons[i][j - 3].setLabel(gameButtons[i][j - 2].getLabel());
                            gameButtons[i][j - 2].setLabel(gameButtons[i][j - 1].getLabel());
                            gameButtons[i][j - 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 5 && gridSize >= 6) {
                        if (gameButtons[i][j - 4].getLabel().isEmpty()) {
                            gameButtons[i][j - 4].setLabel(gameButtons[i][j - 3].getLabel());
                            gameButtons[i][j - 3].setLabel(gameButtons[i][j - 2].getLabel());
                            gameButtons[i][j - 2].setLabel(gameButtons[i][j - 1].getLabel());
                            gameButtons[i][j - 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 5 && gridSize >= 6) {
                        if (gameButtons[i][j - 3].getLabel().isEmpty()) {
                            gameButtons[i][j - 3].setLabel(gameButtons[i][j - 2].getLabel());
                            gameButtons[i][j - 2].setLabel(gameButtons[i][j - 1].getLabel());
                            gameButtons[i][j - 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 5 && gridSize >= 6) {
                        if (gameButtons[i][j - 2].getLabel().isEmpty()) {
                            gameButtons[i][j - 2].setLabel(gameButtons[i][j - 1].getLabel());
                            gameButtons[i][j - 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 4 && gridSize >= 5) {
                        if (gameButtons[i][j - 3].getLabel().isEmpty()) {
                            gameButtons[i][j - 3].setLabel(gameButtons[i][j - 2].getLabel());
                            gameButtons[i][j - 2].setLabel(gameButtons[i][j - 1].getLabel());
                            gameButtons[i][j - 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 4 && gridSize >= 5) {
                        if (gameButtons[i][j - 2].getLabel().isEmpty()) {
                            gameButtons[i][j - 2].setLabel(gameButtons[i][j - 1].getLabel());
                            gameButtons[i][j - 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 1 && gridSize >= 5) {
                        if (gameButtons[i][j + 3].getLabel().isEmpty()) {
                            gameButtons[i][j + 3].setLabel(gameButtons[i][j + 2].getLabel());
                            gameButtons[i][j + 2].setLabel(gameButtons[i][j + 1].getLabel());
                            gameButtons[i][j + 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 2 && gridSize >= 5) {
                        if (gameButtons[i][j + 2].getLabel().isEmpty()) {
                            gameButtons[i][j + 2].setLabel(gameButtons[i][j + 1].getLabel());
                            gameButtons[i][j + 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 3 && gridSize >= 6) {
                        if (gameButtons[i][j + 2].getLabel().isEmpty()) {
                            gameButtons[i][j + 2].setLabel(gameButtons[i][j + 1].getLabel());
                            gameButtons[i][j + 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 3 && gridSize >= 5) {
                        if (gameButtons[i][j - 3].getLabel().isEmpty()) {
                            gameButtons[i][j - 3].setLabel(gameButtons[i][j - 2].getLabel());
                            gameButtons[i][j - 2].setLabel(gameButtons[i][j - 1].getLabel());
                            gameButtons[i][j - 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 3 && gridSize >= 4) {
                        if (gameButtons[i][j - 2].getLabel().isEmpty()) {
                            gameButtons[i][j - 2].setLabel(gameButtons[i][j - 1].getLabel());
                            gameButtons[i][j - 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 0 && gridSize >= 4) {
                        if (gameButtons[i][j + 3].getLabel().isEmpty()) {
                            gameButtons[i][j + 3].setLabel(gameButtons[i][j + 2].getLabel());
                            gameButtons[i][j + 2].setLabel(gameButtons[i][j + 1].getLabel());
                            gameButtons[i][j + 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 3 && gridSize >= 4) {
                        if (gameButtons[i][j - 3].getLabel().isEmpty()) {
                            gameButtons[i][j - 3].setLabel(gameButtons[i][j - 2].getLabel());
                            gameButtons[i][j - 2].setLabel(gameButtons[i][j - 1].getLabel());
                            gameButtons[i][j - 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 0 && gridSize >= 4) {
                        if (gameButtons[i + 2][j].getLabel().isEmpty()) {
                            gameButtons[i + 2][j].setLabel(gameButtons[i + 1][j].getLabel());
                            gameButtons[i + 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 3 && gridSize >= 4) {
                        if (gameButtons[i - 2][j].getLabel().isEmpty()) {
                            gameButtons[i - 2][j].setLabel(gameButtons[i - 1][j].getLabel());
                            gameButtons[i - 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 0 && gridSize >= 4) {
                        if (gameButtons[i + 3][j].getLabel().isEmpty()) {
                            gameButtons[i + 3][j].setLabel(gameButtons[i + 2][j].getLabel());
                            gameButtons[i + 2][j].setLabel(gameButtons[i + 1][j].getLabel());
                            gameButtons[i + 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 3 && gridSize >= 4) {
                        if (gameButtons[i - 3][j].getLabel().isEmpty()) {
                            gameButtons[i - 3][j].setLabel(gameButtons[i - 2][j].getLabel());
                            gameButtons[i - 2][j].setLabel(gameButtons[i - 1][j].getLabel());
                            gameButtons[i - 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (j == 1 && gridSize >= 4) {
                        if (gameButtons[i][j + 2].getLabel().isEmpty()) {
                            gameButtons[i][j + 2].setLabel(gameButtons[i][j + 1].getLabel());
                            gameButtons[i][j + 1].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 0) {
                        if (gameButtons[i + 2][j].getLabel().isEmpty()) {
                            gameButtons[i + 2][j].setLabel(gameButtons[i + 1][j].getLabel());
                            gameButtons[i + 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 2) {
                        if (gameButtons[i - 2][j].getLabel().isEmpty()) {
                            gameButtons[i - 2][j].setLabel(gameButtons[i - 1][j].getLabel());
                            gameButtons[i - 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 1 && gridSize >= 4) {
                        if (gameButtons[i + 2][j].getLabel().isEmpty()) {
                            gameButtons[i + 2][j].setLabel(gameButtons[i + 1][j].getLabel());
                            gameButtons[i + 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 2 && gridSize >= 4) {
                        if (gameButtons[i - 2][j].getLabel().isEmpty()) {
                            gameButtons[i - 2][j].setLabel(gameButtons[i - 1][j].getLabel());
                            gameButtons[i - 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 0 && gridSize >= 5) {
                        if (gameButtons[i + 4][j].getLabel().isEmpty()) {
                            gameButtons[i + 4][j].setLabel(gameButtons[i + 3][j].getLabel());
                            gameButtons[i + 3][j].setLabel(gameButtons[i + 2][j].getLabel());
                            gameButtons[i + 2][j].setLabel(gameButtons[i + 1][j].getLabel());
                            gameButtons[i + 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 0 && gridSize >= 6) {
                        if (gameButtons[i + 5][j].getLabel().isEmpty()) {
                            gameButtons[i + 5][j].setLabel(gameButtons[i + 4][j].getLabel());
                            gameButtons[i + 4][j].setLabel(gameButtons[i + 3][j].getLabel());
                            gameButtons[i + 3][j].setLabel(gameButtons[i + 2][j].getLabel());
                            gameButtons[i + 2][j].setLabel(gameButtons[i + 1][j].getLabel());
                            gameButtons[i + 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 1 && gridSize >= 6) {
                        if (gameButtons[i + 4][j].getLabel().isEmpty()) {
                            gameButtons[i + 4][j].setLabel(gameButtons[i + 3][j].getLabel());
                            gameButtons[i + 3][j].setLabel(gameButtons[i + 2][j].getLabel());
                            gameButtons[i + 2][j].setLabel(gameButtons[i + 1][j].getLabel());
                            gameButtons[i + 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 2 && gridSize >= 6) {
                        if (gameButtons[i + 3][j].getLabel().isEmpty()) {
                            gameButtons[i + 3][j].setLabel(gameButtons[i + 2][j].getLabel());
                            gameButtons[i + 2][j].setLabel(gameButtons[i + 1][j].getLabel());
                            gameButtons[i + 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 3 && gridSize >= 6) {
                        if (gameButtons[i + 2][j].getLabel().isEmpty()) {
                            gameButtons[i + 2][j].setLabel(gameButtons[i + 1][j].getLabel());
                            gameButtons[i + 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 4 && gridSize >= 5) {
                        if (gameButtons[i - 4][j].getLabel().isEmpty()) {
                            gameButtons[i - 4][j].setLabel(gameButtons[i - 3][j].getLabel());
                            gameButtons[i - 3][j].setLabel(gameButtons[i - 2][j].getLabel());
                            gameButtons[i - 2][j].setLabel(gameButtons[i - 1][j].getLabel());
                            gameButtons[i - 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 5 && gridSize >= 6) {
                        if (gameButtons[i - 5][j].getLabel().isEmpty()) {
                            gameButtons[i - 5][j].setLabel(gameButtons[i - 4][j].getLabel());
                            gameButtons[i - 4][j].setLabel(gameButtons[i - 3][j].getLabel());
                            gameButtons[i - 3][j].setLabel(gameButtons[i - 2][j].getLabel());
                            gameButtons[i - 2][j].setLabel(gameButtons[i - 1][j].getLabel());
                            gameButtons[i - 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 5 && gridSize >= 6) {
                        if (gameButtons[i - 4][j].getLabel().isEmpty()) {
                            gameButtons[i - 4][j].setLabel(gameButtons[i - 3][j].getLabel());
                            gameButtons[i - 3][j].setLabel(gameButtons[i - 2][j].getLabel());
                            gameButtons[i - 2][j].setLabel(gameButtons[i - 1][j].getLabel());
                            gameButtons[i - 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 5 && gridSize >= 6) {
                        if (gameButtons[i - 3][j].getLabel().isEmpty()) {
                            gameButtons[i - 3][j].setLabel(gameButtons[i - 2][j].getLabel());
                            gameButtons[i - 2][j].setLabel(gameButtons[i - 1][j].getLabel());
                            gameButtons[i - 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 5 && gridSize >= 6) {
                        if (gameButtons[i - 2][j].getLabel().isEmpty()) {
                            gameButtons[i - 2][j].setLabel(gameButtons[i - 1][j].getLabel());
                            gameButtons[i - 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 4 && gridSize >= 5) {
                        if (gameButtons[i - 3][j].getLabel().isEmpty()) {
                            gameButtons[i - 3][j].setLabel(gameButtons[i - 2][j].getLabel());
                            gameButtons[i - 2][j].setLabel(gameButtons[i - 1][j].getLabel());
                            gameButtons[i - 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 4 && gridSize >= 5) {
                        if (gameButtons[i - 2][j].getLabel().isEmpty()) {
                            gameButtons[i - 2][j].setLabel(gameButtons[i - 1][j].getLabel());
                            gameButtons[i - 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 1 && gridSize >= 5) {
                        if (gameButtons[i + 3][j].getLabel().isEmpty()) {
                            gameButtons[i + 3][j].setLabel(gameButtons[i + 2][j].getLabel());
                            gameButtons[i + 2][j].setLabel(gameButtons[i + 1][j].getLabel());
                            gameButtons[i + 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 2 && gridSize >= 5) {
                        if (gameButtons[i + 2][j].getLabel().isEmpty()) {
                            gameButtons[i + 2][j].setLabel(gameButtons[i + 1][j].getLabel());
                            gameButtons[i + 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                            continue;
                        }
                    }
                    if (i == 3 && gridSize >= 5) {
                        if (gameButtons[i - 3][j].getLabel().isEmpty()) {
                            gameButtons[i - 3][j].setLabel(gameButtons[i - 2][j].getLabel());
                            gameButtons[i - 2][j].setLabel(gameButtons[i - 1][j].getLabel());
                            gameButtons[i - 1][j].setLabel(s);
                            gameButtons[i][j].setLabel("");
                        }
                    }
                }

        for (int ii = 0; ii < maxGridSize; ii++)
            if (e.getSource() == optionButtons[ii]) {

                if (ii < maxGridSize)
                    if (optionButtons[ii].getLabel().equals("3 x 3")) {
                        gridSize = 3;
                    }

                if (ii < maxGridSize)
                    if (optionButtons[ii].getLabel().equals("4 x 4")) {
                        gridSize = 4;
                    }

                if (ii < maxGridSize)
                    if (optionButtons[ii].getLabel().equals("5 x 5")) {
                        gridSize = 5;
                    }

                if (ii < maxGridSize)
                    if (optionButtons[ii].getLabel().equals("6 x 6")) {
                        gridSize = 6;
                    }

                if (gridSize != 0) {
                    startGame();
                }
            }
        if (gridSize >= 1) {
            boolean flag = true;
            int num = 0;

            for (int i = 0; i < gridSize; i++)
                for (int j = 0; j < gridSize; j++) {
                    String m = gameButtons[i][j].getLabel();
                    num++;

                    if (!m.isEmpty()) {
                        int a = Integer.parseInt(m);

                        if (a != num)
                            flag = false;
                    }
                }

            if (flag) {
                JOptionPane.showMessageDialog(gameFrame, " Congrates! You Won... ");
            }
        }
    }
}

