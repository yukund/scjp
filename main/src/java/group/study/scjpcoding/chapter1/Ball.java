package group.study.scjpcoding.chapter1;
class Ball implements Bounceable {

	//Variable Decorations Page49 
	//8 Types of Primitive types
	short a;int b;long c;double d;float e;char f;boolean g;byte h;

	//Can be defined // stopped coding there 16APR
	//Instance variables
	private String name;
	private Tyre myTyre;
	Object obj;
	int[] key;
	String owners [];
	
	enum BallSize {SAMLL(10), BIG(20){//can override a method here
		public String getSth(){return "B";}
	};
		BallSize(int kg) {};
		public String getSth(){return "A";}
	}//;


	//Class variable
	static long BALL_SIZE = 10;
	
	/**
	* Constructor Page 467
	* If you do not declare one, the complier will build one for you 
	* Looks like a method , but cannot ever have a return type 
	* Construct name must be the same as the declared Class name
	* Cannot be marked as static, final and abstract
	*/
	public Ball(){}
	
	public Ball(final String name) {
		String localVar = "I am a local variable";
		this.name = name + localVar;
	}

	@Override
	public void bounce() {
		System.out.println("bounce !! bounce !!" + Ball.BALL_SIZE);
	}

	@Override
	public void setBounceFactor(final int ab) { new Ball();}

	/**
 	* for reference, look here: <a href="http://www.google.com">Google</a>
 	*/
	//native is only for method, not class/var page 48
	native void doNotCallMe(char... myChar);


    //Page 48 
	//force floating potints to adhere to the IEEE 754 standard
	//strictfp can be declared for a class and method , NOT a variable 
	strictfp float getNumber() {
		return 2;
	}

	//print an array
	void printArray() {
		String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
		key[0] = 100;
		String[] titles = {"Mr. ", "Mrs. ", "Ms. "};
     
		System.out.println(key[0]); 
	}

}