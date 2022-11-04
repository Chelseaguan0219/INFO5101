import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    GUI() {
        //set up the screen layout
        setTitle("Data Files and GUI");
        setSize(800, 800);
        setJPanel();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        String[] data;

    //create JPanel to create containers
    public void setJPanel() {

        //set a container
        JPanel panel = new JPanel();
        this.setContentPane(panel);

        // set default layout to be null
        panel.setLayout(null);

        // create 2 labels
        JLabel label1 = new JLabel("Reading File Name");
        label1.setBounds(100,50,200,25);
        panel.add(label1);
        JLabel label2 = new JLabel("File Name to Write");
        label2.setBounds(400,50,200,25);
        panel.add(label2);

        // create 2 JTextFields
        JTextField inputFile = new JTextField("annual.csv");
        inputFile.setBounds(50, 70, 200, 25);
        panel.add(inputFile);
        JTextField outputFile = new JTextField();
        outputFile.setBounds(360, 70, 200, 25);
        panel.add(outputFile);

        // create 2 buttons
        JButton btn1 = new JButton("Click to read from file");
        btn1.setBounds(50, 200, 200, 25);
        panel.add(btn1);
        JButton btn2 = new JButton("Click to write to file");
        btn2.setBounds(360, 200, 200, 25);
        panel.add(btn2);

        // create Jlabels 3 and 4
        JLabel label3 = new JLabel("First five lines of file");
        label3.setBounds(80,250,200,25);
        panel.add(label3);
        JLabel label4 = new JLabel("First five lines of new file");
        label4.setBounds(360,250,200,25);
        panel.add(label4);

        // create inputArea and outputArea
        JTextArea inputArea = new JTextArea();
        inputArea.setBounds(50, 300, 200, 100);
        panel.add(inputArea);
        JTextArea outputArea = new JTextArea();
        outputArea.setBounds(360, 300, 200, 100);
        panel.add(outputArea);

        //make the button1 and button2 to read and write files
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputName = inputFile.getText();
                readFile r = new readFile();
                try {
                    data = r.read(inputName);
                    inputArea.setText(data[1]);
                } catch (Exception c) {
                    c.printStackTrace();
                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String outputName = outputFile.getText();
                writeFile w = new writeFile();
                outputArea.setText(data[0]);
                w.write(outputName, data[0]);
            }
        });


    }
}
