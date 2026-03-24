public class Member
{
    public String fullName;
    public boolean hasCheckedOutBook;
    public boolean hasSubscribed;
    public String subscriptionPlan;
    public int idNum;


    public Member(String fullName, boolean hasCheckedOutBook, boolean hasSubscribed, String subscriptionPlan, int idNum)
    {
        this.fullName = fullName;
        this.hasCheckedOutBook = hasCheckedOutBook;
        this.hasSubscribed = hasSubscribed;
        this.subscriptionPlan = subscriptionPlan;
        this.idNum = idNum;

    }
}
