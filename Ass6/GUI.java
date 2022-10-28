import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class GUI extends JFrame {
    GUI() {
        //set up the screen layout
        setTitle("Weighted Grade Calculator");
        setSize(1000, 200);
        setJPanel();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        //create four text fields for total points, earned points, assignment percentage and weighted grade
        JTextField text1 = new JTextField(10);
        JTextField text2 = new JTextField(10);
        JTextField text3 = new JTextField(10);
        JTextField text4 = new JTextField(20);
       //create JPanel to create containers
    private void setJPanel() {
        //set a container
        JPanel panel = new JPanel();
        this.setContentPane(panel);

        //create labels and text fields
        JLabel label1 = new JLabel("Total Assignment Points");
        panel.add(label1);
        panel.add(text1);
        JLabel label2 = new JLabel("Earned Assignment Points");
        panel.add(label2);
        panel.add(text2);
        JLabel label3 = new JLabel("Assignment Percentage");
        panel.add(label3);
        panel.add(text3);

        //add a calculate button
        JButton button = new JButton("click to calculate weighted grade");
        button.setOpaque(true);
        button.setBackground(Color.RED);
        button.setForeground(Color.RED);
        panel.add(button);
        //make the button click to calculate
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        JLabel label4 = new JLabel("The Weighted Grade:");
        panel.add(label4);
        panel.add(text4);
    }

    //create calculate method to calculate the weighted grade
    public void calculate() {
        //initial attributes to get text input
        double pointTotal = Double.parseDouble(text1.getText());
        double earnedPoints = Double.parseDouble(text2.getText());
        double assPercent = Double.parseDouble(text3.getText());
        //call getWeight() to calculate
        WeightCal weightCalculator = new WeightCal(200, 175, (float)0.35);
        double weightGrade = Double.parseDouble(String.valueOf(weightCalculator.getWeight()));
        text4.setText(String.valueOf(weightGrade));
    }
}

