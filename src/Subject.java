class Subject{
    String name;
    int totalcredits;
    int TotalHours;
    public String toString(){
        return String.format("%s %d %d", name, totalcredits, TotalHours);
    }
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.name = "Mathematics";
        subject.totalcredits = 4;
        subject.TotalHours = 60;
        System.out.println(subject);
    }
}
