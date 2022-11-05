public class Human {
    String name;
    String town;
    String jobTitle;
    int yearOfBirth;
    Human(String name,String town,int yearOfBirth,String jobTitle){
        if (name != " " && name != null) {
        this.name = name;
        } else { this.name = "(информация не указанна)";}
        if (town != " " && town != null) {
            this.town = town;
        } else { this.town = "(информация не указанна)";}
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (jobTitle != " " && jobTitle != null) {
            this.jobTitle = jobTitle;
        } else { this.jobTitle = "(информация не указанна)";}
    }
    public String toString() {
        return "Привет! Меня зовут " + name + "."+"Я из города " + town + "."+
                "Я родился(родилась) в " + yearOfBirth + " году. Я работаю на должности "
                + jobTitle + ". Будем знакомы!";
    }
}


