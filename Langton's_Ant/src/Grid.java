
public class Grid {
	//boolean array where true=white and false=black
	private boolean[][] map = new boolean[100][100];
	
	//fill the map with true values
	public void setMap(){
		for(int x = 0;x < map.length;x++){
			for(int y = 0;y < map.length;y++){
				map[x][y] = true;
			}
		}
	}
	
	//constructor call the function that will fill the map with true values
	public Grid(){
		setMap();
	}
	
	//Returns the boolean value of the square at requested coordinate
	public boolean getColor(int position_i, int position_j) {
		return map[position_i][position_j];
	}

	//Flips the value at the desired coordinate.
	public void changeColor(int pos_i, int pos_j) {
		map[pos_i][pos_j] = !map[pos_i][pos_j];
	}
	
	//returns the width of the grid
	public int getWidth(){
		return map[0].length;
	}
	
	//returns the height of the grid
	public int getHeight(){
		return map.length;
	}
}
