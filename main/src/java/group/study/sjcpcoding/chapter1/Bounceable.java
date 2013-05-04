package group.study.sjcpcoding.chapter1;

//can extends other interfaces
//can not extend 
interface Bounceable {
	//only public and abstract methods
	//must not be: static, strictfp or native
	//no modifier required for 
	public abstract void bounce();
	void setBounceFactor(int ab);
	//only constants public/static/final
	static final boolean ONLYCONSTANTS = true;
	
}