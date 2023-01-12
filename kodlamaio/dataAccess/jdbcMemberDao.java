package kodlamaio.dataAccess;

import kodlamaio.entities.Person;

public class jdbcMemberDao implements BasePersonDao{
    @Override
    public void add(Person person) {
        System.out.println("JDBC ile eklendi"+person.getFullName());
    }

    @Override
    public void remove(Person person) {
        System.out.println("JDBC ile Silindi"+person.getFullName());
    }

    @Override
    public void update(Person person) {
        System.out.println("JDBC ile Güncellendi"+person.getFullName());
    }
}
