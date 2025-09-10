import javax.swing.JOptionPane;

public class Votacao {
    public static void main(String[] args) {
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento:"));
        int anoAtual = 2025;

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            JOptionPane.showMessageDialog(null, "Você pode votar este ano!");
        } else {
            JOptionPane.showMessageDialog(null, "Você NÃO pode votar este ano.");
        }
    }
}
