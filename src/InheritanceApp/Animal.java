//Cormac Stone

class Animal {
    private String Name;
    private String Color;
    private String Age;

    public Animal(String Name, String Color, String Age) { 
        this.Name;
        this.Color;
        this.Age;
    }public String startEngine() {
        String start = "Starting the engine...";
	return start;
    }
    public String getName() {
        return Name;
    }
    public String getColor() {
        return Color;
    }
    public int getAge() {
        return Age;
    }
    public String animalInfo() {
	String Info = "Animal: " + Name + ", " + Color + ", Years old: " + Age;
	return Info;
    }
}
