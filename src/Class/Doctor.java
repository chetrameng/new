package Class;

public class Doctor {
    private int doc_id;
    private String doc_name;
    private char doc_sex;

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int Doc_id) {
        this.doc_id = Doc_id;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public char getDoc_sex() {
        return doc_sex;
    }

    public void setDoc_sex(char doc_sex) {
        this.doc_sex = doc_sex;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "getDoc_id=" + doc_id +
                ", doc_name='" + doc_name + '\'' +
                ", doc_sex=" + doc_sex +
                '}';
    }
}
