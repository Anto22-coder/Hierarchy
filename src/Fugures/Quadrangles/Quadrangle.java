package Fugures.Quadrangles;

import Fugures.Figures;

public class Quadrangle extends Figures {
    private String className;
    private String name;
    {
        className = "У меня четыре угла";
    }
    public Quadrangle(){}
    public String getName(){return name;}

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString()+ className+"\n" +"Меня зовут "+getName()+"\n";
    }
}
