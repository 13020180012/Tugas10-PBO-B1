import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class pangkat{
    JFrame frame;
    JLabel lbAngka, lbPangkat, lbHasil;
    JTextField txAngka, txPangkat, txHasil;
    JPanel panel1, panel2;
    JButton btHitung, btReset;

    public pangkat(){
        frame = new JFrame();
        frame.setTitle("Pangkat");
        frame.setSize(400,250);
        frame.getContentPane().setLayout(new GridLayout(2,1));

        lbAngka = new JLabel("Masukkan Angka :");
        lbPangkat = new JLabel("Masukkan Pangkat :");
        lbHasil = new JLabel("Hasil :");

        txAngka = new JTextField("");
        txPangkat = new JTextField("");
        txHasil = new JTextField("");

        btHitung = new JButton("Hitung");
        btReset = new JButton("Reset");

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,2));
        panel1.add(lbAngka);
        panel1.add(txAngka);
        panel1.add(lbPangkat);
        panel1.add(txPangkat);
        panel1.add(lbHasil);
        panel1.add(txHasil);

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(btHitung);
        panel2.add(btReset);

        frame.getContentPane().add(panel1);
        frame.getContentPane().add(panel2);

        frame.setVisible(true);
    }

    public static void main (String [] args) {
        pangkat text = new pangkat();
    }
}