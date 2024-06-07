import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        String nome = JOptionPane.showInputDialog(null, 
                                                  "Coloque seu nome?",  
                                                  "Pergunta 1",
                                                  3); //digite seu nome, pergunta 1
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                  "Coloque um número?",  
                                                  "Pergunta 2",
                                                  3)); // digite um número inteiro, pergunta 2
        
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                  "Coloque outro número?",  
                                                  "Pergunta 3",
                                                  3)); //digite outro número inteiro pergunta 3
        
        double num3 = Double.parseDouble(JOptionPane.showInputDialog(null, 
                                                  "Coloque um número decimal?",  
                                                  "Pergunta 4",
                                                  3)); //digite um número double, pergunta 4
        String jogo = JOptionPane.showInputDialog(null, 
                                                  "Coloque seu jogo favorito?",  
                                                  "Pergunta 5",
                                                  3); //digite seu jogo favorito, pergunta 5
        
        int vezes = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                  "Coloque quantas vezes você jogou?",  
                                                  "Pergunta 6",
                                                  3)); // digite quantas vezes você jogou, pergunta 6
        
        String personagem = JOptionPane.showInputDialog(null, 
                                                  "Coloque seu personagem favorito?",  
                                                  "Pergunta 7",
                                                  3); //digite seu personagem favorito, pergunta 7
        
        String cenario = JOptionPane.showInputDialog(null, 
                                                  "Coloque seu cenário favorito?",  
                                                  "Pergunta 8",
                                                  3); //digite seu cenário favorito, pergunta 8
        
        String inimigo = JOptionPane.showInputDialog(null, 
                                                  "Coloque seu inimigo favorito?",  
                                                  "Pergunta 9",
                                                  3); //digite seu inimigo favorito, pergunta 9
        
        String[] acceptableValues = {"Fácil", "Médio", "Difícil"};
        String dificuldade = (String)JOptionPane.showInputDialog(null,
                "Quão difícil é o jogo",
                "Pergunta 10",
                3,
                null,
                acceptableValues,
                acceptableValues[0]); // nível de dificuldade, pergunta 10
       
        double tempo = num1 + num3 * num2;
        
        JOptionPane.showMessageDialog(null,
                "O usuário: " 
                + nome + ", "
                + "gosta muito de: " 
                + jogo + ", "
                + "\n e jogou ele " 
                + vezes
                + " vezes, seu personagem favorito é: "
                + personagem
                + " \n e seu inimigo favorito é: "
                + inimigo + ", " 
                + "\n jogou por: "
                + tempo  + " horas, "
                + "cenário favorito: "
                + cenario
                + ", \n estando na dificuldade: "
                + dificuldade,
                "Resultado da pesquisa",
                1);
        //resultado da pesquisa
     
    }   
}