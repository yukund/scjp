package group.scjp.guide.chapter1;

class Tyre extends Ball{

	public void doSth() {
		bounce();
		this.bounce();
		super.bounce();
	}

	public static void main (String[] args) {
		
	}
}