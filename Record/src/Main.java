
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		
		System.out.println("Please give the number of the records!");
		int n=scanner.nextInt();
		Record [] records= new Record[n];
		
		for (int i=0;i<n;i++) {
			System.out.println("Please give the details of the #"+(i+1)+ " record this order: title, performer, lenght");
			scanner.nextLine();
			String title=scanner.nextLine();
			String performer=scanner.nextLine();
			int lenght= scanner.nextInt();
			records[i]=new Record(title,performer,lenght);
		}
		
		Record longest=records[0];
		
		for(int i=1;i<n;i++) {
			if(longest.matchingLenght(records[i])==-1)
				longest=records[i];
		}
		System.out.println(longest.toString());
		System.out.println("Give the performer that you want to search in the database!");
		scanner.nextLine();
		String searchedPerformer=scanner.nextLine();
		
		for(int i=0;i<n;i++) {
			if(records[i].isPerformerMatching(searchedPerformer))
				System.out.println(records[i].toString());
		}

	}

}
