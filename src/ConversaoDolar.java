import javax.swing.JOptionPane;

public class ConversaoDolar {
    public static void main(String[] args) {
        double dolares = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dólares:"));
        double cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar hoje:"));

        double reais = dolares * cotacao;

        JOptionPane.showMessageDialog(null, "Você tem R$ " + reais);
    }
}
