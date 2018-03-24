
public class Rectangle {

	int aSide;
	int bSide;
	
	public Rectangle (int aSide, int bSide){
		this.aSide=aSide;
		this.bSide=bSide;
	}
	
	public Rectangle (int sides) {
		this.aSide=sides;
		this.bSide=sides;
	}
	
	public int getArea() {
		return aSide*bSide;
	}
	
	
	
	public String toString() {
		return "A side: "+aSide+" B side: "+bSide+" : "+ getArea();
	}
	
	
	
	
	public void setSides(int aSide,  int bSide) {
		this.aSide=aSide;
		this.bSide=bSide;
	}
	public void setBothSides(int sides) {
		this.aSide=sides;
		this.bSide=sides;
	}
	
	
	
	
	
	
	public boolean biggerArea(Rectangle otherRectangle) {
		if (this.getArea()>otherRectangle.getArea())
			return true;
		else
			return false;
	}
	
	public boolean hasEqualSides(Rectangle otherRectangle) {
		if(this.aSide==otherRectangle.aSide && this.bSide==otherRectangle.bSide)
			return true;
		else
			return false;
	}
	
}
