package ru.otus.java.basic.lesson10;

public class Box {
    private int length;
    private int width;
    private int height;
    private String colour;
    private boolean isOpen;
    private String someObject;

    public int getLength() {
        return length;
    }

//    public void setLength(int length) {
//        this.length = length;
//    }

    public int getWidth() {
        return width;
    }

//    public void setWidth(int width) {
//        this.width = width;
//    }

    public int getHeight() {
        return height;
    }

//    public void setHeight(int height) {
//        this.height = height;
//    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
        System.out.println("The box has been repainted " + colour);
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
        System.out.println("The box has been opened: " + isOpen);
    }


//    public Box(int length, int width, int height, String colour, boolean isOpen) {
//        this.length = length;
//        this.width = width;
//        this.height = height;
//        this.colour = colour;
//        this.isOpen = isOpen;
//    }


    public Box(int length, int width, int height, String colour) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public void info() {
        System.out.println(length + " " + width + " " + height + " " + colour + " " + isOpen);
    }

    public void putIn() {
        if (isOpen && someObject == null) {
            someObject = "";
            System.out.println("You've put an object in the box");
            return;
        }
        System.out.println("The box is closed or full");
    }

    public void getOut() {
        if (isOpen && someObject != null) {
            someObject = null;
            System.out.println("You've got an object out of the box");
            return;
        }
        System.out.println("The box is closed or empty");
    }
}
