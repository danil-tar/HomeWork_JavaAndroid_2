public class Phone implements RingAble {
    private int number;
    private String modelName;
    private int weight;

    public Phone(int number, String modelName, int weight) {
        this.number = number;
        this.modelName = modelName;
        this.weight = weight;
    }

    private void recieveCall(String name) {
        System.out.println("Call " + name + "!");
    }

    void aboutPhone(RingAble phone) {
        phone.ring();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", modelName='" + modelName + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void ring() {
        System.out.println("Phone is ringing");

    }
}
