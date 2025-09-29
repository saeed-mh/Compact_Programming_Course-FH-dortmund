import java.time.Duration;
import java.util.List;

public abstract class IOperation {
    protected String id; 
    protected String description;
    protected Duration nominalTime;
    protected List<AGV> recources;

    public IOperation(String id , String description , Duration nominalTime , List<AGV> recources){
        this.id = id;
        this.description = description;
        this.nominalTime = nominalTime;
        this.recources = recources;
    }

    public abstract void setData(String id,String description, Duration nominalTime, List<AGV> resources);
    public abstract String getData();
    public abstract int getDuration();
    
    public abstract List<AGV> getRecourses();

}