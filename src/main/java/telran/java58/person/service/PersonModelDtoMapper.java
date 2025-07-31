package telran.java58.person.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import telran.java58.person.dto.ChildDto;
import telran.java58.person.dto.EmployeeDto;
import telran.java58.person.dto.PersonDto;
import telran.java58.person.model.Child;
import telran.java58.person.model.Employee;
import telran.java58.person.model.Person;

@Component
@RequiredArgsConstructor
public class PersonModelDtoMapper {
    private final ModelMapper modelMapper;

    public Person mapToModel(PersonDto personDto) {
        if (personDto instanceof ChildDto) {
            return modelMapper.map(personDto, Child.class);
        }
        if (personDto instanceof EmployeeDto) {
            return modelMapper.map(personDto, Employee.class);
        }
        return modelMapper.map(personDto, Person.class);
    }

    public PersonDto mapToDto(Person person) {
        if (person instanceof Child) {
            return modelMapper.map(person, ChildDto.class);
        }
        if (person instanceof Employee) {
            return modelMapper.map(person, EmployeeDto.class);
        }
        return modelMapper.map(person, PersonDto.class);
    }
}
