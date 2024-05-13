import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery louvre;

    @BeforeEach
    public void setup(){
        louvre = new Gallery("Louvre", 200);
    }


    @Test
    public void hasName(){
        assertThat(louvre.getName()).isEqualTo("Louvre");
    }

    @Test
    public void hasTill(){
        assertThat(louvre.getTill()).isEqualTo(200);

    }
}
