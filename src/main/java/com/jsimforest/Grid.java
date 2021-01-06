package com.jsimforest;

import java.util.ArrayList;

public class Grid {
    public Grid(int width, int height) {
        setWidth(width);
        setHeight(height);
        ArrayList<ArrayList<Cell>> matrix = new ArrayList<ArrayList<Cell>>();
        for(int i=0;i<height;i++){
            matrix.add(new ArrayList<Cell>());
            ArrayList<Cell> line = matrix.get(i);
            for(int j=0;j<width;j++){
                line.add(new Cell());
            }
        }
        setMatrix(matrix);
    }

    private int width;
    private int height;
    private ArrayList<ArrayList<Cell>> matrix;


    public ArrayList<ArrayList<Cell>> getMatrix() {
        return matrix;
    }

    public void setMatrix(ArrayList<ArrayList<Cell>> matrix) {
        this.matrix = matrix;
    }

    public int getWidth() {
        return width;
    }

    /**
     *
     * @param width number of columns of the simulation
     * @throws IllegalArgumentException when width value is negative
     */
    public void setWidth(int width) {
        if(width > 0){
            this.width = width;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public int getHeight() {
        return height;
    }

    /**
     *
     * @param height number of lines of the simulation
     * @throws IllegalArgumentException when height value is negative
     */
    public void setHeight(int height) {
        if(height > 0){
            this.height = height;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
