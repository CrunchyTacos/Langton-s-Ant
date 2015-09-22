
public class RunTheAnt {

	
	public static void main(String[] args) {
		//Make a grid an ant an something to show them.
		Grid grid = new Grid();
		TheAnt ant = new TheAnt(50,50, Direction.LEFT);
		AntAnimator show = new AntAnimator(grid);
		
		//use these to reduce calls to ant height/width getters
		int ant_h, ant_w;
		
		//build the grid and color the ant tile
		show.buildMap();
		show.showAnt(ant.get_height_pos(), ant.get_width_pos());
		
		for(int b = 0; b < 11000; b++){
			//Keep track of how many iterations the loop has done
			System.out.println(b);
			
			//Make sure we can see most of the movements.
			//Is there a better way to do this??
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			ant_h = ant.get_height_pos();
			ant_w = ant.get_width_pos();
			
			//true=white, false=black
			if(grid.getColor(ant_h, ant_w) == true){
				ant.turnRight(ant.get_direction());
			}
			else{
				ant.turnLeft(ant.get_direction());
			}
			
			//Flip the color of the square the ant is on
			show.changeGridColor(ant_h, ant_w, grid.getColor(ant_h, ant_w));
			
			//Move the ant forward(changes the value of the grid boolean as well)
			ant.moveForward(ant.get_direction(), grid);
			
			//Show the new position of the ant
			show.showAnt(ant.get_height_pos(), ant.get_width_pos());
		}
	}
}

