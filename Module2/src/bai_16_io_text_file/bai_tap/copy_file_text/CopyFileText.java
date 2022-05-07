package bai_16_io_text_file.bai_tap.copy_file_text;

import java.util.List;

public class CopyFileText {
    public static void main(String[] args) {
        ReadAndWriteFIle readAndWriteFIle = new ReadAndWriteFIle();
        List<String> textFile = readAndWriteFIle.readFile("D:\\A0721I1-Le_Chu_Long_Nhat\\Module2\\src\\bai_16_io_text_file\\txt");
        readAndWriteFIle.writeFile("D:\\A0721I1-Le_Chu_Long_Nhat\\Module2\\src\\bai_16_io_text_file\\txt", textFile);
    }
}
