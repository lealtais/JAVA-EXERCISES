import javax.swing.JOptionPane;

public class Imc{
    public static void main(String[] args) {
        double imc = Double.parseDouble(JOptionPane.showInputDialog("Digite seu IMC:"));

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Você está abaixo do peso.");
        } else if (imc < 25) {
            JOptionPane.showMessageDialog(null, "Você está com peso normal.");
        } else {
            JOptionPane.showMessageDialog(null, "Você está acima do peso.");
        }
    }
}
