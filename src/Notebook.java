import java.util.Objects;

public class Notebook {
    private String firm;
    private int ram;
    private int hardDiscSize;
    private String oS;
    private String color;
    private double weight;

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHardDiscSize() {
        return hardDiscSize;
    }

    public void setHardDiscSize(int hardDiscSize) {
        this.hardDiscSize = hardDiscSize;
    }

    public String getoS() {
        return oS;
    }

    public void setoS(String oS) {
        this.oS = oS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Notebook(String firm, int ram, int hardDiscSize, String oS, String color, double weight) {
        this.firm = firm;
        this.ram = ram;
        this.hardDiscSize = hardDiscSize;
        this.oS = oS;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "Фирма = '" + firm + '\'' +
                ", ОЗУ(гб) = "  + ram +
                ", Объём жд(гб) = " + hardDiscSize +
                ", Операционная система = '" + oS + '\'' +
                ", Цвет = '" + color + '\'' +
                ", Вес(кг) = " + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return ram == notebook.ram
                && hardDiscSize == notebook.hardDiscSize
                && Double.compare(weight, notebook.weight) == 0
                && Objects.equals(firm, notebook.firm)
                && Objects.equals(oS, notebook.oS)
                && Objects.equals(color, notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firm, ram, hardDiscSize, oS, color, weight);
    }
}
