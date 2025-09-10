import javax.swing.JOptionPane;

public class Triangulos {
    public static void main(String[] args) {
        int PL, SL, TL;
        boolean EQ, ES, TR, IS;


        String entrada = JOptionPane.showInputDialog("Digite os lados do seu triangulo:");
        PL = Integer.parseInt(entrada);

        String entradaDois = JOptionPane.showInputDialog("Digite os lados do seu triangulo:");
        SL = Integer.parseInt(entradaDois);

        String entradaTres = JOptionPane.showInputDialog("Digite os lados do seu triangulo:");
        TL = Integer.parseInt(entradaTres);



        TR = (PL < SL + TL) && (SL < PL + TL) && (TL < PL + SL);

        if (TR) {
            EQ = (PL == SL) && (SL == TL);
            ES = (PL != SL) && (SL != TL) && (PL != TL);
            IS = (PL == SL) || (SL == TL) || (PL == TL);


            if (ES) {
                JOptionPane.showMessageDialog(null, "é escaleno!");
            } else if (EQ) {
                JOptionPane.showMessageDialog(null, "É equilatero ");
            } else if (IS) {
                JOptionPane.showMessageDialog(null, "É ISOCELES");
            }
            }
            else {
                    JOptionPane.showMessageDialog(null, "Não é um triangulo");

            }

    }
}