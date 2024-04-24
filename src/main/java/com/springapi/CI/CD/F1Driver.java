package com.springapi.CI.CD;

public class F1Driver {

    private String name;
    private int id;
    private String team;


    private String nat;

    public F1Driver(String name, int id, String team, String nat) {
        this.name = name;
        this.id = id;
        this.team = team;
        this.nat = nat;
    }

    public String getNat() {
        return nat;
    }


    public String getName() {
        return name;
    }


    public long getId() {
        return id;
    }


    public String getTeam() {
        return team;
    }



    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", id=" + id +
                ", Team='" + team + '\'' +
                ", Nat='" + nat + '\'';
    }
}
