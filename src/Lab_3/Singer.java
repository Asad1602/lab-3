package Lab_3;

public class Singer {
    String name;
    String nationality;

    String gender;

    Date debutYear;

    public Singer(String name, String nationality, String gender, Date debutYear) {
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
        this.debutYear = debutYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(Date debutYear) {
        this.debutYear = debutYear;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                ", debutYear=" + debutYear +
                '}';
    }
}
