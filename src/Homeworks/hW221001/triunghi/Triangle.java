package Homeworks.hW221001.triunghi;

public class Triangle {
    public String name;
    public float length;
    public float width;
    public float height;

    public Triangle(String name, float length, float width, float height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void printOutPerimeterAndAreaSides() {
        System.out.println(this.name + " perimeter:" + this.calculateTrianglePerimeter());
        System.out.println(this.name + " areaNotArea:" + this.calculateTriangleAreaSides());
    }

    private float calculateTrianglePerimeter() {
        return this.length + this.width + this.height;
    }

    private float calculateTriangleAreaSides() {
        return this.length * this.width * this.height;
    }


}
