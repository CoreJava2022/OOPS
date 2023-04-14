class Board {	
public void writting(String pen){
	System.out.println("Board writting with :"+pen);
}
}
class Paper extends Board{
	public void writting(String pen){
	System.out.println("Writting paper with :"+pen);
}

public static void main(String args[]){
	Paper paper = new Paper();
	//paper.writting("marker");
	paper.writting("ballPen");
	
	Board board = new Board();
	board.writting("marker");
}
}