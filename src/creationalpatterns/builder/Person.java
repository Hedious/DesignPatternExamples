package creationalpatterns.builder;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getJob() {
        return job;
    }

    private int age;
    private String address;
    private String job;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
        this.job = personBuilder.job;
    }

    public String toString() {
        return "Name - " + this.name + " Age - " + this.age +
                " Address - " + this.address + " Job - " + this.job;
    }


    public static class PersonBuilder {
        private final String name;
        private final int age;
        private String address;
        private String job;

        public PersonBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public PersonBuilder addAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder addJob(String job) {
            this.job = job;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }


    //Also need to Know Abstract and Director in this pattern
}
