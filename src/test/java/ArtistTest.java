import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistTest {
    Artist davinci;
    private String name;

    @BeforeEach
    public void setUp(){
        davinci = new Artist("Davinci");
    }


    @Test
    public void hasName() {
        assertThat(davinci.getName()).isEqualTo("Davinci");
    }

    @Test
    public void testSetName(){
        Artist artist = new Artist("Previous Name");
        artist.setName("New Name");
        assertEquals("New Name", artist.getName());

    }
//        Artist davinci = new Artist("Leonardo");
//        Artist monet = new Artist("Claude");
//        assertThat(monet.getName()).isEqualTo("Claude");
}
