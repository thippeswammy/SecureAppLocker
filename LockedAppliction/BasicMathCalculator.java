package com.thippeswamy.app.LockedAppliction;


import com.thippeswamy.app.ApplicationLocker.LoginSystemAppliction;

import javax.swing.*;
import java.awt.*;

public class BasicMathCalculator extends JFrame {

    double a = 0;
    double b = 0;
    double result;
    char operator;
    int num = 0, dot = 1, number = 1;
    private JTextField jTextField1;

    /**
     * Creates new form MyCalculator
     */
    public BasicMathCalculator() {
        initComponents();
    }

    /**
     * @param args the command com.thippeswamy.app.swing.Line.line arguments
     */

    public static void main(String[] args) {
        LoginSystemAppliction LoginSystemAppliction = new LoginSystemAppliction("BasicMathCalculator");
        LoginSystemAppliction.run("BasicMathCalculator");
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jTextField1 = new JTextField();
        // Variables declaration - do not modify
        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();
        JButton jButton3 = new JButton();
        JButton jButton4 = new JButton();
        JButton jButton5 = new JButton();
        JButton jButton6 = new JButton();
        JButton jButton7 = new JButton();
        JButton jButton8 = new JButton();
        JButton jButton9 = new JButton();
        JButton jButton10 = new JButton();
        JButton jButton11 = new JButton();
        JButton jButton12 = new JButton();
        JButton jButton13 = new JButton();
        JButton jButton14 = new JButton();
        JButton jButton15 = new JButton();
        JButton jButton16 = new JButton();
        JButton jButton17 = new JButton();
        JButton jButton18 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("SimpleCalculator");
        setBounds(new Rectangle(500, 20, 0, 0));
        setResizable(false);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new Color(255, 255, 0));
        jTextField1.setFont(new Font("Dialog", Font.PLAIN, 28)); // NOI18N
        jTextField1.setForeground(new Color(0, 0, 204));
        jTextField1.setHorizontalAlignment(JTextField.RIGHT);

        jButton1.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(this::jButton1ActionPerformed

        );

        jButton2.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton5.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jButton6.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(this::jButton6ActionPerformed);

        jButton7.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        jButton8.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(this::jButton8ActionPerformed);

        jButton9.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(this::jButton9ActionPerformed);

        jButton10.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton10.setText("0");
        jButton10.addActionListener(this::jButton10ActionPerformed);

        jButton11.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton11.setText(".");
        jButton11.addActionListener(this::jButton11ActionPerformed);

        jButton12.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton12.setText("=");
        jButton12.addActionListener(this::jButton12ActionPerformed);

        jButton13.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton13.setText("+");
        jButton13.addActionListener(this::jButton13ActionPerformed);

        jButton14.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton14.setText("-");
        jButton14.addActionListener(this::jButton14ActionPerformed);

        jButton15.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton15.setText("X");
        jButton15.addActionListener(this::jButton15ActionPerformed);

        jButton16.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton16.setText("/");
        jButton16.addActionListener(this::jButton16ActionPerformed);

        jButton17.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton17.setText("Delete");
        jButton17.addActionListener(this::jButton17ActionPerformed);

        jButton18.setFont(new Font("Dialog", Font.BOLD, 18)); // NOI18N
        jButton18.setText("Clear");
        jButton18.addActionListener(this::jButton18ActionPerformed);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(13, 13, 13)))))
                                .addContainerGap(25, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(192, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton17, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(375, 375, 375)
                                        .addComponent(jButton18, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                        .addGap(22, 22, 22)))
        );

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "1");
        num = 1;
        if (number == 0)
            number = 1;
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "2");
        num = 1;
        if (number == 0)
            number = 1;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "3");
        num = 1;
        if (number == 0)
            number = 1;
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "4");
        num = 1;
        if (number == 0)
            number = 1;
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "5");
        num = 1;
        if (number == 0)
            number = 1;
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "6");
        num = 1;
        if (number == 0)
            number = 1;
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "7");
        num = 1;
        if (number == 0)
            number = 1;
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "8");
        num = 1;
        if (number == 0)
            number = 1;
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "9");
        num = 1;
        if (number == 0)
            number = 1;
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(jTextField1.getText() + "0");
        num = 1;
        if (number == 0)
            number = 1;
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        String s = jTextField1.getText();
        if (s.isEmpty()) {
            jTextField1.setText("0.");
            dot = 2;
            num = 0;
            number = 1;
        } else if (dot == 1) {
            jTextField1.setText(jTextField1.getText() + ".");
            dot = 2;
        }
    }

    public void calculate() {
        if (number >= 2) {
            String s = jTextField1.getText();
            if (!s.isEmpty())
                b = Double.parseDouble(s);
            else
                b = 0;

            jTextField1.setText("");
            result = 0;
            switch (operator) {
                case '+':
                    result = a + b;
                    break;

                case '-':
                    result = a - b;
                    break;

                case '*':
                    result = a * b;
                    break;

                case '/':
                    result = a / b;
                    break;
            }
            a = result;
        }
        if (number == 1)
            number = 2;
    }

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        String s = jTextField1.getText();
        if (!s.isEmpty())
            b = Double.parseDouble(s);
        else
            b = 0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        jTextField1.setText("" + result);
    }

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        String s = jTextField1.getText();
        if (!s.isEmpty()) {
            if (num == 1 && number == 1) {
                a = Double.parseDouble(s);
                jTextField1.setText("");

            }
            dot = 1;
            calculate();
            operator = '+';
        }
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        String s = jTextField1.getText();
        if (!s.isEmpty()) {
            if (num == 1 && number == 1) {
                a = Double.parseDouble(s);
                jTextField1.setText("");
            }
            dot = 1;
            calculate();
            operator = '-';
        }
    }

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
        String s = jTextField1.getText();
        if (!s.isEmpty()) {
            if (num == 1 && number == 1) {
                a = Double.parseDouble(s);
                jTextField1.setText("");
            }
            dot = 1;
            calculate();
            operator = '*';
        }
    }

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
        String s = jTextField1.getText();
        if (!s.isEmpty()) {
            if (num == 1 && number == 1) {
                a = Double.parseDouble(s);
                jTextField1.setText("");
            }
            dot = 1;
            calculate();
            operator = '/';
        }
    }

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
        String s = jTextField1.getText();
        if (!s.isEmpty())
            jTextField1.setText(s.substring(0, s.length() - 1));
    }

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("");
    }

    // End of variables declaration
    public void run() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasicMathCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasicMathCalculator().setVisible(true);
            }
        });
    }
}