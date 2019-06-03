package homeworkFourth;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int weight;
    private int height;

    private static class BuilderPerson {
        private Person newPerson;

        public BuilderPerson() {
            newPerson = new Person();
        }

        public BuilderPerson withName(String name) {
            newPerson.name = name;
            return this;
        }

        public BuilderPerson withSurname(String surname) {
            newPerson.surname = surname;
            return this;
        }

        public BuilderPerson withAge(int age) {
            newPerson.age = age;
            return this;
        }

        public BuilderPerson withWeight(int weight) {
            newPerson.weight = weight;
            return this;
        }

        public BuilderPerson withHeight(int height) {
            newPerson.height = height;
            return this;
        }

        public Person build() {
            return newPerson;
        }
    }

    public static void main(String[] args) {
        Person myPerson = new Person.BuilderPerson()
                .withName("Jane")
                .withSurname("Doe")
                .withAge(32)
                .withHeight(165)
                .withWeight(70)
                .build();
    }
}
