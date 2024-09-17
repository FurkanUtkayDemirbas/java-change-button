package Odev4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Odev4  extends JFrame{


    private JLabel label1;
    private JPanel panel;
    private JLabel label2;

    static  boolean durum;
    Odev4()
    {
        add(panel);
        setSize(500,500);
        setTitle("Odev4");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Image icon1 = new ImageIcon(this.getClass().getResource("/png/Kafasikarisikadam.png")).getImage();
        Image icon3 = new ImageIcon(this.getClass().getResource("/png/Calisanadam.png")).getImage();
        label1.setIcon(new ImageIcon(icon1));
        durum=true;


        label1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if(durum)
                {
                    label1.setIcon(new ImageIcon(icon1));
                    label2.setText("Çalışan Bir adam görmek istiyorsan");

                    durum=false;

                }
                else
                {
                    label1.setIcon(new ImageIcon(icon3));
                    label2.setText("İşsiz Bir adam görmek istiyorsan");
                    durum=true;

                }
                super.mouseClicked(e);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Odev4 odev4 = new Odev4();
                odev4.setVisible(true);
            }
        });
    }
}
