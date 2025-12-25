
class SubjectData {
    String name;
    int totalCredits;
    int totalHours;   // fixed typo

    @Override
    public String toString() {
        return String.format(
            "Subject Name: %s, Total Credits: %d, Total Hours: %d",
            name, totalCredits, totalHours
        );
    }
}

public class Subject {
    public static void main(String[] args) {
        SubjectData x = new SubjectData();
        x.name = "Introduction to Software Engineering";
        x.totalCredits = 3;
        x.totalHours = 60;

        System.out.println(x);
    }
}
