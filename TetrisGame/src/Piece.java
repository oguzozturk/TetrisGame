
public class Piece {
	
	Square[] shape = new Square[4];
	//ArrayList<Cell> myGrid = null;
	Cell[][] myGrid=null;
	int px=0,py=0;
	boolean moveStopped=false;
	int createPiece;
	
	public Piece(Cell[][] cells2){
		myGrid=cells2;
		px=(int) (Math.random()*10+2);
		
		createPiece = (int)(Math.random()*7+1);
		if(createPiece==1){
			createLineShape();
		}
		if(createPiece==2){
			createJShape();
		}
		if(createPiece==3){
			createLShape();
		}
		if(createPiece==4){
			createSquareShape();
		}
		if(createPiece==5){
			createSShape();
		}
		if(createPiece==6){
			createTShape();
		}
		if(createPiece==7){
			createZShape();
		}

	}

	void move(){
		
		if(!canmove()){
			moveStopped = true;			
		}		
		if(!moveStopped){
			int dxx=(int)(Math.random()*4-2);
			int dyy=1;
			px+=0;
			for(int i=0;i<4;i++){
				moveSquare(shape[i],dxx,dyy);
			}
			py+=dyy;
		}
		
	}
	
	void moveSquare(Square s,int dx,int dy){
		//s.setX(px+s.getX()+dx);
		if((py+s.getY())<20 || !(myGrid[py+s.getY()+1][px+s.getX()].isFilled())){
			//s.setY(py+s.getY()+dy);
			boolean a=false;
			for(int i=0;i<4;i++){
				if(!a && s.getX()==shape[i].getX() && s.getY()-1==shape[i].getY()){
					a=true;
				}
			}
			if(!a){
				myGrid[py+s.getY()][px+s.getX()].setFilled(false);
			}
			myGrid[py+s.getY()+dy][px+s.getX()].setFilled(true);
			
		}
		//if(s.getX()<0) s.setX(0);
		//if(s.getX()>15) s.setX(15);
		//if(s.getY()<0) s.setY(0);
	}
	
	private boolean canmove() {

		for(int i=0;i<4;i++){
			if((py+shape[i].getY()+1)==20){
				return false;
			}else if(myGrid[py+shape[i].getY()+1][px+shape[i].getX()].isFilled){
				boolean a=false;
				for(int j=0;j<4;j++){
					if(!a && shape[i].getX()==shape[j].getX() && shape[i].getY()+1==shape[j].getY()){
						a=true;
					}
				}
				if(!a) return false;
			}
			
			/*else{
				for(int j=0;j<4;j++){
					if(shape[i].getY()>shape[j].getY()&& shape[i].getY()+1!=shape[j].getY() && myGrid[py+shape[i].getY()+1][px+shape[i].getX()].isFilled){
						System.out.println(i+""+j);
						return false;
					}
				}
			}*/
		}
		return true;
	}
	

	public void createLineShape(){
		
		Square s = shape[0]=new Square(0,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[1]=new Square(1,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[2]=new Square(2,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[3]=new Square(3,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		
	}

	public void createJShape(){
		
		Square s = shape[0]=new Square(0,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[1]=new Square(1,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[2]=new Square(2,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[3]=new Square(2,1);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		
	}
	
	public void createLShape(){
		
		Square s = shape[0]=new Square(0,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[1]=new Square(1,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[2]=new Square(2,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[3]=new Square(0,1);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		
	}
	
	public void createSquareShape(){
		
		Square s = shape[0]=new Square(0,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[1]=new Square(1,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[2]=new Square(0,1);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[3]=new Square(1,1);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		
	}
	
	public void createSShape(){
		
		Square s = shape[0]=new Square(1,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[1]=new Square(1,1);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[2]=new Square(0,1);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[3]=new Square(0,2);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		
	}
	
	public void createTShape(){
		
		Square s = shape[0]=new Square(0,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[1]=new Square(1,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[2]=new Square(2,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[3]=new Square(1,1);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		
	}
	
	public void createZShape(){
		
		Square s = shape[0]=new Square(0,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[1]=new Square(1,0);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[2]=new Square(1,1);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		s = shape[3]=new Square(2,1);
		myGrid[py+s.getY()][px+s.getX()].setFilled(true);
		
	}
	
	
}
