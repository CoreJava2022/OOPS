class MathematicOperation{
	public void add(int a,int b){
		int  c= a+b;
		System.out.println("Addition of two variable is "+c);
	}
	/*private void add(int x,int y,int z){
		int d= x+y+z;
		System.out.println("Addition of three variable is "+d);
	}*/
	private String add(int a,int b,int c ){
		int s= a+b+c;
		System.out.println("Addition of three variable is "+s);
		return "s";
	}
    public double add(double p,double q){
	double z=p+q;
	System.out.println("Addition  variable is "+z);
	return z;
}
public void add(String a,String b){
		String c= a + b;
		System.out.println("Addition of two variable is "+c);
	}

    public void add(int b,int a,String name){
		int  c= a+b;
		System.out.println("Addition of two variable is "+c);
	}
	public void add(String name,int b,int a){
		int  c= a+b;
		System.out.println("Addition of two variable is "+c);
	}
	public static void main(String[] args ){
		MathematicOperation mathematicOperation = new MathematicOperation();
		mathematicOperation.add(10,20);
		mathematicOperation.add(15,10,10);
		//mathematicOperation.add(10,1,30);
		mathematicOperation.add(10,5);
		mathematicOperation.add(10,5,"manasi");
		mathematicOperation.add("manasi",5,5);
		mathematicOperation.add("manasi","kulkarni");
	}
}