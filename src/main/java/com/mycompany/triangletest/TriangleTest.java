/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.triangletest;

/**
 *
 * @author root
 */
public class TriangleTest {
    Triangle triangle;
    
    public TriangleTest(Triangle triangle){
        this.triangle = triangle;
    }
    
    public void check(){
        if(!this.isTriangle()){
            System.out.println("Khong phai la tam giac");
        }
        else if(this.isEquilateralTriangle()){
            System.out.println("Tam giac deu");
        }
        else if(this.isRightEquilateralTriangle()){
            System.out.println("Tam giac vuong can");
        }
        else if(this.isRightTriangle()){
            System.out.println("Tam giac vuong");
        }
        else if(this.isIsoscelesTriangle()){
            System.out.println("Tam giac can");
        }
        else{
            System.out.println("Tam giac thuong");
        }
    }
    
    public boolean isTriangle(){
        return this.triangle.getEdge_1()+this.triangle.getEdge_2()>this.triangle.getEdge_3()
                &&this.triangle.getEdge_1()+this.triangle.getEdge_3()>this.triangle.getEdge_2()
                &&this.triangle.getEdge_2()+this.triangle.getEdge_3()>this.triangle.getEdge_1();
    }
    
    public boolean isIsoscelesTriangle(){
        return this.triangle.getEdge_1() == this.triangle.getEdge_2()
                ||this.triangle.getEdge_1()==this.triangle.getEdge_3()
                ||this.triangle.getEdge_2() == this.triangle.getEdge_3();
    }
    
    public boolean isEquilateralTriangle(){
        return this.triangle.getEdge_1() == this.triangle.getEdge_2()
                &&this.triangle.getEdge_2() == this.triangle.getEdge_3();
    }
    
    public boolean isRightTriangle(){
        return this.triangle.getEdge_1()*this.triangle.getEdge_1() + this.triangle.getEdge_2()*this.triangle.getEdge_2() == this.triangle.getEdge_3()*this.triangle.getEdge_3()
                ||this.triangle.getEdge_1()*this.triangle.getEdge_1() + this.triangle.getEdge_3()*this.triangle.getEdge_3() == this.triangle.getEdge_2()*this.triangle.getEdge_2()
                ||this.triangle.getEdge_2()*this.triangle.getEdge_2() + this.triangle.getEdge_3()*this.triangle.getEdge_3() == this.triangle.getEdge_1()*this.triangle.getEdge_1();
    }
    
    public boolean isRightEquilateralTriangle(){
        return this.isIsoscelesTriangle()&&this.isRightTriangle();
    }
}
