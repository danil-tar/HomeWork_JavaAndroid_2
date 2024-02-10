public class MobilePhone extends Phone {

    private int screenSize;
    private boolean isFoldable;

    public MobilePhone(int number, String modelName, int weight, int screenSize, boolean isFoldable) {
        super(number, modelName, weight);
        this.screenSize = screenSize;
        this.isFoldable = isFoldable;
    }

    private void sendMessage(String message, int number) {
        System.out.println("Send message to number:" + number + "'\n'"
                + "{" + message + "}");
    }

    @Override
    public void ring() {
        System.out.println("Call " + MobilePhone.class);
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "number=" + super.getNumber() +
                ", modelName='" + super.getModelName() + '\'' +
                ", weight=" + super.getWeight() +
                ", screenSize=" + screenSize +
                ", isFoldable=" + isFoldable +
                '}';
    }
}
