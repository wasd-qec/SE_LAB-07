
class SubjectData {
    private String name;
    private int totalCredits;
    private int totalHours;   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

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
        x.setName("Introduction to SE");
        x.setTotalCredits(3);
        x.setTotalHours(45);

        System.out.println(x);
    }
}
