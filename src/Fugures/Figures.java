package Fugures;

public class Figures{
    int sides;
    private String nameFigiure;
    public Figures(){}
    {
        nameFigiure = "фигура";
    }


    @Override
    public String toString() {
        return "Я "+ nameFigiure+ "\n";
    }
}
