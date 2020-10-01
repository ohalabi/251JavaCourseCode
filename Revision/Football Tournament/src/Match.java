/**
 * Created by Osama Halabi on 2020/09/28.
 */
public class Match {
    private String date;//dd/mm/yyyy
    private String result;// goalsOfTeam1:goalsOfTeam2
    private Player[] team1;
    private Player[] team2;

    public Match(Player[] team1, Player[] team2, String date) {
        setTeam1(team1);
        setTeam2(team2);
        setDate(date);
    }


        public String getDate () {
            return date;
        }

        public void setDate (String date){
            this.date = date;
        }

        public String getResult () {
            return result;
        }

        public void setResult (String result){
            this.result = result;
        }

        public Player[] getTeam1 () {
            return team1;
        }

        public void setTeam1 (Player[]team1){
            this.team1 = team1;
        }

        public Player[] getTeam2 () {
            return team2;
        }

        public void setTeam2 (Player[]team2){
            this.team2 = team2;
        }
    }
