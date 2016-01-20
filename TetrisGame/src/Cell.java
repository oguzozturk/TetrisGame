
public class Cell {
	
	int x=0,y=0;
	boolean isFilled=false;
	
	public Cell(int x,int y){
		this.x=x;
		this.y=y;
		isFilled=false;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	

}
