import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AntAnimator {
	JFrame frame = new JFrame("Langton's Ant");
	
	//coordinates and array reresentation
	int width, height;
	JPanel[][] gridsquares;
	
	//constructor gets size of map from an instantiated Grid object
	public AntAnimator(Grid grid2) {
		width = grid2.getWidth();
		height = grid2.getHeight();
	}
	
	//make the gridmap using JPanels
	public void buildMap(){
		frame.setSize(800, 800);
		frame.setLayout(new GridLayout(width,height,1,1));
		gridsquares = new JPanel[height][width];
		
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				gridsquares[i][j] = new JPanel();
				gridsquares[i][j].setBackground(Color.WHITE);
				frame.add(gridsquares[i][j]);
			}
		}
		
		frame.setVisible(true);	
	}
	
	//change the color where the ant is to red
	public void showAnt(int ant_y, int ant_z){
		gridsquares[ant_y][ant_z].setBackground(Color.RED);
	}
		
	//flip the panel where the ant is standing to white if black
	//and black if white
	public void changeGridColor(int ant_y, int ant_z, boolean bool){
		if(bool == true){
			gridsquares[ant_y][ant_z].setBackground(Color.BLACK);
		}
		else{
			gridsquares[ant_y][ant_z].setBackground(Color.WHITE);
		}
	}
}


