package fastus.springframework.sfgpetclinic.services.map;

import fastus.springframework.sfgpetclinic.model.Pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PetMapServiceTest {
    PetMapService petMapService;

    Pet pet;

    @BeforeEach
    void setUp() {
        petMapService = new PetMapService();
        pet = Pet.builder().id(1L).build();
        petMapService.save(pet);
    }

    @Test
    void findAll() {
        final Set<Pet> all = petMapService.findAll();

        assertEquals(1,all.size());
    }

    @Test
    void findById() {
        final Pet petById = petMapService.findById(1L);

        assertEquals(1,petById.getId());
    }

    @Test
    void save() {
        Pet petTwo =  Pet.builder().id(2L).build();

        final Pet savedPet = petMapService.save(petTwo);

        assertEquals(2,savedPet.getId());
    }

    @Test
    void delete() {
        petMapService.delete(pet);

        assertEquals(0,petMapService.findAll().size());
    }

    @Test
    void deleteById() {
        petMapService.deleteById(1L);

        assertNull(petMapService.findById(1L));
    }
}