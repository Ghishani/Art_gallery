import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer ghishani;

    @BeforeEach
    public void setup() {
        ghishani = new Customer("ghishani", 200);
    }

    @Test
    public void hasName(){
        assertThat(ghishani.getName()).isEqualTo("ghishani");

    }

    @Test
    public void canGetWallet(){
        assertThat(ghishani.getName()).isEqualTo(200);
    }
}
