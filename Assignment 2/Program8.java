import javax.swing.*;
import java.awt.event.*;
class InvestmentCalculator {
    public static void main(String[] args) {

        JFrame f = new JFrame("Investment Calculator");

        JLabel l1 = new JLabel("Amount:");
        JLabel l2 = new JLabel("Rate:");
        JLabel l3 = new JLabel("Years:");
        JLabel result = new JLabel("Result:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton btn = new JButton("Calculate");

        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(150, 50, 100, 30);

        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(150, 100, 100, 30);

        l3.setBounds(50, 150, 100, 30);
        t3.setBounds(150, 150, 100, 30);

        btn.setBounds(100, 200, 100, 30);
        result.setBounds(50, 250, 200, 30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(t1.getText());
                double r = Double.parseDouble(t2.getText());
                int n = Integer.parseInt(t3.getText());

                double si = (p * r * n) / 100;
                result.setText("Simple Interest: " + si);
            }
        });

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(btn); f.add(result);

        f.setSize(350, 350);
        f.setLayout(null);
        f.setVisible(true);
    }
}