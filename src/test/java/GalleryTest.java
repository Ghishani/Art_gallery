import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    @Test
    public void hasName(){
        Gallery louvre = new Gallery("Louvre");
        assertThat(louvre.getName()).isEqualTo("Louvre");
    }

    @Test
    public void hasTill(){
    }
}
