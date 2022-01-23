# Encryption using Ceaser Cipher - ( cypher ) 
##### twstoly
## Description
The encryption step performed by a Caesar cipher is often incorporated as part of more complex schemes, such as the Vigenère cipher, and still has modern application in the ROT13 system. As with all single-alphabet substitution ciphers, the Caesar cipher is easily broken and in modern practice offers essentially no communications security. 

In cryptography, a Caesar cipher, also known as Caesar's cipher, the shift cipher, Caesar's code or Caesar shift, is one of the simplest and most widely known encryption techniques. It is a type of substitution cipher in which each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet. For example, with a left shift of 3, B would be replaced by Y, E would become B, and so on. The method is named after Julius Caesar, who used it in his private correspondence.

The transformation can be represented by aligning two alphabets; the cipher alphabet is the plain alphabet rotated left or right by some number of positions reffered in this project as the characters you want to shift your encryption criteria to. For instance, here is a Caesar cipher using a left rotation of three places at encryption, equivalent to a right shift of 23 at encryption(the shift parameter is used as the key). During decryption, the left shift of 3 places is undone by a left shift of 23 to decrypt the encrypted string.

## Technologies used
* Java
* Gradle

### Setup
+ Install Java, Gradle and JDK.
+ Clone the repository into a desired folder by running the following link in your terminal: `https://github.com/twstoly/cypher.git`

### Running the project with an IDE
+ Open the project using the IDE you have installed
+ Build and Run the project having installed java JDK and gradle.

###### Running the project without an IDE
+ Navigate to the folder containing the project
+ Build the gradle by running: `gradle build`.
+ Compile the code by running: `gradle compileJava`
+ Navigate to the App class file located at build/classes/java/main and run: `java App`.

### Known Bugs
+ None

## License
MIT License [found here](LICENSE) 2022 @twstoly.