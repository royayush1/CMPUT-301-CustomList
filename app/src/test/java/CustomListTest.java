import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }


    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), listSize + 1);


    }

    @Test
    public void hasCityTest(){
        list.addCity(new City("Edmonton", "AB"));
        assertTrue(list.hasCity(new City("Edmonton", "AB")));
        City newCity = new City("Vancouver", "BC");
        list.addCity(newCity);
        assertTrue(list.hasCity(newCity));
    }

    @Test
    public void deleteCityTest(){
        list.addCity(new City("Edmonton", "AB"));
        City newCity = new City("Vancouver", "BC");
        list.addCity(newCity);
        int listSize = list.getCount();
        list.deleteCity(newCity);
        assertEquals(list.getCount(), listSize - 1);
        int newListSize = list.getCount();
        list.deleteCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), newListSize - 1);


    }


}
