package ru.mpei.l3.homeWorks;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(){

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double vectorLength(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    public double dotProduct(Vector first, Vector second){
        return (first.x * second.x + first.y * second.y + first.z * second.z);
    }

    public Vector vectorProduct(Vector first, Vector second){
        Vector result = new Vector();
        result.setX(first.y * second.z - first.z * second.y);
        result.setY(first.z * second.x - first.x * second.z);
        result.setZ(first.x * second.y - first.y * second.x);

        return result;
    }

    public double angle(Vector first, Vector second){
        return dotProduct(first, second) / (first.vectorLength() * second.vectorLength());
    }

    public Vector vectorSum(Vector first, Vector second){
        Vector result = new Vector();
        result.setX(first.x + second.x);
        result.setY(first.y + second.y);
        result.setZ(first.z + second.z);

        return result;
    }

    public Vector vectorMinus(Vector first, Vector second){
        Vector result = new Vector();
        result.setX(first.x - second.x);
        result.setY(first.y - second.y);
        result.setZ(first.z - second.z);

        return result;
    }
}
