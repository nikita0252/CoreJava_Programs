package ConstructorUsingTasks;

public class DeveloperTest {

	public static void main(String args[])
	{
		Developer d = new Developer(101,"nikita","Smart Trolley",45550.45f,'A');
		
		System.out.println("Id :"+d.id);
		System.out.println("Name :"+d.name);
		System.out.println("Project Name :"+d.projectname);
		System.out.println("Salary :"+d.salary);
		System.out.println("Grade :"+d.grade);
	}
}
