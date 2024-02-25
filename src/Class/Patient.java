package Class;

public class Patient {
    private int id;
    private String name;
    private int age;
    private int tel_number;

    private String illness;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTel_number() {
        return tel_number;
    }

    public void setTel_number(int tel_number) {
        this.tel_number = tel_number;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }


    @Override
    public String toString() {
        return "\t\tPatient ID : " + id + "\t\tName: " + name + "\t\tAge : " + age + "\t\tTelephone :" + tel_number + "\t\tTpye of Illness : " + illness;
    }
}
