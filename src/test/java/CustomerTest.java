import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    @Test
    public void hasName() {
        Customer maria = new Customer("Maria", 200);
        Customer ghishani = new Customer("Ghishani", 400);
        assertThat(maria.getName()).isEqualTo("Maria", 200);
    }

    @Test
    public void hasWallet(){

    }
}
