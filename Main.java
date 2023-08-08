import java.io.IOException;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        read_file parsData = new read_file(); 
        String newFileName = null; 
        write_file writeFile = new write_file(); 

        HashMap<String, Object> data = read_file.parse_data();
        while (data.size() != 6) {
            try {
                throw new date_exception();
            } catch (date_exception e) {
                data = read_file.parse_data();
            }
        }

        newFileName = data.get("lastName") + ".txt"; 
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.write_data(String.valueOf(sb), filePath); 

    }
}
