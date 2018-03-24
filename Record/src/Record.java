

public class Record {
	String title;
	String performer;
	int lenght;
	
	
	public Record(String title, String performer, int lenght) {
		this.lenght=lenght;
		this.performer=performer;
		this.title=title;
	}
	public String toString() {
		return "Performer: " + performer+ " Title: "+ title + " Lenght: "+ lenght;
	}
	
	public int matchingLenght(Record record) {
		if(this.lenght>record.lenght)
			return 1;
		else if(this.lenght==record.lenght)
			return 0;
		else
			return -1;
	}
	
	
	public boolean isPerformerMatching(String otherPerformer) {
		return this.performer.equals(otherPerformer);		
	}
	
	
	public String getTitle() {
		return title;
	}
	public String getPerformer() {
		return performer;
	}
	public int getLenght() {
		return lenght;
	}
}
