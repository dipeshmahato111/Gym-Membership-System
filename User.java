/**
 * The User class serves as the base class for all individuals in the system.
 * It contains core authentication details like email and password.
 */
public class User {
    protected int userId;
    protected String name;
    protected String email;
    protected String password;

    /**
     * Authenticates a user based on email and password.
     * @param email The email entered by the user.
     * @param password The password entered by the user.
     * @return true if credentials match, false otherwise.
     */
    public boolean login(String email, String password) {
        if (this.email != null && this.password != null) {
            return this.email.equals(email) && this.password.equals(password);
        }
        return false;
    }

    public void logout() {
        System.out.println(name + " has logged out successfully.");
    }
}