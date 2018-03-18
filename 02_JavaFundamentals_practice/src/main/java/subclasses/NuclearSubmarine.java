package main.java.subclasses;

public class NuclearSubmarine {
    private float diameter;
    private float length;

    /**
     * Engine for submarine
     */
    class NuclearSubmarineEngine{
        private float engineCapacity;
        private StateOfEngine state;
        public NuclearSubmarineEngine(){
            state = StateOfEngine.NONE;
        }
        public NuclearSubmarineEngine(float engineCapacity){
            this.engineCapacity = engineCapacity;
            this.state = StateOfEngine.INSTALLED;
        }
        public void startEngine(){
            this.state = StateOfEngine.READY;
        }
        public void go(){
            this.state = StateOfEngine.GO;
        }
    }
    private NuclearSubmarineEngine engine;
    /**
     * Standard Nuclear submarine without engine
     */
    public NuclearSubmarine(){
        this.diameter = 6F;
        this.length = 24F;
        engine = new NuclearSubmarineEngine();
    }
    /**
     * Self made Nuclear submarine with standard engine capacity
     * @param diameter diameter of submarine
     * @param length lenght of submarine
     */
    public NuclearSubmarine(float diameter, float length){
        this.diameter = diameter;
        this.length = length;
        engine = new NuclearSubmarineEngine(60F);
    }

    /**
     * Self made Nuclear submarine
     * @param diameter diameter of submarine
     * @param length lenght of submarine
     * @param capacity capacity of engine
     */
    public NuclearSubmarine(float diameter, float length, float capacity){
        this.diameter = diameter;
        this.length = length;
        engine = new NuclearSubmarineEngine(capacity);
    }
    public void startEngine(){
        if (engine.state == StateOfEngine.NONE){
            engine = new NuclearSubmarineEngine(60F);
        }
        engine.startEngine();
    }
    public void launchSubmarine(){
        if(engine.state.equals(StateOfEngine.INSTALLED)){
            engine.startEngine();
        }
        engine.go();
    }
    @Override
    public String toString() {
        return engine.state.name();
    }
    public void setEngine(NuclearSubmarineEngine engine) {
        this.engine = engine;
    }
}
