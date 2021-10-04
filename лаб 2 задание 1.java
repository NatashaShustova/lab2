public class lab2 {
	public static void main(String[] args) {
		Student a = new Student("Anastasia", "Ivanova", "678", 5.00);
		Aspirant b = new Aspirant ("Anna", "Petrova", "942", 4.80, "scienceWork1");
		Student c = new Aspirant ("Roman", "Kolesnikov", "523", 4.44, "scienceWork2");
		Student[] students = {a, b, c};
		for (Student i: students) {
		    System.out.println(i.getScholarship());
		}
	}
}
public class Student {
    String firstName, lastName,group;
    double averageMark;
    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.group=group;
        this.averageMark=averageMark;
    }
    int getScholarship() {
        if (this.averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
public class Aspirant extends Student {
    String scinceWork;
    public Aspirant(String firstName, String lastname, String group, double averageMark, String scinceWorkTitle) {
        super(firstName, lastname, group, averageMark);
        this.scinceWork=scinceWork;
    }
    @Override
    int getScholarship() {
        return (this.averageMark==5) ? 200:180;
    }
}

