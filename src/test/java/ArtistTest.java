import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistTest {
    Artist davinci;

    @BeforeEach
    public void setUp(){
        davinci = new Artist("Davinci");
    }

    @Test
    public void hasName() {
        assertThat(davinci.getName()).isEqualTo("Davinci");
    }

//        Artist davinci = new Artist("Leonardo");
//        Artist monet = new Artist("Claude");
//        assertThat(monet.getName()).isEqualTo("Claude");
}
