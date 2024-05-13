import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork monaLisa;

    @BeforeEach
    public void setup(){
        monaLisa = new Artwork("Mona Lisa","Da Vinchi", 100);
    }

    @Test
    public void hasTitle() {
        assertThat(monaLisa.getTitle()).isEqualTo("Mona Lisa");
    }

    @Test
    public void hasArtist(){
        assertThat(monaLisa.getArtist()).isEqualTo("Da vinchi");
    }

    @Test
    public void hasPrice(){
        assertThat(monaLisa.getPrice()).isEqualTo(150);
    }
}
