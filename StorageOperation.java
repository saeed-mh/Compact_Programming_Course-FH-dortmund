import java.time.Duration;
import java.util.List;

public class StorageOperation extends IOperation{


    
    public StorageOperation(String id, String description, Duration nominalTime, List<AGV> recources) {
        super(id, description, nominalTime, recources);
        
    }

    @Override
    public void setData(String id, String description, Duration nominalTime, List<AGV> resources) {
        this.id = id;
        this.description = description;
        this.nominalTime = nominalTime;
        this.recources = resources;
    }


    @Override
    public String getData() {
        return "\n" + "*Storing Operation* \n" +
         "    Operation Id : " + this.id + "\n" + 
         "    Description :" + this.description  + "\n" +
         "    Total Duration of all Resources : "+ this.nominalTime.toMinutes() + " Minute" + "\n" +
         "    Number of AGV : " + this.recources.size();
    }

    @Override
    public int getDuration() {
       return (int)nominalTime.toHours() * 60  + (int) nominalTime.toMinutes();
    }

    @Override
    public List<AGV> getRecourses() {
        return this.recources;
    }
    
}
