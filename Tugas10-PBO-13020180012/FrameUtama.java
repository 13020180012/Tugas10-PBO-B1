import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
 
public class FrameUtama extends JFrame implements ActionListener{
    
    private JButton tombol;
    private JTextArea myTextArea;
    
    public FrameUtama(){
        
        super("Hello World");
        setLayout(new BorderLayout());//Membuat objek BorderLayout
        
        myTextArea = new JTextArea();//Membuat objek tombol
        tombol = new JButton("Klik Tombol");//Membuat objek tombol
        
        //Meregistrasikan listener pada source event
        tombol.addActionListener(this);
        
        add(myTextArea, BorderLayout.CENTER);//menambahkan text area di bagian tengah
        add(tombol, BorderLayout.SOUTH);//menambahkan tombol di bagian bawah
        
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    //Mengimplentasikan method dari interface ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        myTextArea.append("Tombol ditekan\n");
    }
    
}
import javax.swing.SwingUtilities;
public class MyApp {
public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() { 
@Override
public void run() { 
new FrameUtama();
} 
});
}
}
