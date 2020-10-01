/**
 * Created by Osama Halabi on 2020/09/28.
 */
public class StaffPlayer extends Player {
    private int EmploymentNo;
    private String role; //teaching, admin, support public StaffPlayer() { }

    public StaffPlayer() {
    }

    public StaffPlayer(int employmentNo, String role) {
        EmploymentNo = employmentNo;
        this.role = role;
    }

    //write fully parameterized constructor
    public StaffPlayer (String name, String team, String position, int employementNo, String role) {
        super(name, team, position);
        setEmploymentNo(employementNo);
        setRole(role);
    }


    //override the moveOneStep method
    @Override
    public boolean moveOneStep() {
        if ((energy-0.1) > 0){
            setEnergy(energy- 0.1);
            return true;
        }
        return false;
    }

    public int getEmploymentNo() {
        return EmploymentNo;
    }

    public void setEmploymentNo(int employmentNo) {
        EmploymentNo = employmentNo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
