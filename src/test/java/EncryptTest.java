import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {

    @Test
    public void newEncrypt_instantiateCorrectly_true(){
        Encrypt testEncrypt = new Encrypt();
        assertEquals(true, testEncrypt instanceof Encrypt);
    }

    @Test
    public void getKey_getsCipherText_welcome() {
        Encrypt testEncrypt = new Encrypt("welcome",3);
        assertEquals(3, testEncrypt.getKey());
    }

    @Test
    public void getCipherText_getsKey_3() {
        Encrypt testEncrypt = new Encrypt("welcome",3);
        assertEquals(3, testEncrypt.getKey());
    }

    @Test
    public void encryptMaster_keyIsBetween1_25_true() {
        Encrypt testEncrypt = new Encrypt("text", 3);
        assertEquals(3, testEncrypt.getKey());
    }
}





















































