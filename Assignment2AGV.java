import java.time.Duration;

public class AGV {
    private String ID;
    private double batteryLoad;
    private double consumption;
    private Duration chargingTime;
    private Position position;
    private float maxSpeed;
    private float actSpeed;

    public AGV(String ID, double batteryLoad, double consumption, 
            Duration chargingTime, Position position, float maxSpeed, float actSpeed){
        this.ID = ID;
        this.batteryLoad = batteryLoad;
        this.consumption = consumption;
        this.chargingTime = chargingTime;
        this.position = position;
        this.maxSpeed = maxSpeed;
        this.actSpeed = actSpeed;
    }

    /* Encapsulation */
    
    //------ setter
    public void setID(String ID) {
        this.ID = ID;
    }


    public void setBatteryLoad(double batteryLoad) {
        if(batteryLoad >= 0)
            this.batteryLoad = batteryLoad;
    }

    public void setConsumption(double consumption) {
        if(consumption >= 0)
            this.consumption = consumption;
    }

    public void setChargingTime(Duration chargingTime) {
        this.chargingTime = chargingTime;
    }

    public void setPosition(Position position) {
        if(position.getX() >= 0 && position.getY() >= 0)
            this.position = position;
    }

    public void setMaxSpeed(float maxSpeed) {
        if(maxSpeed >= 0)
            this.maxSpeed = maxSpeed;
    }

    public void setActSpeed(float actSpeed) {
        if(actSpeed >= 0)
            this.actSpeed = actSpeed;
    }

    //--------- getter
    public String getId() { return ID; }
    public double getBatteryLoad() { return batteryLoad; }
    public double getConsumption() { return consumption; }
    public Duration getChargingTime() { return chargingTime; }
    public Position getPosition() { return position; }
    public float getMaxSpeed() { return maxSpeed; }
    public float getActSpeed() { return actSpeed; }

    private int toStringChargingTime(){
        return (int) this.chargingTime.toHours()*60 + (int) this.chargingTime.toMinutes();
    }



    public void getDataA(){
        System.out.println("** Car id :" + getId() + " **");
        System.out.print("    BatteryLoad :" + getBatteryLoad());
        System.out.print("    Consumption :" + getConsumption());
        System.out.print("    chargingTime :" + toStringChargingTime());
        System.out.print("    Position :" + "(" + getPosition().getX() + "," + getPosition().getY() + ")");
        System.out.print("    MaxSpeed :" + getMaxSpeed());
        System.out.print("    ActSpeed :" + getActSpeed());
        System.out.println();
    }
}
