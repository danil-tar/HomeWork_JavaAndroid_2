public class LandLinePhone extends Phone{
    boolean isCallable;
    public LandLinePhone(int number, String modelName, int weight, boolean isCallable) {
        super(number, modelName, weight);
        this.isCallable = isCallable;
    }

    @Override
    public void ring() {
        System.out.println("Call " + LandLinePhone.class);    }

    @Override
    public String toString() {
        return "LandLinePhone{" +
                "number=" + super.getNumber() +
                ", modelName='" + super.getModelName() + '\'' +
                ", weight=" + getModelName() +
                ", isCallable=" + isCallable +
                '}';
    }

    public boolean isCallable() {
        return isCallable;
    }

    public void setCallable(boolean callable) {
        isCallable = callable;
    }
}
