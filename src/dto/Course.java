package dto;

public class Course {
	
	private String name;
	
	private String category;
	
	private int noOfstudents;
	
	private int reviewCourses;

	public Course(String name, String category, int reviewCourses , int noOfstudents) {
		this.name = name;
		this.category = category;
		this.noOfstudents = noOfstudents;
		this.reviewCourses = reviewCourses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNoOfstudents() {
		return noOfstudents;
	}

	public void setNoOfstudents(int noOfstudents) {
		this.noOfstudents = noOfstudents;
	}

	public int getReviewCourses() {
		return reviewCourses;
	}

	public void setReviewCourses(int reviewCourses) {
		this.reviewCourses = reviewCourses;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", noOfstudents=" + noOfstudents + ", reviewCourses="
				+ reviewCourses + "]";
	}

	
	
}
