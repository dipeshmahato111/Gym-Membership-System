/**
 * Represents an administrator with permissions to manage members.
 */
public class GymAdmin extends User {
    private int adminId;

    public GymAdmin(int id, String name, String email, String password) {
        this.userId = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     * Simulates administrative management of a member account.
     * @param member The GymMember object to be managed.
     */
    public void manageMember(GymMember member) {
        System.out.println("Admin " + name + " is now managing member: " + member.name);
    }
}