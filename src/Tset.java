import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import java.util.function.DoublePredicate;

public class Tset extends JFrame {

    private double total1 =0.0;
    private double total2 =0.0;
    private char math;
    private JPanel TESTO;
    private JButton Num1;
    private JButton Num2;
    private JButton Num3;
    private JButton Num4;
    private JButton Num5;
    private JButton Num6;
    private JButton Num7;
    private JButton Num8;
    private JButton Num9;
    private JButton Num0;
    private JButton plus;
    private JButton min;
    private JTextField enterTextField;
    private JButton ClC;
    private JButton eq;
    private JButton boint;
    private JButton div;
    private JButton multi;

    private void get_op(String opo){
        math=opo.charAt(0);
        total1+=Double.parseDouble(enterTextField.getText());
        enterTextField.setText("");
    }

    public Tset(){
        add(TESTO);
        setTitle("MY CALCLUTAOR BRO ");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1=enterTextField.getText()+boint.getText();
                enterTextField.setText(button1);
            }
        });

        Num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1=enterTextField.getText()+Num1.getText();
                enterTextField.setText(button1);
            }
        });
        Num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1=enterTextField.getText()+Num2.getText();
                enterTextField.setText(button1);
            }
        });
        Num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1=enterTextField.getText()+Num3.getText();
                enterTextField.setText(button1);
            }
        });
        Num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1=enterTextField.getText()+Num4.getText();
                enterTextField.setText(button1);
            }
        });
        Num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1=enterTextField.getText()+Num5.getText();
                enterTextField.setText(button1);
            }
        });
        Num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1=enterTextField.getText()+Num6.getText();
                enterTextField.setText(button1);
            }
        });
        Num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1=enterTextField.getText()+Num7.getText();
                enterTextField.setText(button1);
            }
        });
        Num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1=enterTextField.getText()+Num8.getText();
                enterTextField.setText(button1);
            }
        });
        Num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1=enterTextField.getText()+Num9.getText();
                enterTextField.setText(button1);
            }
        });
        Num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1=enterTextField.getText()+Num0.getText();
                enterTextField.setText(button1);
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pluse=plus.getText();
                get_op(pluse);
            }
        });
        min.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mine=min.getText();
                get_op(mine);
            }
        });
        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mul=multi.getText();
                get_op(mul);
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String divr=div.getText();
                get_op(divr);
            }
        });
        ClC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=0;
                enterTextField.setText("");
            }
        });

        eq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math){
                    case '+':
                        total2=total1+Double.parseDouble(enterTextField.getText());
                        break;
                    case '-':
                        total2=total1-Double.parseDouble(enterTextField.getText());
                        break;
                    case '*':
                        total2=total1*Double.parseDouble(enterTextField.getText());
                        break;
                    case '/':
                        total2=total1/Double.parseDouble(enterTextField.getText());
                        break;
                }

                enterTextField.setText(Double.toString(total2));
                total1=0;
            }
        });
    }
}
