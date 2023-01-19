package lesson56;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class sliderDemo implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    sliderDemo() {
        frame = new JFrame("Slider demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        label.setFont(new Font("MV Boli", Font.PLAIN, 30));

        slider.setOrientation(SwingConstants.VERTICAL); // chiều dọc
        // slider.setOrientation(SwingConstants.HORIZONTAL); // chiều ngang cũng là
        // fefault

        label.setText("°C = " + slider.getValue());

        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {

        label.setText("°C = " + slider.getValue());

    }

}
