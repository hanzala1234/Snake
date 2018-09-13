/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.*;
import javax.swing.*;
/**
 *
 * @author ok
 */
public class playingarea {
  //Graphics2D  g2;
private  int x ,y , widht , height;
    playingarea( int x , int y, int width , int height){
  
  
  this.x= x; 
  this .y = y ; 
  this .height = height;
  this . widht= width;
  } 
   
    void setX(int x ){
    this.x = x;
    }
     void setY(int y ){
    this.y = y;
    }
    
    void draw(Graphics2D g2, java.awt.Color er){
    fillrect(g2, x, y , widht , height , er);
    }
private Rectangle2D r ;
    void fillrect(Graphics2D fg, int x , int y , int widht , int height, java.awt.Color er){
fg.setColor(er);
 r  = new Rectangle2D.Double(x,y,widht,height);

 fg.fill(r);
    }
 int getX(){
 return x ;
 }
 int getY(){
 return y ;
 }
 Rectangle2D getRect(){
 return r;
 
 }



}
