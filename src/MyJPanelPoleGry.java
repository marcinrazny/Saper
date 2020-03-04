import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MyJPanelPoleGry extends JPanel {

    class JakasAkcja implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            JButton button = (JButton) e.getSource();
            button.setVisible(false);

        }
    }

    MyJPanelPoleGry(){


        setLayout(null);
        setPreferredSize(new Dimension(250, 250));
        Border border = LineBorder.createGrayLineBorder();
        ImageIcon Ikona = new ImageIcon(this.getClass().getResource("images/poleObraz8.png"));

        for (int j=0;j<250;j=j+25){

            for (int i=0; i<250;i=i+25) {
                JButton buttonPole = new JButton(Ikona);
                buttonPole.setBounds( i, j, 25, 25);
                buttonPole.addActionListener(new JakasAkcja());
                add(buttonPole);

                JLabel label = new JLabel("X");
                label.setHorizontalAlignment(0);
                label.setBounds(i,j,25,25);
                label.setBorder(border);
                add(label);

            }
       }
    }
}
