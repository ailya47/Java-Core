package HW1;

public class Team {
    protected String name;
    protected Competitor[] members;

    public Team(Competitor... members){
        this.name = name;
        this.members = members;
    }

    public String getName(){
        return new String(this.name);
    }

    public Competitor[] getTeammates(){
        return members.clone();
    }

    public void showSuccessfulResults(){
        for(Competitor c:this.members){
            if(c.isOnDistance())
                c.status();
        }
    }

    public void showResults(){
        for(Competitor c:this.members){
            c.status();
        }
    }
}
