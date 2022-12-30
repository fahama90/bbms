import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static java.nio.channels.AsynchronousFileChannel.open;
public class mainpage extends JFrame implements ActionListener {
    
    JButton open,not_open;
    
    mainpage(){
        getContentPane().setBackground(Color.yellow);
        setLayout(null);
        
        JLabel heading = new JLabel("Are you ready");
        heading.setBounds(750, 130, 330, 55);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        open = new JButton("OPEN");
        open.setBounds(735, 230, 120, 25);
        open.setBackground(Color.BLACK);
        open.setForeground(Color.WHITE);
        open.addActionListener(this);
        add(open);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
if(ae.getSource()== open){
    setVisible(false);
    loginpage loginpage = new loginpage();
}
    }
    public static void main(String[] args){
        new open();
    }

    private static class open {

        public open() {
        }
    }
}
    
        
        
        
    

    

   
