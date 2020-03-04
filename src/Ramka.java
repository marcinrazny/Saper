

public class MyJFrame extends JFrame {
    public MyJFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(150,150);
    	setSize(500, 500);
        setTitle("Moja aplikacja");
        add(new MyJPanel());
        pack();
    }
}