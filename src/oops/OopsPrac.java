package oops;

interface Skill {
    void applySkill();
}

abstract class Person {
    protected String name;

    Person(String name) {
        this.name = name;
    }

    abstract void introduce();

    void commonBehavior() {
        System.out.println("I am a HUMAN");
    }
}

class Profile {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Volunteer extends Person implements Skill {

    private Profile profile;

    Volunteer(String name, Profile profile) {
        super(name);
        this.profile = profile;
    }

    @Override
    void introduce() {
        System.out.println("Hi, I am a volunteer " + name);
    }

    @Override
    public void applySkill() {
        System.out.println(name + " is applying skills");
    }

    void work() {
        System.out.println(name + " is working");
    }

    void work(String project) {
        System.out.println(name + " is working on " + project);
    }
}

class Organization extends Person {

    Organization(String name) {
        super(name);
    }

    @Override
    void introduce() {
        System.out.println("We are organization " + name);
    }
}

public class OopsPrac {
    public static void main(String[] args) {
        Profile profile = new Profile();
        profile.setEmail("volunteer@gmail.com");

        Volunteer volunteer = new Volunteer("Dhruv", profile);
        Person org = new Organization("Help");

        volunteer.introduce();
        org.introduce();

        volunteer.commonBehavior();

        volunteer.applySkill();

        volunteer.work();
        volunteer.work("Education");
    }
}
