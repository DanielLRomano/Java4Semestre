package com.example.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.*;

public class SistemaManutencaoGUI extends JFrame {
    private JTabbedPane tabbedPane;
    private JPanel painelMaquinas;
    private JPanel painelManutencao;
    private JPanel painelFalhas;
    private JPanel painelTecnicos;

    public SistemaManutencaoGUI() {
        // configurações iniciais do frame
        super("Sistema de manutenção");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        // inicialização dos paineis
        painelMaquinas = new MaquinasPanel();
        painelManutencao = new ManutencaoPanel();
        painelFalhas = new FalhasPanel();
        painelTecnicos = new TecnicosPanel();

        // criar meu TabbedPane
        tabbedPane = new JTabbedPane();
        tabbedPane.add("Maquinas", painelMaquinas);
        tabbedPane.add("Manutenções", painelManutencao);
        tabbedPane.add("Falhas", painelFalhas);
        tabbedPane.add("Tecnicos", painelTecnicos);

        this.add(tabbedPane, BorderLayout.CENTER);
    }

}