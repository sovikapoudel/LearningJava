package encapsulation;

public class SingleDataUnitClass {
	
	private int StudentId;
	private String name;
	private int GPA;
	private String semester;
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public int getGPA() {
		return GPA;
	}
	public void setGPA(int GPA) {
		this.GPA = GPA;
	}
	@Override
	public String toString() {
		return "SingleDataUnitClass [StudentId=" + StudentId + ", name=" + name + ", GPA=" + GPA + ", semester="
				+ semester + "]";
	}


}
