package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.StudentModel;

public class StudentController {
	public List<StudentModel> studentList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	StudentModel s1;

	public void createStudent() {
		System.out.println("Creating a Pet\n");
		StudentModel sobj = new StudentModel();
		System.out.println("enter the Pet details");
		System.out.println("Pet Id");
		sobj.setId(scanner.nextInt());
		scanner.nextLine(); // Consume the newline character left in the buffer
		System.out.println("Pet Name");
		sobj.setName(scanner.nextLine());
		System.out.println(" Phone");
		sobj.setPhone(scanner.nextLine());
		System.out.println("Species");
		sobj.setSpecies(scanner.nextLine());
		System.out.println("Breed");
		sobj.setBreed(scanner.nextLine());
		System.out.println("age");
		sobj.setAge(scanner.nextInt());
		System.out.println("Status\n");
		sobj.setStatus(scanner.nextLine());
		System.out.println("description");
		sobj.setDescription(scanner.nextLine());
		studentList.add(sobj);
		
	}

	public void readStudent() {
		try {
			for (StudentModel student : studentList) {
				System.out.println(student.toString());
			}
//		System.out.println("Getting the student details");
//		System.out.println(s1.getId());
//		System.out.println(s1.getName());
//		System.out.println(s1.getPhone());

		} catch (Exception e) {
			System.out.println("Pet not found");
		}
	}

	public void updateStudent() {
		System.out.println("enter the Pet id to update");
		int id = scanner.nextInt();
		scanner.nextLine();
		for (StudentModel student : studentList) {
			if (student.getId() == id) {
				System.out.println("updating the Pet details");
				System.out.println("Enter new details");
				System.out.println("New Pet Name");
				student.setName(scanner.nextLine());
				System.out.println(" Phone");
				student.setPhone(scanner.nextLine());
				System.out.println(" Updatespecies");
				student.setSpecies(scanner.nextLine());
				System.out.println(" Update Breed");
				student.setBreed(scanner.nextLine());
				System.out.println("  Update Age");
				student.setAge(scanner.nextInt());
				System.out.println(" Update Status");
				student.setStatus(scanner.nextLine());
				System.out.println("Update description");
				student.setDescription(scanner.nextLine());

			} else {
				{
					System.out.println("Pet not found");
				}
			}
		}
	}

	public void deleteStudent() {
		System.out.println("enter the Pet id to delete");
		int id = scanner.nextInt();
		scanner.nextLine();
		for (StudentModel student : studentList) {
			if (student.getId() == id) {
				int index = studentList.indexOf(student);
				studentList.remove(index);
				break;
			}
		}
	}
}
