import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Artwork monaLisa;
    Artwork theStarryNight;

    @BeforeEach
    public void setup() {

        customer = new Customer("ghishani", 15_000_000);

        theStarryNight = new Artwork("The Starry Night", "Vincent Van Gogh", 10_000_000);

        monaLisa = new Artwork("Mona Lisa","Da Vinchi", 20_000_000);
        }

    @Test
    public void canAffordArtwork_true(){
        assertThat(customer.canBuy(theStarryNight)).isEqualTo(true);
    }

    @Test
    public void canAffordArtwork_false(){
        assertThat(customer.canBuy(monaLisa)).isEqualTo(false);
    }

    @Test
    public void customerArtworkCountStartsEmpty(){
        assertThat(customer.getArtworkCount()).isEqualTo(0);
    }

    @Test
    public void canBuyArtwork(){
        customer.buyArtwork(theStarryNight);
        assertThat(customer.getWallet()).isEqualTo(5_000_000);
        assertThat(customer.getArtworkCount()).isEqualTo(1);
    }


    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("ghishani");

    }

    @Test
    public void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(15_000_000);
    }
}
