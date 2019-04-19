package musiclibrary;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;

	private DefaultTableModel tblAlbumsMdl = new DefaultTableModel(new String[] {"Album Artist", "Album Name",
			"Year", "Track Number", "Song Title", "Song Artist", "Genre"}, 0);

	private AlbumArtist albumArtists[];

	// Stores all possible genres.
	private Set<String> genres = new HashSet<>();

	private JTable tblAlbums = new JTable(tblAlbumsMdl);

	public GUI(String title) {
		super(title);

		initGUIComponents();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
	}

	private void initGUIComponents() {
	}
		
