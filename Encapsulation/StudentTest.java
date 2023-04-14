class Student{
private String name;
private int age;
private long mobileNo;
private String address;
public String getName(){
	return name;
}
public String setName(String name){
	return this.name =name;
}
public int getAge(){
	return age;
}
public int setAge(int age){
	return this.age = age;
}
public long getMobileNo(){
	return mobileNo;
}  
public long setMobileNo(long mobileNo){
	return this.mobileNo = mobileNo;
}
public String getAddress(){
	return address;
}
public String setAddress(String address){
	return this.address =address;
}
}
public class StudentTest{
	
	public static void main(String [] args){
		Student student =new Student();
		student.setName("Tushar");
		System.out.println(student.getName());
		student.setAge(27);
		System.out.println(student.getAge());
		student.setMobileNo(9834052716l);
		System.out.println(student.getMobileNo());
		student.setAddress("Parner , Ahmednagar");
		System.out.println(student.getAddress());
	}
}