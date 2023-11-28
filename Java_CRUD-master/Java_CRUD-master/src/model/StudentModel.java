package model;

public class StudentModel {
	private int id;
	private String name;
	private String phone;
	private String species;
	private String breed;
	private int age;
	private String status;
	private String description;

	
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentModel(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.species= species;
		this.breed= breed;
		this.age=age;
		this.status=status;
		this.description=description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int i) {
		this.age = i;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	


	@Override
	public String toString() {
		return "Pet Details [id=" + id + ", name=" + name + ", phone=" + phone + ",species=" + species+",breed="+ breed+",age"+age+",status"+status+",description"+description+"]";
	}
}
