import javax.swing.*;
import java.awt.Font.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class marksheet  extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5,t6;
    marksheet()
    {
        super.setTitle("Student");
        super.setSize(600, 600);
       setLayout(null);

        JLabel heading,studentName,phy,chem,math,total,Status;

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        t6=new JTextField();

   setResizable(false);

        heading=new JLabel("Student Marks Calculation");
        studentName=new JLabel(" Enter Student Name :");
        phy=new JLabel(" Physics                       :");
        chem=new JLabel(" Chemistry                   :");
        math=new JLabel(" Math                            :");
        total=new JLabel(" Total Marks                :");
        Status=new JLabel("Status                           :");

        JButton b1=new JButton("Calculate");
       

        Font Font=new Font("Sarif", java.awt.Font.BOLD,15);
        heading.setFont(Font);
        add(heading);
        add(studentName);
        add(t1);
        add(phy);
        add(t2);
        add(chem);
        add(t3);
        add(math);
        add(t4);
        add(total);
        add(t5);
        add(Status);
        add(t6);
        add(b1);


        b1.addActionListener(this);


        heading.setBounds(120,10,220,15);
        heading.setForeground(Color.red);
        studentName.setBounds(10, 40, 150, 30);
        t1.setBounds(150, 42, 150, 25);

        t1.setFont(new Font("", java.awt.Font.BOLD,12));
        t2.setFont(new Font("", java.awt.Font.BOLD,12));
        t3.setFont(new Font("", java.awt.Font.BOLD,12));
        t4.setFont(new Font("", java.awt.Font.BOLD,12));
        chem.setBounds(10, 70, 150, 30);
        t2.setBounds(150, 72, 150, 25);
        phy.setBounds(10, 100, 150, 30);
        t3.setBounds(150, 102, 150, 25);
        math.setBounds(10, 130, 150, 30);
        t4.setBounds(150, 132, 150, 25);
        total.setBounds(10, 160, 150,30 );
        t5.setBounds(150, 162, 150, 25);
        t5.setFont(new Font("", java.awt.Font.BOLD,12));
        Status.setBounds(10, 190, 150, 30);
        t6.setFont(new Font("", java.awt.Font.BOLD,12));
        t6.setBounds(150, 192, 150, 25);
      b1.setBounds(80, 240, 90, 30);
      b1.setBackground(Color.yellow);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {
       new marksheet  ();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int a=Integer.parseInt(t2.getText());
        int b=Integer.parseInt(t3.getText());
        int c=Integer.parseInt(t4.getText());
        int sum=a+b+c;
        t5.setText(String.valueOf(sum));
        if(sum>=50) {
            t6.setText("Pass");
        }
        if(sum<50)
        {
            t6.setText("Fail");
        }

    }
}





























