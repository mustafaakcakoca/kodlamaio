package Kodlamaiohmrk.Languages.entities;

public class Language {
    int id;
    String name;
   public Language(){

   }
    public Language(int id ,String name){
        this.id=id;
        this.name=name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
