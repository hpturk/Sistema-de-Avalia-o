import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {

    public static void main(String[] args) {
      
        String prova1Str = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
        double prova1 = Double.parseDouble(prova1Str);

        String prova2Str = JOptionPane.showInputDialog("Digite a nota da segunda prova:");
        double prova2 = Double.parseDouble(prova2Str);

        String trabalhoStr = JOptionPane.showInputDialog("Digite a nota do trabalho:");
        double trabalho = Double.parseDouble(trabalhoStr);

        double media = (prova1 + prova2 + trabalho) / 3.0;

        String mensagem;
        if (media >= 6.0) {
            mensagem = String.format("Média: %.2f. Aluno APROVADO!", media);
        } else {
            mensagem = String.format("Média: %.2f. Aluno REPROVADO!", media);
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}