import java.util.Random;

public class Student {

    private String name;
    private String registration;
    private Boolean passed;

    public Student(String name) {
        this.name = name;
        createRegistration();
        this.passed = false;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getRegistration() {
        return registration;
    }

    public Boolean getPassed() {
        return passed;
    }

    public void setPassed(Boolean passed) {
        this.passed = passed;
    }

    public void createRegistration() {
        try {
            Random random = new Random();
            StringBuilder stringBuilder = new StringBuilder();
            int value = 0;

            for (int i = 0; i < 10; i++) {
                value = random.nextInt(10);
                stringBuilder.append(value);
            }
            this.registration = stringBuilder.toString();
        } catch (Exception e) {
            System.out.println("Error: Enter with value valid!");
        }
    }
}
