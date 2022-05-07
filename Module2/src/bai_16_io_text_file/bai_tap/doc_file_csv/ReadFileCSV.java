package bai_16_io_text_file.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileCSV {
    public void splitString(String filePath) {
        final String delimiter = ",";
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] tempArray;
            while ((line = bufferedReader.readLine()) != null) {
                tempArray = line.split(delimiter);
                for(String tempStr : tempArray) {
                    System.out.println(tempStr + " ");
                }
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        ReadFileCSV readFileCSV = new ReadFileCSV();
        readFileCSV.splitString("D:\\A0721I1-Le_Chu_Long_Nhat\\Module2\\src\\bai_16_io_text_file\\txt");
    }
}
