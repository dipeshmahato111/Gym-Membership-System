import java.util.Date;

/**
 * Handles the details of a gym subscription, including dates and status.
 */
public class Membership {
    private int membershipId;
    private String type;
    private String status;
    private Date startDate;
    private Date endDate;

    public void activateMembership() {
        this.status = "Active";
        System.out.println("Membership has been activated.");
    }

    public void deactivateMembership() {
        this.status = "Inactive";
        System.out.println("Membership has been deactivated.");
    }
}