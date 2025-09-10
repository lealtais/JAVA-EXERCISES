import javax.swing.JOptionPane;

public class Impostos {
    public static void main(String[] args) {
        double salario, imposto = 0, salarioLiquido;


        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário:"));


        if (salario < 1000) {
            imposto = 0;
        } else if (salario <= 2200) {
            imposto = salario * 0.13;
        } else {
            imposto = salario * 0.22;
        }

        salarioLiquido = salario - imposto;


        JOptionPane.showMessageDialog(null,
                "Salário bruto: R$ " + salario +
                        "\nImposto: R$ " + imposto +
                        "\nSalário líquido: R$ " + salarioLiquido);
    }
}
