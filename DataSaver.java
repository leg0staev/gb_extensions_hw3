import java.io.FileWriter;
import java.io.IOException;

public class DataSaver {
    private Human human;

    public DataSaver(Human human){
        this.human = human;
    }

    public void saveToFile(){
        String filePath = this.human.getSurname() + ".txt";
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(this.human.toString()+"\n");
            System.out.println("файл " + filePath + " сохранен!");
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
