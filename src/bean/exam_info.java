package bean;

/*{
	 "course":"android",
	 "total":20,
	 "time":10,
	 "question":"android.json"
	}*/
public class exam_info {
	private String course;
	private int total;
	private int time;
	private String question;
	public exam_info(){}
	public exam_info(String course,int total,int time,String question){
		this.course=course;
		this.total=total;
		this.time=time;
		this.question=question;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "考试科目：" + course + 
				", 考题数量" + total + 
				", 时间："+ time + 
				", 问题：" + question + "]";
	}
	
}
