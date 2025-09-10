import javax.swing.JOptionPane;

public class PrecoVenda {
    public static void main(String[] args) {
        double precoCusto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de custo:"));
        double percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de acréscimo (%):"));

        double precoVenda = precoCusto + (precoCusto * percentual / 100);

        JOptionPane.showMessageDialog(null, "O preço de venda será: R$ " + precoVenda);
    }
}
