package calculadorajava.view;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;

public class RightAlignedListCellRenderer extends DefaultListCellRenderer{
	public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        label.setHorizontalAlignment(SwingConstants.RIGHT); // Alinha o texto à direita
        return label;
	}
}
