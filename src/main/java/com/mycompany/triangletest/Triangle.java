/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.triangletest;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Triangle {

    private int edge_1;
    private int edge_2;
    private int edge_3;
    
    public Triangle(){
        this.edge_1 = this.edge_2 = this.edge_3 = 0;
    }

    public Triangle(int edge_1, int edge_2, int edge_3) {
        this.edge_1 = edge_1;
        this.edge_2 = edge_2;
        this.edge_3 = edge_3;
    }

    
    
    public void inputHelper(){
        
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.print("Nhap canh 1: ");
            if(s.hasNextInt()){
                this.edge_1 = s.nextInt();
                break;
            }
        }
        
        while(true){
            System.out.print("Nhap canh 2: ");
            if(s.hasNextInt()){
                this.edge_2 = s.nextInt();
                break;
            }
        }   
        
        while(true){
            System.out.print("Nhap canh 3: ");
            if(s.hasNextInt()){
                this.edge_3 = s.nextInt();
                break;
            }
        }   
    }

    public int getEdge_1() {
        return edge_1;
    }

    public int getEdge_2() {
        return edge_2;
    }

    public int getEdge_3() {
        return edge_3;
    }
    
    
}
