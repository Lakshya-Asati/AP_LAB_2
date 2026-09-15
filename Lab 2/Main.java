

public class Main
{
	public static void main(String[] args) {
		Child c1=new Child();
		c1.setname("A");
		Child c2=new Child();
		c2.setname("B");
        Child c3=new Child();
	    c3.setname("C");
	    Child c4=new Child();
	    c4.setname("D");
	    Child c5=new Child();
	    c5.setname("E");
	    
	    Mother m=new Mother();
	    m.child[0]=c1;
	    m.child[1]=c2;
	    m.child[2]=c3;
	    m.child[3]=c4;
	    m.child[4]=c5;
	    m.show();

	}
}
