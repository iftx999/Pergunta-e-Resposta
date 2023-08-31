//ALUNO : Jadson Hiago e Matheus Henrique .
package jogo1;
//importes nescessários
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Dificuldade extends JFrame{
    
    //Declarar imagem e botões ;
    JLabel fundo = new JLabel(new ImageIcon(getClass().getResource("ss2.jpg")));
    private JButton btnFacil;
    private JButton btnMedio;
    private JButton btnDificil;
    private JButton btnVoltar;
    private JButton btnCred;
    Font f = new Font("SansSerif", Font.BOLD, 15);

    //Método para chamar a tela
    public Dificuldade() {

        editarjanela();

    }

    public void editarjanela() {
        //Tela segundaria do jogo 
        setSize(640, 480);
        setLocationRelativeTo(null);
        setLayout(null);

        //Botão facil
        btnFacil = new JButton("Fácil");
        btnFacil.setFont(f);
        btnFacil.setBounds(270, 180, 100, 50);
        btnFacil.setBackground(new Color(0,0,0,0));
        btnFacil.setForeground(Color.WHITE);
        btnFacil.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 10), 2));
        btnFacil.setMargin(new Insets(2, 1000, 2, 14));
        add(btnFacil);
        
        //botão de crédito
        
        btnCred = new JButton("créditos");
        btnCred.setFont(new Font("Ravie", 1,18));
        btnCred.setBounds(150, 0, 100, 50);
        btnCred.setBackground(new Color(0,0,0,0));
        btnCred.setForeground(Color.WHITE);
        btnCred.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 10), 2));
        btnCred.setMargin(new Insets(2, 1000, 2, 14));
        add(btnCred);
        BotaoCred evento4 = new BotaoCred();
        btnCred.addActionListener(evento4);
        
        //Ação do botão facil
        Dificuldade.BotaoFacil evento = new Dificuldade.BotaoFacil();
        btnFacil.addActionListener(evento);

        //Botão medio
        btnMedio = new JButton("Médio");
        btnMedio.setFont(f);
        btnMedio.setBounds(270, 250, 100, 50);
        btnMedio.setBackground(new Color(0,0,0,0));
        btnMedio.setForeground(Color.WHITE);
        btnMedio.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 10), 2));
        btnMedio.setMargin(new Insets(2, 1000, 2, 14));
        add(btnMedio);

        //Ação do botão medio
        Dificuldade.BotaoMedio evento1 = new Dificuldade.BotaoMedio();
        btnMedio.addActionListener(evento1);

        //Botão dificil
        btnDificil = new JButton("Difícil");
        btnDificil.setFont(f);
        btnDificil.setBounds(270, 320, 100, 50);
        btnDificil.setBackground(new Color(0,0,0,0));
        btnDificil.setForeground(Color.WHITE);
        btnDificil.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 10), 2));
        btnDificil.setMargin(new Insets(2, 1000, 2, 14));
        add(btnDificil);

        //Ação do botão dificil
        Dificuldade.BotaoDificil evento2 = new Dificuldade.BotaoDificil();
        btnDificil.addActionListener(evento2);
        
        //Botão voltar
        btnVoltar = new JButton("Voltar");
        btnVoltar.setFont(f);
        btnVoltar.setBounds(100,400, 100, 50);
        btnVoltar.setBackground(new Color(0,0,0,0));
        btnVoltar.setForeground(Color.WHITE);
        btnVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 10), 2));
        btnVoltar.setMargin(new Insets(2, 1000, 2, 14));
        add(btnVoltar);
        
        //Ação do botão voltar
        Dificuldade.BotaoVoltar evento3 = new Dificuldade.BotaoVoltar();
        btnVoltar.addActionListener(evento3);


        //imagem de fundo
        fundo.setBounds(0, 0, 640, 480);
        add(fundo);

        //Para desabilitar o maximizar da janela 
        setResizable(false);

        //Para desabilitar o X da janela
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }

    private static class TelaPergunta {

        public TelaPergunta() {
        }
    }
    //Adicionar uma ação para os botões
    private class BotaoFacil
            implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //tratamento de erro
            try {
                //Evento para quando clicar no botão a abrir a nova tela
                TelaPergunta tp = new TelaPergunta();
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "ocorreu um erro :" + erro);
            }
        }
    }

    private class BotaoMedio
            implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            //tratamento de erro
            try {
                //Evento para quando clicar no botão a abrir a nova tela
                new Pergunta3();
                setVisible(false);
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "ocorreu um erro :" + erro);
            }
        }
    }

    private class BotaoDificil
            implements ActionListener {

        public void actionPerformed(ActionEvent b) {
            //tratamento de erro
            try {
                //Evento para quando clicar no botão a abrir a nova tela
                new Pergunta5();
                setVisible(false);
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "ocorreu um erro :" + erro);
            }
        }
    }
    
    private class BotaoVoltar
            implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            //tratamento de erro
            try {
               new TelaPrincipal();
               setVisible(false);
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "ocorreu um erro :" + erro);
            }
        }
          private class BotaoCred
    implements ActionListener{
        
        public void actionPerformed(ActionEvent d){
             try{
                 JOptionPane.showMessageDialog(null,"aqui tera os créditos "+ "as imagens deste jogo foi retirado deste site https://br.pinterest.com/");
             }catch (Exception erro){
                 JOptionPane.showMessageDialog(null, "ocorreu um erro :" + erro);
                 
                

        }
        
        }
    }
}
