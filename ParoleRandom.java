import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ParoleRandom extends JFrame implements ActionListener {
    
    private String[] parole = {"bonamo", "caciocavallo", "fuogo", "compilatore", "achillo GAMING"};
    private JButton bottone = new JButton("Estrai Parola");
    private JLabel parolaLabel = new JLabel("");
    
    public ParoleRandom() {
        super("Parole Random");
        
        
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(bottone, BorderLayout.NORTH);
        add(parolaLabel, BorderLayout.CENTER);
        bottone.addActionListener(this);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
    	int indiceRandom = (int) (Math.random() * parole.length);
        String parolaRandom = parole[indiceRandom];
        parolaLabel.setText(parolaRandom);
    }
    
    public static void main(String[] args) {
        new ParoleRandom();
    }
}