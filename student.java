public class student{
	private String name;
	private int age;

	public String getname(){
		return  this.name;
	}

	public void setname(String name)throws Exception{
		if (name==null) {
			throw new Exception System.out.println("name cannot be null");
		}
		else{
			this.name=name;		}
	}

	private static final int max_student=1000;

	public final int rollno;

	private static no_of_student=0;

	private static String color_of_uniform="white";

	public String getcolor_of_uniform(){
		return student.color_of_uniform;
	}

	public void set_color_of_uniform(String color_of_uniform){
		this.color_of_uniform=color_of_uniform;
	}

	public int get_no_student(){
		return student.no_of_student;
	}

	public void set_no_student(int no_of_student){
		this.no_of_student=no_of_studentl;
	}

	public student(String name)throws Exception{
		if (no_of_student==max_student) {
			throw new Exception System.out.println("no new entry will be there");
		}

		this.name=name;
		no_of_student++;
		this.rollno=no_of_student;
	}

}