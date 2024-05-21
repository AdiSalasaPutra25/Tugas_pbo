/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agrocriptopus.family;

/**
 *
 * @author Adi
 */
// AbstractPerson.java
public abstract class AbstractPerson implements Person {
    protected String name;
    protected String job;
    protected String gender;

    public AbstractPerson(String name, String job, String gender) {
        this.name = name;
        this.job = job;
        this.gender = gender;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getJob() {
        return job;
    }

    @Override
    public String getGender() {
        return gender;
    }
}
