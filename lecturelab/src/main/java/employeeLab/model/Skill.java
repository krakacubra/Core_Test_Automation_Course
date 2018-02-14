package main.java.employeeLab.model;

public enum Skill {
    JAVA("Can develop new things using Java"),
    TEST("Can test an awful thing"),
    ENLISH("Excellent english"),
    TEAM_PLAYER("Like people");
    String discription;
    Skill(String discription){
        this.discription = discription;
    }

}
