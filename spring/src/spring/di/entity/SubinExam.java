package spring.di.entity;

public class SubinExam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int comp;
	
	@Override
	public int total() {
		return kor+eng+math+comp;
	}

	@Override
	public float avg() {
		return total() / 4.0f;
	}

}
