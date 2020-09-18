package UML;

import java.util.List;

public class User extends Person implements Designer{
    public Department department;
    public List<Responsibility>responsibilities;

    class Hand{

    }
    @Override
    public void createArt() {

    }

    public void createRelationship(Customer customer) {

    }
}
