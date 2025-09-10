import javax.swing.JOptionPane;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double imposto;
        double salario;


        String entrada = JOptionPane.showInputDialog("Digite seu salário:");
        salario = Integer.parseInt(entrada);

        if (salario < 1000) {
            JOptionPane.showMessageDialog(null, "Seu salário é: " + salario);
        } if (salario >= 1000 && salario <= 2200) {
            imposto = salario * 0.13;
            JOptionPane.showMessageDialog(null, "O total recebido é de: " + (salario - imposto));
        }  if (salario > 2200) {
            imposto = salario * 0.22;
            JOptionPane.showMessageDialog(null, "O total recebido é de: " + (salario - imposto));
        }

        }
    }


