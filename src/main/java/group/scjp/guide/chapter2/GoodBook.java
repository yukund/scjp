package group.scjp.guide.chapter2;

// force callers to use accessors methods rather than accessing public variables
public class GoodBook {
	//keep instance variable private or protected 
	private int numberOfpages;

	public GoodBook() {
		this.numberOfpages = 100;
	}

	//keep public accessors methods
	//using java bean convention set/get<propertyName>
	public int getNumberOfPages() {
		return this.numberOfpages ;
	}

	public void setNumberOfPages(int numberOfPages) {
		//TODO: add validation logic 
		numberOfpages = numberOfPages;
	}

    public void getFood() {

    }
    public static void main(String... args){
        System.out.print("abc");
    }

}