import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random random=new Random();
		Scanner scanner=new Scanner(System.in);
		
		Rectangle a= new Rectangle(5,3);
		Rectangle b= new Rectangle(8);
		Rectangle c= a;
		
		System.out.println(a + "\n"+ b + "\n"+ c + "\n");
		
		a.setSides(9,7);
		
		System.out.println(a + "\n"+ b + "\n"+ c + "\n");
		
		a.setBothSides(8);
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a.hasEqualSides(b)+"\n");
		
		
		
		
		
		
		Rectangle[] rectangleArray =new Rectangle [10];
		
		for(int i=0;i<10;i++) {
			rectangleArray[i]=new Rectangle(random.nextInt(10)+1, random.nextInt(10)+1);
			System.out.println(rectangleArray[i].toString());
		}
		
		
		
		
		
		
		
		Rectangle min=rectangleArray[0];
		for(int i=1;i<10;i++) {
			
			if(rectangleArray[i].getArea()<min.getArea())
				min=rectangleArray[i];
		}
		
		System.out.println("Least area rectangle: "+min.toString()+ "\n" );
		
		
		
		
		
		
		
		System.out.println("Give the sides of the new rectangle!");
		
		Rectangle scannedRectangle=new Rectangle(scanner.nextInt(),scanner.nextInt());
		
		System.out.println(scannedRectangle.toString());
		
		int counter=0;
		for(int i=0;i<10;i++) {
			if(rectangleArray[i].getArea()<scannedRectangle.getArea())
				counter++;
		}
		System.out.println("There are "+counter+ " rectangle with smaller area than your rectangle" );
		
		
		
		
		
		
		
		boolean notFind=true;
		int index=0;
		int i=0;
		while(notFind) {
			if(scannedRectangle.hasEqualSides(rectangleArray[i])==true) {
				index=i;
				notFind=false;
			}
			i++;
		}
		if(notFind==false)
			System.out.println(i);
		else
			System.out.println("nincs egyező");
	}
}
