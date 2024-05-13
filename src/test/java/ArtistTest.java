import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    @Test
    public void hasName(){
        Artist davinci = new Artist("Leonardo");
        Artist monet = new Artist("Claude");
        assertThat(monet.getName()).isEqualTo("Claude");
    }
}
