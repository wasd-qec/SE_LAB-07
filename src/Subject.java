/**
 * Subject class represents an academic subject with name, credits, and hours.
 * 
 * @author Rith Chankolboth
 * @version 1.0
 */
class Subject{
    String name;
    int totalcredits;
    int TotalHours;
    
    /**
     * Returns string representation of the subject.
     * 
     * @return formatted string with name, credits, and hours
     */
    public String toString(){
        return String.format("%s %d %d", name, totalcredits, TotalHours);
    }
    
    /**
     * Gets the name of the subject.
     * 
     * @return the subject name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the subject.
     * 
     * @param name the subject name to set
     * @throws IllegalArgumentException if name is null or empty
     */
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    /**
     * Gets the total credits for the subject.
     * 
     * @return the total credits
     */
    public int getTotalcredits() {
        return totalcredits;
    }

    /**
     * Sets the total credits for the subject.
     * 
     * @param totalcredits the total credits to set
     */
    public void setTotalcredits(int totalcredits) {
        this.totalcredits = totalcredits;
    }

    /**
     * Gets the total hours for the subject.
     * 
     * @return the total hours
     */
    public int getTotalHours() {
        return TotalHours;
    }

    /**
     * Sets the total hours for the subject.
     * 
     * @param totalHours the total hours to set
     */
    public void setTotalHours(int totalHours) {
        TotalHours = totalHours;
    }
    
    /**
     * Main method to test the Subject class.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.name = "Mathematics";
        subject.totalcredits = 4;
        subject.TotalHours = 60;
        System.out.println(subject);
    }
}
