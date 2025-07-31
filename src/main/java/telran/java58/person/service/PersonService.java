package telran.java58.person.service;

import telran.java58.person.dto.*;

public interface PersonService {
    void addPerson(PersonDto personDto);

    PersonDto getPerson(int id);

    PersonDto deletePerson(int id);

    PersonDto updatePersonName(Integer id, String newName);

    PersonDto updatePersonAddress(Integer id, AddressDto newAddress);

    PersonDto[] findPersonsByName(String name);

    PersonDto[] findPersonsByCity(String city);

    PersonDto[] findPersonsBetweenAges(Integer minAge, Integer maxAge);

    Iterable<CityPopulationDto> getCitiesPopulation();

    EmployeeDto[] findEmployeeBySalary(int min, int max);

    ChildDto[] getChildren();
}
