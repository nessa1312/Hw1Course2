public class Human {

    public int age;
    public String name;
    public String city;
    public String post;

    public Human(int age, String name, String city, String post) {
        if (age < 0){
            this.age = 0;
        }else{
            this.age = age;
        }
        if (name == null){
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (city == null){
            this.city = "Информация не указана";
        } else {
            this.city = name;
        }
        if (post == null){
            this.post = "Информация не указана";
        } else {
            this.post = name;
        }
    }
}
