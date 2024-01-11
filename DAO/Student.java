package DAO;
public class Student {
		private int StudentId;
		private String First_name;
		private String Last_name;
		private String Branch;
		
		
		
		@Override
		public String toString() {
			return "Student [StudentId=" + StudentId + ", First_name=" + First_name + ", Last_name=" + Last_name
					+ ", Branch=" + Branch + "]";
		}
		public Student(int studentId, String first_name, String last_name, String branch) {
			
			StudentId = studentId;
			First_name = first_name;
			Last_name = last_name;
			Branch = branch;
		}
		public int getStudentId() {
			return StudentId;
		}
		public void setStudentId(int studentId) {
			StudentId = studentId;
		}
		public String getFirst_name() {
			return First_name;
		}
		public void setFirst_name(String first_name) {
			First_name = first_name;
		}
		public String getLast_name() {
			return Last_name;
		}
		public void setLast_name(String last_name) {
			Last_name = last_name;
		}
		public String getBranch() {
			return Branch;
		}
		public void setBranch(String branch) {
			Branch = branch;
		}
		
		
}
