package Hw_03_OOP.dto;

public class EShop_Branch extends EShop {

    private String name = "No name";
    private String address = "No address";

    public EShop_Branch(String limb, String model, String serialNumber, double price, boolean isMaintain, String name, String address) {
        super(limb, model, serialNumber, price, isMaintain);

        setName(name);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name != null && !name.isEmpty())
            this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        if (address != null && !address.isEmpty())
            this.address = address;
    }

    public void ordersFormation() {

        System.out.println("Ordering");
    }

    public void logistics() {

        System.out.println("Transfering");
    }

    public void accountability() {

        System.out.println("Reporting");
    }

    @Override
    protected void exchange() {

        super.exchange();
    }

    // Parent's private method isn't available
//    private void returnBack() {
//
//        super.returnBack;
//    }
}
