import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artist vincentVanGogh;
    Artist leonardoDaVinci;
    Artwork theStarryNight;
    Artwork monaLisa;
    Customer customer;

    @BeforeEach
    public void setup(){
        gallery = new Gallery("Louvre");
        vincentVanGogh = new Artist("Vincent Van Gogh");
        leonardoDaVinci = new Artist("Leonardo Da Vinci");
        theStarryNight = new Artwork("The Starry Night", "Vincent Van Gogh", 10_000_000);
        monaLisa = new Artwork("Mona Lisa", "Leonardo da Vinci", 20_000_000);
        gallery.addArtwork(theStarryNight);
        gallery.addArtwork(monaLisa);
        customer = new Customer("Laura Hamilton", 40_000_000);
    }

    @Test
    public void galleryCanSellArt(){
        gallery.sellArtwork(customer,theStarryNight);
        assertThat(gallery.artworkCount()).isEqualTo(1);// in order to check how many artwork has been reduced by 1
        assertThat(gallery.getTill()).isEqualTo(10_000_000); // in order to check if gallery till is up to 10_000_000
        assertThat(customer.getWallet()).isEqualTo(30_000_000); // in order to check if customer wallet has reduced to 30_000_000
        assertThat(customer.getArtworkCount()).isEqualTo(1); // in order to check if customer artwork count has increased by 1
    }
    @Test
    public void canCalculateArtValue(){
        double result = gallery.calculateArtworkValue();
        assertThat(result).isEqualTo(30_000_000);
    }

    @Test
    public void hasName(){
        assertThat(gallery.getName()).isEqualTo("Louvre");
    }

    @Test
    public void tillStartsAtZero(){
        assertThat(gallery.getTill()).isEqualTo(0);

    }
}
