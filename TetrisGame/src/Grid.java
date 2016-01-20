
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class Grid {
	
	static Timer t=new Timer();
	int cellswidth=15,cellsheight=20;
	ArrayList<Cell> cells=new ArrayList<Cell>();
	char[][] grid = new char[cellsheight][cellswidth];
	Cell[][] cells2 = new Cell[cellsheight][cellswidth];
	Piece p=null;

	public Grid(){
		
		//Create grid
		for(int i=0;i<cellsheight;i++){
			for(int j=0;j<cellswidth;j++){
				cells2[i][j]=new Cell(i,j);
				grid[i][j]='.';
			}
		}

		//Create pieces
		for(Cell c:cells){
			if(c.isFilled){
				grid[c.getX()][c.getY()]='X';
			}
		}
		
		
		//Move grid 
		t.schedule(new TimerTask() {
			public void run() {
				if(p==null || p.moveStopped)
					p = new Piece(cells2);
				
				else p.move(); 				
				print();			
				
			}
		}, 100,100);
		
		

	}

	//Print grid and cell
	public void print(){
		
		//Control game over
		for(int j=0;j<cellswidth;j++){
			if(cells2[0][j].isFilled && grid[cells2[0][j].getX()][cells2[0][j].getY()]=='X' && p.moveStopped){
				t.cancel();
				System.out.print("GAME OVER!\n___________________________________________________\n");
				break;
			}
		}	
		
		for(int i=0;i<cellsheight;i++){
			for(int j=0;j<cellswidth;j++){
				if(cells2[i][j].isFilled){
					grid[cells2[i][j].getX()][cells2[i][j].getY()]='X';
				}else grid[i][j]='.';
			}
		}	
		
		for(int i=0;i<cellsheight;i++){
			for(int j=0;j<cellswidth;j++){
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}

		System.out.println("___________________________________________________");
		
	}
	
	
	
	
}
