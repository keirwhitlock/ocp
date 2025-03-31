public class Student {

    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString(){
        return String.format("Student{id: %s, name: %s, dateOfBirth: %s, classList: %s}\n",id, name, dateOfBirth, classList);
    }
}