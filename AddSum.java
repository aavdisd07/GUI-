import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSum extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;
    public AddSum()
    {
        super("AddSum");

        l1=new JLabel("Enter 1st Number");
        l2=new JLabel("Enter 2nd Number");
        l3=new JLabel("Result of the Sum");

        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);

        b1=new JButton("SUM");

        setLayout(new FlowLayout(FlowLayout.LEFT, 80, 15));
        setSize(400,400);
         add(l1);
         add(t1);
         add(l2);
         add(t2);
         add(l3);
         add(t3);


        add(b1);

     b1.addActionListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
   int x=Integer.parseInt(t1.getText());

   int y=Integer.parseInt(t2.getText());
   int sum=x+y;
   t3.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {

       AddSum A = new AddSum();
    }

}




