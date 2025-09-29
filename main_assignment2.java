import java.time.Duration;
import java.util.Arrays;
import java.util.List;


public class main_assignment2 {
        
    public static void main(String[] args) {

        Position p1 = new Position(1, 2);
        Position p2 = new Position(3, 4);
        Position p3 = new Position(7, 6);
        Duration duration1 = Duration.ofHours(2).plusMinutes(30);

        AGV agv1 = new AGV("a",1.0,2.0,duration1,p1,3.4f,4.5f);
        AGV agv2 = new AGV("b",2.0,4.0,duration1,p2,4.5f,10.5f);
        AGV agv3 = new AGV("c",3.0,8.0,duration1,p3,5.6f,20.5f);

        AGV agv4 = new AGV("d",1.0,2.0,duration1,p1,3.4f,4.5f);
        AGV agv5 = new AGV("e",2.0,4.0,duration1,p2,4.5f,10.5f);
       

        // Create Operations for Process 1
        List<AGV> res1 = Arrays.asList(agv1, agv2, agv3);
        List<AGV> res2 = Arrays.asList(agv4, agv5);
     

        Duration Pduration1 = agv1.getChargingTime().plus(agv2.getChargingTime()).plus(agv3.getChargingTime());
        Duration Pduration2 = agv1.getChargingTime().plus(agv2.getChargingTime()).plus(agv3.getChargingTime());

        IOperation op1 = new StorageOperation("OP1", "Store Clothes", Pduration1, res1);
        IOperation op2 = new StorageOperation("OP2", "Store Fruits", Pduration2, res2);

        IndustrailProcess process1 = new IndustrailProcess("process1", Arrays.asList(op1));
        IndustrailProcess process2 = new IndustrailProcess("process2", Arrays.asList(op2));

        simulation(process1);
        simulation(process2);
    }

    private static void simulation(IndustrailProcess process){
        System.out.println("Simulation Result for Process" +  "\n" + "process id :" + process.getId() );
        process.ProcessDuration();
        System.out.println();
        System.out.println("process Resources : ");
        process.ProcessResources();
    }

    
}
