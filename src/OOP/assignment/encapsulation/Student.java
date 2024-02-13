package OOP.assignment.encapsulation;

public class Student {
public String name;
protected int studentId;
protected String history;
private int SSN;

public Student (String n, int Id) {
	this.name = n;
	this.studentId=Id;
}

//since the getter and setter is public SSN can be accessed by another class or another package to get/set value
public int getSSN() {
	return this.SSN; 
}
protected String getHistory() {
	return history;
}

protected void setHistory(String history) {
	this.history = history;
}

public void setSSN(int num) {
	this.SSN = num;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}

//protected getter and setter are accessed within same packages


@Override
public String toString() {
	return "Student [name=" + name + ", studentId=" + studentId + ", history=" + history + ", SSN=" + SSN + "]";
}


}
