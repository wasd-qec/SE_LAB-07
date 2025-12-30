/**
 * ------------------------------------------------------------
 * Class Name: Subject
 * Author: Seavhong, Vathanak, Kolboth
 * Course: Introduction to Software Engineering
 * Lab: SE - Lab 06 (Coding Standards)
 * Description:
 *   This class represents a Year 2 subject/course.
 *   It follows Java coding standards, naming conventions,
 *   and limited use of global variables.
 * ------------------------------------------------------------
 */

public class Subject {
        /* =======================
       Constants (Global Usage)
       ======================= */
    public static final int MAX_CREDITS = 5;
        /* =======================
       Attributes
       ======================= */
    private String name;
    private int totalCredits;
    private int totalHours;

    private int presentCount;
    private int lateCount;
    private int absentCount;


    /* =======================
       Getters & Setters
       ======================= */

    public String getName() {
         return name; 
        }
    /**
     * Sets the subject name.
     * @param name subject name
     * @throws IllegalArgumentException if name is null or empty
     */

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Subject name cannot be null or empty");
        }
         this.name = name; 
        }

    public int getTotalCredits() {
         return totalCredits; 
        }

    public void setTotalCredits(int totalCredits) { 
         if (totalCredits < 0 || totalCredits > MAX_CREDITS) {
            throw new IllegalArgumentException("Invalid credit value");
        }
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
    /**
     * Calculates the score out of 100 based on attendance.
     * Formula: ((Present + (Late * 0.5)) / Total Sessions) * 100
     */
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