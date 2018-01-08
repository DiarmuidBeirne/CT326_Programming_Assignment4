package Assignment4;

public enum Ball {
    BASEBALL (149, 73),
    BASKETBALL (624, 239),
    FOOTBALL(450, 216),
    GOLF(46,43),
    POOL(156, 60),
    SOFTBALL(180, 97),
    TENNIS(59, 64),
    VOLLEYBALL(260, 218);



    private final int weight;
    private final int diameter;
    Ball(int weight, int diameter){
        this.weight = weight;
        this.diameter = diameter;
    }

    public float getCircumference()
    {
        return (float) Math.PI * diameter;
    }

    public float getVolume()
    {
        return (float) ((Math.PI / 6) * (diameter * diameter * diameter));
    }
    public int getWeight() {
        return weight;
    }

    public int getDiameter() {
        return diameter;
    }
}
