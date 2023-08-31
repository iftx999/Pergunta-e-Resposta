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
import javax.swing.Icon;
import javax.swing.JOptionPane;




public class TelaPrincipal extends JFrame {

    //Declarar imagem e botões ;
 
    JLabel fundo = new JLabel(new ImageIcon(getClass().getResource("Sketch001.png")));
    private JButton btnJogar;
    private JButton btnSair;
    private JButton btnAviso;
    private JButton btnCred; 
    Font f = new Font("SansSerif", Font.BOLD, 15);

    //Método para chamar a tela
    public TelaPrincipal() {

        editarjanela();

    }

    public void editarjanela() {
        //Tela principal do jogo 
        setSize(640, 480);
        setLocationRelativeTo(null);
        setLayout(null);
        
         //botão dos créditos 
        
        
          
        //Botão jogar
      
        btnJogar = new JButton("Jogar");
        btnJogar.setFont(new Font("Castellar", 1,18));
        btnJogar.setBounds(150, 400, 100, 50);
        btnJogar.setBackground(new Color(0,0,0,0));
        btnJogar.setForeground(Color.WHITE);
        btnJogar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 10), 2));
        btnJogar.setMargin(new Insets(2, 1000, 2, 14));
        add(btnJogar);
        
        //Ação do botão jogar
        BotaoJogar evento = new BotaoJogar();
        btnJogar.addActionListener(evento);

        //Botão sair
        btnSair = new JButton("Sair");
        btnSair.setFont(new Font("Castellar", 1, 18));
        btnSair.setBounds(270, 400, 100, 50);
        btnSair.setBackground(new Color(0,0,0,0));
        btnSair.setForeground(Color.WHITE);
        btnSair.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 10), 2));
        btnSair.setMargin(new Insets(2, 1000, 2, 14));
        add(btnSair);

        //Ação do botão sair
        BotaoSair evento1 = new BotaoSair();
        btnSair.addActionListener(evento1);

        //Botão aviso
        btnAviso = new JButton("Aviso");
        btnAviso.setFont(new Font("Castellar",1,18));
        btnAviso.setBounds(390, 400, 100, 50);
        btnAviso.setBackground(new Color(0,0,0,0));
        btnAviso.setForeground(Color.WHITE);
        btnAviso.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 10), 2));
        btnAviso.setMargin(new Insets(2, 1000, 2, 14));
        add(btnAviso);

        //Ação do botão aviso
        BotaoAviso evento2 = new BotaoAviso();
        btnAviso.addActionListener(evento2);

        //imagem de fundo
        fundo.setBounds(0, 0, 640, 480);
        add(fundo);

        //Para desabilitar o maximizar da janela 
        setResizable(false);

        //Para desabilitar o X da janela
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
       
    }

    private Icon newJButton(String bt, Icon bt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Adicionar uma ação para os botões
    private class BotaoJogar
            implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //tratamento de erro
            try {
                //Evento para quando clicar no botão a abrir a nova tela
                new Dificuldade();
                setVisible(false);
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "ocorreu um erro :" + erro);
            }
        }
    }

    private class BotaoSair
            implements ActionListener {

        public void actionPerformed(ActionEvent a) {
            //tratamento de erro
            try {
                //Fechar a tela  
                System.exit(0);
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "ocorreu um erro :" + erro);
            }
        }
    }

    private class BotaoAviso
            implements ActionListener {

        public void actionPerformed(ActionEvent b) {
            //tratamento de erro
            try {
                //Avsio para o USUARIO  
                JOptionPane.showMessageDialog(null, "O jogo terá uma pergunta e duas alternativas o sim ou não em cada fase !!   "
                        + "caso qualquer problema entre em contato com nós !!!", "Aviso", 2);
                JOptionPane.showMessageDialog(null, "Desenvolvido por MATHEUS HENRIQUE & JADSON HIAGO", "Desenvolvedores", 0);
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "ocorreu um erro :" + erro);
            }
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


