class StudentTest 
{
	public static void main(String[] args) 
	{
		Student s =  new Student();
		s.id = 1000;
		s.name = "Pavi";
		s.gender = 'F';
		System.out.println("Student Info"+s.id+"\n"+s.name+"\n"+s.gender);
		s.updateProfile("Pavithra");
		System.out.println("Student Info"+s.id+"\n"+s.name+"\n"+s.gender);
		
	}
}
