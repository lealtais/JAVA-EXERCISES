import javax.swing.JOptionPane;

public class Abastecimento {
    public static void main(String[] args) {
        double capacidade = Double.parseDouble(JOptionPane.showInputDialog("Qual a capacidade do tanque (em litros)?"));
        String combustivel = JOptionPane.showInputDialog("Deseja abastecer com Gasolina ou Álcool?").toLowerCase();

        double preco;
        if (combustivel.equals("gasolina")) {
            preco = 6.60;
        } else {
            preco = 5.00;
        }

        double total = capacidade * preco;

        JOptionPane.showMessageDialog(null, "O valor para completar o tanque será: R$ " + total);
    }
}
