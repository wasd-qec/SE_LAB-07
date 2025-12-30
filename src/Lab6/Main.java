public class Main {
        public static void main(String[] args) {
           // Test 1: Valid subject
        System.out.println("=== Test 1: Valid Subject ===");
        Subject x = new Subject();
        x.setName("Introduction to SE");
        x.setTotalCredits(3);
        x.setTotalHours(45);
        x.setPresentCount(10);
        x.setLateCount(2);
        x.setAbsentCount(1);
        System.out.println(x);
        
        // Test 2: Null name
        System.out.println("\n=== Test 2: Null Name ===");
        try {
            Subject y = new Subject();
            y.setName(null);
            y.setTotalCredits(3);
            System.out.println(y);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        // Test 3: Empty name
        System.out.println("\n=== Test 3: Empty Name ===");
        try {
            Subject z = new Subject();
            z.setName("");
            z.setTotalCredits(3);
            System.out.println(z);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        // Test 4: Whitespace-only name
        System.out.println("\n=== Test 4: Whitespace-only Name ===");
        try {
            Subject w = new Subject();
            w.setName("   ");
            w.setTotalCredits(3);
            System.out.println(w);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
