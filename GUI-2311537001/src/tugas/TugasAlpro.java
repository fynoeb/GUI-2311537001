package tugas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TugasAlpro extends JFrame {
    private JTextField textFieldNama, textFieldNIM;
    private JComboBox<String> comboBoxJurusan;

    public TugasAlpro() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Input Data Mahasiswa");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBackground(new Color(255, 229, 253));

        panel.add(new JLabel("Nama:"));
        textFieldNama = new JTextField();
        panel.add(textFieldNama);

        panel.add(new JLabel("NIM:"));
        textFieldNIM = new JTextField();
        panel.add(textFieldNIM);
        String[] jurusanOptions = {"Teknik Informatika", "Sistem Informasi", "Teknik Elektro"};
        
                JLabel label = new JLabel("Jurusan:");
                panel.add(label);
        comboBoxJurusan = new JComboBox<>(jurusanOptions);
        comboBoxJurusan.setModel(new DefaultComboBoxModel(new String[] {"Informatika", "Sistem Informasi", "Teknik Komputer"}));
        panel.add(comboBoxJurusan);

        JButton buttonSimpan = new JButton("Simpan");
        buttonSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simpanDataMahasiswa();
            }
        });
        panel.add(buttonSimpan);

        JButton buttonReset = new JButton("Reset");
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetInput();
            }
        });
        panel.add(buttonReset);

        getContentPane().add(panel);

        setVisible(true);
    }

    private void simpanDataMahasiswa() {
        String nama = textFieldNama.getText();
        String nim = textFieldNIM.getText();
        String jurusan = (String) comboBoxJurusan.getSelectedItem();

        // Lakukan penyimpanan data sesuai kebutuhan (misalnya, ke database atau file)
        // Di sini, kita hanya mencetak data sebagai contoh
        System.out.println("Data Mahasiswa Disimpan:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    private void resetInput() {
        textFieldNama.setText("");
        textFieldNIM.setText("");
        comboBoxJurusan.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TugasAlpro();
            }
        });
    }
}
