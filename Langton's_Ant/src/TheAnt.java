
public class TheAnt {
	//position i is height, position j is width
	private int position_i;
	private int position_j;
	
	//Enumerated type for UP LEFT RIGHT DOWN
	private Direction direction;
	
	//constructor takes a grid coordinate and a starting direction
	public TheAnt(int pos_i, int pos_j, Direction dir){
		position_i = pos_i;
		position_j = pos_j;
		direction = dir;
	}
	
	//returns the vertical position of the ant
	public int get_height_pos(){
		return position_i;
	}
	
	//returns the horizontal position of the ant
	public int get_width_pos(){
		return position_j;
	}
	
	//Returns the direction the ant is pointing
	public Direction get_direction(){
		return direction;
	}
	
	//changes the direction the ant is facing to its right
	public void turnRight(Direction direction){
		switch(direction){
			case UP:
				this.direction = Direction.RIGHT;
				break;
			case RIGHT:
				this.direction = Direction.DOWN;
				break;
			case DOWN:
				this.direction = Direction.LEFT;
				break;
			case LEFT:
				this.direction = Direction.UP;
		}
	}
	
	//changes the direction the ant is facing to its left
	public void turnLeft(Direction direction){
		switch(direction){
			case UP:
				this.direction = Direction.LEFT;
				break;
			case RIGHT:
				this.direction = Direction.UP;
				break;
			case DOWN:
				this.direction = Direction.RIGHT;
				break;
			case LEFT:
				this.direction = Direction.DOWN;
		}
	}
	
	//Change the boolean value of the grid at the same location as the ant
	//and move ant forward by updating its coordinates
	public void moveForward(Direction direction, Grid grid){
		grid.changeColor(position_i, position_j);
		switch(direction){
			case UP:
				position_i--;
				break;
			case RIGHT:
				position_j++;
				break;
			case DOWN:
				position_i++;
				break;
			case LEFT:
				position_j--;
		}
	}
}

