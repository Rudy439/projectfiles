package sk.kosickaakademia.matorudolf.files;

public class Main {
    public static void main(String[] args) {
        RWFiles rwFiles = new RWFiles();
        rwFiles.fileContentToUppercase("./resources/texty.txt");
        //rwFiles.copyAndEncryptFileEasy("./resources/texty.txt", 5);
        rwFiles.copyAndDeleteIandY("./resources/texty.txt");
    }
}

