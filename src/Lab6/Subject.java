class SubjectData {
    private String name;
    private int totalCredits;
    private int totalHours;

    private int presentCount;
    private int lateCount;
    private int absentCount;

    // Existing Getters/Setters
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

    public int getPresentCount() {
         return presentCount; 
        }
    public void setPresentCount(int presentCount) {
         this.presentCount = presentCount; 
        }

    public int getLateCount() {
         return lateCount; 
        }
    public void setLateCount(int lateCount) 
    { this.lateCount = lateCount; 

    }

    public int getAbsentCount() {
         return absentCount; 
        }
    public void setAbsentCount(int absentCount) {
         this.absentCount = absentCount; 
        }

    public double calculateAttendanceScore() {
        int totalSessions = presentCount + lateCount + absentCount;
        
        // Prevent division by zero if no attendance is recorded yet
        if (totalSessions == 0) return 0.0;

        double score = (presentCount + (lateCount * 0.5)) / totalSessions;
        return score * 100;
    }

    @Override
    public String toString() {
        return String.format(
            "Subject: %s\nCredits: %d\nHours: %d\nAttendance Score: %.2f%% (P: %d, L: %d, A: %d)",
            name, totalCredits, totalHours, calculateAttendanceScore(), 
            presentCount, lateCount, absentCount
        );
    }
}

public class Subject {
    public static void main(String[] args) {
        SubjectData x = new SubjectData();
        x.setName("Introduction to SE");
        x.setTotalCredits(3);
        x.setTotalHours(45);

        // Setting attendance data
        x.setPresentCount(10);
        x.setLateCount(2);
        x.setAbsentCount(1);
        
        System.out.println("Attendance score: "+ x.calculateAttendanceScore() + "%");

        System.out.println(x);
    }
}