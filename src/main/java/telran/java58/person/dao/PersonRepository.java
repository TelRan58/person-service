package telran.java58.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import telran.java58.person.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
