package Pack;

import javax.swing.*;
import java.awt.*;

public class ImageDisplayApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java ImageDisplayApp <image_path>");
            return;
        }

        String imagePath = args[0];

        // Создаем окно
        JFrame frame = new JFrame("Image Display App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Загружаем изображение
        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel imageLabel = new JLabel(imageIcon);

        // Центрируем изображение в окне
        frame.setLayout(new BorderLayout());
        frame.add(imageLabel, BorderLayout.CENTER);

        // Отображаем окно
        frame.setVisible(true);
    }
}