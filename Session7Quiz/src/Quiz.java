import java.util.Scanner;

class Person{
	public String name;
	public  String born_date;
	
	public Person(String name, String born_date){
		this.name = name;
		this.born_date = born_date;
	}
	
	public void sleep() {
		System.out.println("Person is sleeping");
	}
	
	public String getInfo() {
		return ("Name :" + name + "\n" + "Born Date :" + born_date);
	}
}

class Mahasiswa extends Person{
	public String student_id;
	public int point;
	
	public Mahasiswa(String name, String born_date, String student_id, int point){
		super(name, born_date);
		this.student_id = student_id;
		this.point = point;
	}
	
	public void helpingDosen(int point) {
		System.out.println("Helping Dosen Done ! " + point + " point(s) added!");
		this.point += point;
	}
	
	@Override
	public String getInfo() {
		return (super.getInfo() + "\n" + "Student ID : " + student_id + "\n" + "Point : " + point);
	}
}

class Dosen extends Person{
	public String code_dosen;
	public int point;
	
	public Dosen(String name, String born_date, String code_dosen, int point){
		super(name, born_date);
		this.code_dosen = code_dosen;
		this.point = point;
	}
	
	public void selfDev(int point) {
		System.out.println("Self Development Done ! " + point + " point(s) added!");
		this.point += point;
	}
	
	public void teach(int point) {
		System.out.println("Teaching Done ! " + point + " point(s) added!");
		this.point += point;
	}
	
	public void p2m(int point) {
		System.out.println("P2M Done ! " + point + " point(s) added!");
		this.point += point;
	}
	
	public void research(int point) {
		System.out.println("Research Done ! " + point + " point(s) added!");
		this.point += point;
	}
	
	public void otherWorks(int point) {
		System.out.println("Other Works Done ! " + point + " point(s) added!");
		this.point += point;
	}
	
	@Override
	public String getInfo() {
		return (super.getInfo() + "\n" + "Code Dosen : " + code_dosen + "\n" + "Point : " + point);
	}
}

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Michael", "12/02/02");
		Mahasiswa m = new Mahasiswa("Kevin", "23/09/2002", "2540119280", 10);
		Dosen d = new Dosen("Jason", "22/09/99", "D1203", 50);
		
		
		Scanner scan = new Scanner(System.in);
		int result;
		System.out.println("Input displayed class");
		System.out.println("1. Person");
		System.out.println("2. Mahasiswa");
		System.out.println("3. Dosen");
		System.out.print(">>");
		result = scan.nextInt();
		
		if(result == 1) {
			p.sleep();
			System.out.println(p.getInfo());
		}
		else if(result == 2) {
			m.helpingDosen(10);
			System.out.println(m.getInfo());
		}
		else if(result == 3) {
			d.selfDev(10);
			d.teach(15);
			d.p2m(10);
			d.research(10);
			d.otherWorks(5);
			System.out.println(d.getInfo());
		}
	}

}
