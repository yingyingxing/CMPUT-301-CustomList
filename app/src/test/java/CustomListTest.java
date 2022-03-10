import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(listSize+1,list.getCount());
    }

    @Test
    void testHasCity(){


        City cityA = new City("Yellowknife", "Northwest Territories");
        list.add(cityA);

        assertTrue(list.hasCity(cityA));

        City cityB = new City("Toronto", "ABC");

        assertFalse(list.hasCity(cityB));

    }

    @Test
    void testDeleteCity(){


        City cityA = new City("Yellowknife", "Northwest Territories");
        list.add(cityA);

        list.deleteCity(cityA);

        assertFalse(list.hasCity(cityA));

    }
 
    @Test
    void testCountCites(){

        assertEquals(1, list.countCities());

        City cityA = new City("Yellowknife", "Northwest Territories");
        list.add(cityA);
        City cityB = new City("Toronto", "ABC");
        list.add(cityB);

        assertEquals(3, list.countCities());

    }


}
