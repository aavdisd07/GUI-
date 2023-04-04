
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class  WordsCount extends JFrame implements ActionListener {
    private JLabel p;
    JTextArea a;
    public  WordsCount()
    {   JButton f;
        f= new JButton ("Count");
        a=new JTextArea();
        add(f);
        add(a);
        p=new JLabel("");
        setLayout(null);
        f.setBounds(100,270,120,20);
        a.setBounds(50,50,200,200);
        a.setBackground(Color.BLUE);
        a.setForeground(Color.white);
        a.setLineWrap(true);
        f.setBackground(Color.CYAN);
        f.setForeground(Color.gray);
        p.setBounds(10,300,300,20);
        f.addActionListener(this);
        add(p);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new WordsCount();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg=a.getText();
        String r[]=msg.split("  ");
        p.setText("Total Letters %d Total Words %s".formatted(msg.length(),
                r.length));
    }
}
