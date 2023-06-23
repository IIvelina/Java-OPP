package TrafficLights;

public class Light {
    private TrafficLightSignals color;

    public Light(TrafficLightSignals color) {
        this.color = color;
    }

    public TrafficLightSignals getColor() {
        return color;
    }

    public void setColor(TrafficLightSignals color) {
        this.color = color;
    }

    //change color
    public void changeColor(){
        if (getColor() == TrafficLightSignals.RED){
            setColor(TrafficLightSignals.GREEN);
        }else if (this.color == TrafficLightSignals.GREEN){
            this.color = TrafficLightSignals.YELLOW;
        }else if (this.color == TrafficLightSignals.YELLOW){
            this.color = TrafficLightSignals.RED;
        }
    }
}
