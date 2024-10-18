import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class SimpleInterest extends Frame implements ActionListener
{
    Label l1,l2,l3,l4,l5;
    TextField tf1, tf2, tf3, tf4, tf5;
    Button b1, b2;
    SimpleInterest()
    {
        l1 = new Label("Principle:");
        l2 = new Label("Rate:");
        l3 = new Label("Time:");
        l4 = new Label("Simple Interest:");
        l5 = new Label("Amount:");

        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        tf4 = new TextField();
        tf5 = new TextField();

        b1 = new Button("Clear");
        b2 = new Button("Calculate");

        Font f = new Font("Console",Font.BOLD,15);
        l1.setFont(f);   l2.setFont(f);   l3.setFont(f);   l4.setFont(f);   l5.setFont(f);
        tf1.setFont(f);  tf2.setFont(f);  tf3.setFont(f);  tf4.setFont(f);  tf5.setFont(f);
        b1.setFont(f);   b2.setFont(f);

        l1.setBounds(60,70,70,20);
        l2.setBounds(60,110,70,20);
        l3.setBounds(60,150,70,20);
        l4.setBounds(60,190,120,20);
        l5.setBounds(60,230,70,20);
        tf1.setBounds(180,70,90,20);
        tf2.setBounds(180,110,90,20);
        tf3.setBounds(180,150,90,20);
        tf4.setBounds(180,190,90,20);
        tf5.setBounds(180,230,90,20);
        b1.setBounds(70,280,50,30);
        b2.setBounds(170,280,80,30);

        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);

        tf4.setEditable(false);
        tf5.setEditable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);

        this.add(l1); this.add(l2); this.add(l3); this.add(l4); this.add(l5);
        this.add(tf1); this.add(tf2); this.add(tf3); this.add(tf4); this.add(tf5);
        this.add(b1); this.add(b2);

        this.setBackground(Color.cyan);
        this.setLayout(null);
        this.setSize(340,380);
        this.setVisible(true);
        this.setTitle("Simple interest calculator");
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        Button clickButton = (Button)e.getSource();

        String clickButtonLabel = clickButton.getLabel();

        if(clickButtonLabel.equals("Calculate"))
        {
            float p, si, amount;
            int rate, time;

            p=Float.parseFloat(tf1.getText());
            rate=Integer.parseInt(tf2.getText());
            time=Integer.parseInt(tf3.getText());

            si=(p*rate*time)/100;
            tf4.setText(Float.toString(si));

            amount=p+si;
            tf5.setText(Float.toString(amount));
        }
        else
        {
            tf1.setText(" ");
            tf2.setText(" ");
            tf3.setText(" ");
            tf4.setText(" ");
            tf5.setText(" ");
        }
        System.out.println("action performed");
    }
    public static void main(String args[])
    {
        new SimpleInterest();
    }
}