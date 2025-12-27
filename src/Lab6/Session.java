public class Session {
    private int start;
    private int stop;
    private int presentCount;
    private int lateCount;
    private int absentCount;

    public void setDuration(int start, int stop) {
        if (start < 0 || stop < 0 || stop < start) {
            throw new IllegalArgumentException("Invalid start or stop time");
        }
        this.start = start;
        this.stop = stop;
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

    public void setLateCount(int lateCount) {
        this.lateCount = lateCount;
    }

    public int getAbsentCount() {
        return absentCount;
    }

    public void setAbsentCount(int absentCount) {
        this.absentCount = absentCount;
    }

    public double calculateAttendanceScore() {
        int totalSessions = presentCount + lateCount + absentCount;
        if (totalSessions == 0) {
            return 0.0;
        }
        double score = ((presentCount + (lateCount * 0.5)) / (double) totalSessions) * 100;
        return score;
    }
}
