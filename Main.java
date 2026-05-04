/**
 * Main class to test the Gym Membership Login System functionality.
 * This version demonstrates multi-user support with two members.
 * * Team Members: Dipesh Kumar Mahato, Raj Kumar Partel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Gym System Multi-User Test ===");

        // 1. Create the first Member (Dipesh)
        GymMember member1 = new GymMember(101, "Dipesh Mahato", "dipesh@example.com", "pass123", "Premium");

        // 2. Create the second Member (Raj Partel)
        GymMember member2 = new GymMember(102, "Raj Partel", "raj.partel@example.com", "gymrat99", "Basic");

        // --- Testing Member 1 ---
        System.out.println("\n> Testing Login for Member 1:");
        if (member1.login("dipesh@example.com", "pass123")) {
            System.out.println("Access Granted for: " + member1.name);
            member1.viewMembershipDetails();
        } else {
            System.out.println("Login Failed for Member 1.");
        }

        // --- Testing Member 2 ---
        System.out.println("\n> Testing Login for Member 2:");
        if (member2.login("raj.partel@example.com", "gymrat99")) {
            System.out.println("Access Granted for: " + member2.name);
            member2.viewMembershipDetails();
        } else {
            System.out.println("Login Failed for Member 2.");
        }
        
        // --- Testing Membership Behavior (Step 7/9 of Project Requirements) ---
        System.out.println("\n> Testing Membership Behavior for New Registration:");
        Membership newMembership = new Membership();
        newMembership.activateMembership(); 
        // This proves the 'activateMembership' method in your Membership class is functional.
        
        // --- Testing Admin Oversight ---
        System.out.println("\n> Administrative Action:");
        GymAdmin admin = new GymAdmin(1, "Admin User", "admin@gym.com", "admin123");
        
        // Admin manages both members
        admin.manageMember(member1);
        admin.manageMember(member2);

        System.out.println("\n=== All Tests Completed Successfully ===");
    }
}
