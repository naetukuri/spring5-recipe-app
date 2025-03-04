package guru.springframework.domain;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class CategoryTest {
    Category category;
    @Before
    public void setup(){
        category= new Category();
    }
    @Test
    public void getId() {
        Long idValue= 4L;
        category.setId(idValue);
        assertEquals(idValue,category.getId());
    }

    @Test
    public void getDescription() {
        String description="Mexican";
        category.setDescription(description);
        assertEquals(description,category.getDescription());
    }

    @Test
    public void getRecipes() {
    }
}
