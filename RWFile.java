package sk.kosickaakademia.matorudolf.files;


import java.io.*;
import java.time.LocalDateTime;
import java.util.Calendar;

    public class RWFiles {
        public void fileContentToUppercase(String fileName){
            BufferedReader reader;
            FileReader fileReader = null;
            try {
                if (!(new File (fileName).exists())){
                    System.out.println("File "+fileName+" doesnt't exist.");
                    return;
                }
                fileReader = new FileReader(fileName);
                File file = new File("out/output/"+getFileName());
                File file = new File("out/output/"+getFileName('B'));
                file.createNewFile();
                FileWriter fileWriter = new FileWriter(file);

                @@ -28,35 +31,93 @@ public void fileContentToUppercase(String fileName){
                    e.printStackTrace();
                }
            }
        }
    public void toExam(String fileName){
    public void copyAndEncryptFileEasy(String fileName, int offset){
        BufferedReader reader;
        FileReader fr = null;
        String line;
        char ch;
        try {
            fr = new FileReader(fileName);
            reader = new BufferedReader(fr);
            int r;
            while((r=reader.read()) != -1){
                if (r >)
                char ch = (char) ((char) r+1);
                System.out.print(ch);
            if(!(new File(fileName).exists())){
                System.out.println("File not found");
                return;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            FileReader fileReader = new FileReader(fileName);
            File EncryptedFile = new File("out/output/"+getFileName('C'));
            EncryptedFile.createNewFile();
            FileWriter fileWriter = new FileWriter(EncryptedFile);
            reader = new BufferedReader(fileReader);
            while((line = reader.readLine()) != null){
                char[] originalLine = new char[line.length()];
                for (int i = 0; i < line.length(); i++){
                    ch = line.charAt(i);
                    if (ch >= 'A' && ch <= (int) 'Z' - offset){
                        ch = (char) (ch+offset);
                        if (ch > 'Z'){
                            ch = (char) (ch - 26);
                        }
                    }

                    else if (ch >= 'a' && ch <= 'z'){
                            ch = (char) (ch+offset);
                            if (ch > 'z'){
                                ch = (char) (ch-26);
                            }
                        }
                        else if (ch >= '0' && ch <= '9'){
                            ch = (char) (ch +offset);
                            if (ch > 9){
                                ch = (char) (ch-26);
                            }
                        }
                        fileWriter.write(ch);
                    }
                    fileWriter.write("\n");
                }
            fileReader.close();
            fileWriter.close();

    }
        }catch (IOException ex){
            ex.printStackTrace();
    }
        private String getFileName(){

            public void copyAndDeleteIandY(String fileName){
            BufferedReader reader;
            String line;
            char ch;
            try {
                if(!(new File(fileName).exists())){
                    System.out.println("File not found");
                    return;
                }
                FileReader fileReader = new FileReader(fileName);
                File EncryptedFile = new File("out/output/"+getFileName('E'));
                EncryptedFile.createNewFile();
                FileWriter fileWriter = new FileWriter(EncryptedFile);
                reader = new BufferedReader(fileReader);
                while((line = reader.readLine()) != null){
                    char[] originalLine = new char[line.length()];
                    for (int i = 0; i < line.length(); i++){
                        ch = line.charAt(i);
                        if (ch == 'Y' || ch == 'I' || ch == 'i' || ch == 'y'){
                            ch = '_';
                        }
                        fileWriter.write(ch);
                    }
                    fileWriter.write("\n");
                }
                fileReader.close();
                fileWriter.close();

            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
        private String getFileName(char prefix){
            String name = null;
            int hour = LocalDateTime.now().getHour();
            int minute = LocalDateTime.now().getMinute();
            int second = LocalDateTime.now().getSecond();
            name = "B_"+hour+minute+second;
            name = prefix+"_"+hour+minute+second;
            return name;
        }
    }
}
