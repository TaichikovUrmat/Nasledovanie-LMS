public class Danser extends Person{
    private String groupName;

    public Danser(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Danser\n" +
                "groupName: " + groupName + super.toString() ;
    }
}
