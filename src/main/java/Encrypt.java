public class Encrypt {
    private String textInput;
    private int key;
    private String outputLowercase;
    private String cipherText = "";
    private final String uppercaseAlphabets = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    private final String lowercaseAlphabets = "zyxwvutsrqponmlkjihgfedcba";

    public Encrypt() {

    }

    public String encryptionMaster(String textInput, int key){
        for (int i = 0; i < textInput.length(); i++){

//             Checking  that the key value is within the range before starting encrypting;
            if (key >= 1 && key <= 25){

//                Getting the characters value from the position
                char characterValue = textInput.charAt(i);

//                Getting the right value for the encryption key if lowercase then lowercase is used.
                int lowercaseCharacterIndex = lowercaseAlphabets.indexOf(textInput.charAt(i));
                int uppercaseCharacterIndex = uppercaseAlphabets.indexOf(textInput.charAt(i));

//                Check if the character is a letter or any other value
                if (Character.isLetter(characterValue)){

//                    checking if the character value is a lowercase letter or uppercase letter
                    if (Character.isLowerCase(characterValue)){
//                      Using the index position of the character
                        int newCharacterIndex = (lowercaseCharacterIndex + key) % 26;

//                        Equating the value of the index and matching it with the character in the lowercaseAlphabet
                        char characterPositionOfNewIndex = lowercaseAlphabets.charAt(newCharacterIndex);

                        cipherText += characterPositionOfNewIndex;

                    }else if (Character.isUpperCase(characterValue)){

                        int newCharacterIndex = (uppercaseCharacterIndex + key) % 26;
                        char characterPositionOfNewIndex = uppercaseAlphabets.charAt(newCharacterIndex);

//                        Assigning the encrypted of the alphabet to the cipher text
                        cipherText += characterPositionOfNewIndex;
                    }
                }else {

//                    If the inputValue is not a letter we jst want to add it in the application
                    cipherText += characterValue;
                }

            }else{
                System.out.println("Key values range from 1 to 25");
            }
        }
        return cipherText;
    }

    public String getTextInput() {
        return textInput;
    }

    public void setTextInput(String textInput) {
        this.textInput = textInput;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getOutputLowercase() {
        return outputLowercase;
    }


    public String getCipherText() {
        return cipherText;
    }


    public String getUppercaseAlphabets() {
        return uppercaseAlphabets;
    }


    public String getLowercaseAlphabets() {
        return lowercaseAlphabets;
    }

}
















































































































