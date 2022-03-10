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
    public void testHasCity(){


        City cityA = new City("Yellowknife", "Northwest Territories");
        list.addCity(cityA);

        assertTrue(list.hasCity(cityA));

        City cityB = new City("Toronto", "ABC");

        assertFalse(list.hasCity(cityB));

    }

    @Test
    public void testDeleteCity(){


        City cityA = new City("Yellowknife", "Northwest Territories");
        list.addCity(cityA);

        list.deleteCity(cityA);

        assertFalse(list.hasCity(cityA));

    }

    @Test
    public void testCountCites(){



        City cityA = new City("Yellowknife", "Northwest Territories");
        list.addCity(cityA);
        City cityB = new City("Toronto", "ABC");
        list.addCity(cityB);

        assertEquals(2, list.countCities());

    }


}
