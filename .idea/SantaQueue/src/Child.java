public class Child {
    String name;
    String address;
    String present;
    boolean isNice;

    public Child(String name, String address, String present, boolean isNice) {
        this.name = name;
        this.address = address;
        this.present = present;
        this.isNice = isNice;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPresent() {
        return this.present;
    }

    public boolean getNice() {
        return this.isNice;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
                "Address: " + this.address + "\n" +
                "Present: " + this.present + "\n" +
                "Nice Status: " + this.isNice;
        }
    }
