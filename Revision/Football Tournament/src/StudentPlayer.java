/**
 * Created by Osama Halabi on 2020/09/28.
 */
public class StudentPlayer extends Player {
    private int quid;
    private String major;

    public StudentPlayer() { }

    public StudentPlayer(int quid, String major) {
        this.quid = quid;
        this.major = major;
    }

    public StudentPlayer(String name, String team, String position, int quid, String major) {
        super(name, team, position);
        this.quid = quid;
        this.major = major;
    }

    // override toSting method in the Player
    @Override
    public String toString () {
        return  super.toString() + "quid" + quid + "major" + major;
    }


    public int getQuid() {
        return quid;
    }

    public void setQuid(int quid) {
        this.quid = quid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
