class Subject{
    String name;
    int totalcredits;
    int TotalHours;
    public String toString(){
        return String.format("%s %d %d", name, totalcredits, TotalHours);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalcredits() {
        return totalcredits;
    }

    public void setTotalcredits(int totalcredits) {
        this.totalcredits = totalcredits;
    }

    public int getTotalHours() {
        return TotalHours;
    }

    public void setTotalHours(int totalHours) {
        TotalHours = totalHours;
    }
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.name = "Mathematics";
        subject.totalcredits = 4;
        subject.TotalHours = 60;
        System.out.println(subject);
    }
}
