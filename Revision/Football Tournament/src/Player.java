/**
 * Created by Osama Halabi on 2020/09/28.
 */
public class Player {
    private String name;
    private String team;//CSE, MENG, ELENG, MATH, GENG, ...
    private String position = "ANY";//GK, CD, RD, LD, CM, RM, LM, CF, RF, LF private double energy = 100.0;//in percentage
    protected double energy = 100.0;//in percentage

    public Player() {
    }

    public Player(String name, String team, String position) {
        setName(name);
        setTeam(team);
        setPosition(position);
    }

    public boolean moveOneStep() {
        if ((energy-0.005) > 0){
            setEnergy(energy- 0.005);
            return true;
        }
        return false;
    }

    public String toString() {
        return "Player [name=" + name + ", team=" + team +
                ", position=" + position + ", energy=" + energy + "]";
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
