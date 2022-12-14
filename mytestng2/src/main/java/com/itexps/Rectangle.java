/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps;

/**
 *
 * @author Arwa
 */
public class Rectangle {
    private int lenght;
    private int width;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle() {
    }

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "lenght=" + lenght + ", width=" + width + '}';
    }
    
    public int getPerimeter(){
        return 2 * (this.lenght + this.width);
    }
    
    public int getArea(){
        return this.lenght * this.width;
    }
   
    }

