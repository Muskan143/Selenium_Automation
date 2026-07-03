package Takescreenshot;

 

interface Parent {
	void add();
}

interface AnotherParent {
	void sub();
}

interface Child extends Parent {
	void div();
}

class RemoteChild implements Child, AnotherParent {

	@Override
	public void div() {
		System.out.println("div");
	}

	@Override
	public void add() {
		System.out.println("add");
	}

	@Override
	public void sub() {
		System.out.println("sub");
	}

}

public class MainClass {
	public static void main(String[] args) {
		Child c = new RemoteChild();
		c.add();
		c.div();

		AnotherParent ap = (AnotherParent) c;
		ap.sub();
	}
}