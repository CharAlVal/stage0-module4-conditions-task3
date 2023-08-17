package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if(character == 65 || character == 97){
            System.out.println("Vowel");
        }
        if(character == 69 || character == 101){
            System.out.println("Vowel");
        }
        if(character == 73 || character == 105){
            System.out.println("Vowel");
        }
        if(character == 79 || character == 111){
            System.out.println("Vowel");
        }
        if(character == 85 || character == 117){
            System.out.println("Vowel");
        }
        if(character > 65 && character <= 68 || character > 97 && character <= 100){
            System.out.println("Consonant");
        }
        if(character > 69 && character <= 72 || character > 101 && character <= 104){
            System.out.println("Consonant");
        }
        if(character > 73 && character <= 78 || character > 105 && character <= 110){
            System.out.println("Consonant");
        }
        if(character > 79 && character <= 84 || character > 111 && character <= 116){
            System.out.println("Consonant");
        }
        if(character > 85 && character <= 90 || character > 117 && character <= 122){
            System.out.println("Consonant");
        }else{
            System.out.println("wrong alphabet!");
        }
    }
}
