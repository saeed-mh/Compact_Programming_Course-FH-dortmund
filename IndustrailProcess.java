import java.util.ArrayList;
import java.util.List;

public class IndustrailProcess {
    public static final int NOP = 5;

    private String Id;
    private final ArrayList<IOperation> operations;

    public IndustrailProcess(String Id, List<IOperation> operations){
        this.Id = Id;
        this.operations = new ArrayList<>(operations);
    }

    public void ProcessDuration(){
        int duration = 0;
        for (IOperation iOperation : operations) {
            duration += iOperation.getDuration();
        }
        System.out.println("Process duration : " + duration);
    }

     public double processEnergyConsumption() {
        double total = 0;
        for (IOperation op : operations) {
            if (op.getRecourses() != null) {
                for (AGV agv : op.getRecourses()) {
                    total += agv.getConsumption() * op.getDuration();
                }
            }
        }
        return total;
    }

    public void ProcessResources(){
        for (IOperation operation : operations) {
            System.out.println("==============");
            System.out.println(operation.getData());
            System.out.println("    Total Energy Consumption : " + processEnergyConsumption());
            for (int j = 0; j <= operation.recources.size() - 1; j++) {
                operation.getRecourses().get(j).getDataA();
            }
            System.out.println("==============");
        }
    }

    public String getId(){
        return this.Id;
    }

}