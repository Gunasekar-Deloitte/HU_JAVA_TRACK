package file_handling;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String file="src\\StudentData.csv";
        BufferedReader reader=null;
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File("src\\SelectedStudents.csv"));
            writer.write("name,reg_no_10,reg_no_12,reg_no_B.Tech,rank"+"\n");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line="";
        try {
            reader=new BufferedReader(new FileReader(file));
            ArrayList<Integer> list =new ArrayList<>();
            int c1=0;
            while((line=reader.readLine())!=null){
                String[] row=line.split(",");
                if(c1!=0) {
                    list.add(Integer.valueOf(row[4]));
                }
                c1++;
            }
            reader.close();
            reader=new BufferedReader(new FileReader(file));
            Collections.sort(list);
            int c2=0,cm;
            while((line=reader.readLine())!=null){
                String[] row=line.split(",");
                if((c2!=0)) {
                    if (Integer.valueOf(row[4]).equals(list.get(0)) || Integer.valueOf(row[4]).equals(list.get(1)) || Integer.valueOf(row[4]).equals(list.get(2)) || Integer.valueOf(row[4]).equals(list.get(3)) || Integer.valueOf(row[4]).equals(list.get(4))) {
                        cm=0;
                        for (String index : row) {
                            System.out.printf("%-25s", index);
                            writer.write(index);
                            if(cm<4){
                                writer.write(",");
                            }
                            cm++;
                        }
                        writer.write("\n");
                        System.out.println();
                    }
                }
                c2++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}