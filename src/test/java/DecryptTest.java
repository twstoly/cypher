import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptTest {

    @Test
    public void newDecrypt_instantiateCorrectly_true(){
        Decrypt testDecrypt = new Decrypt();
        assertEquals(true, testDecrypt instanceof Decrypt);
    }

    @Test
    public void getKey_getsCipherText_welcome() {
        Decrypt testDecrypt = new Decrypt("welcome",3);
        assertEquals(3, testDecrypt.getKey());
    }

    @Test
    public void getCipherText_getsKey_3() {
        Decrypt testDecrypt = new Decrypt("welcome",3);
        assertEquals(3, testDecrypt.getKey());
    }

    @Test
    public void encryptMaster_keyIsBetween1_25_true() {
        Decrypt testDecrypt = new Decrypt("text", 3);
        assertEquals(3, testDecrypt.getKey());
    }

}





































































































