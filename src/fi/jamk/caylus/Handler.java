/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.caylus; 

import java.awt.Graphics;
import java.util.LinkedList;

/** 
 * Updates and renders all game objects in the LinkedList
 * 
 * @author Mythe 
 */ 

public class Handler {
    
    LinkedList<GameObject> object = new LinkedList<GameObject>();
    
    public void tick(){
        for(int i = 0; i < object.size(); i++){
            GameObject tempObject = object.get(i);
            
            tempObject.tick();
        }
    }

    public void render(Graphics g){
        for(int i = 0; i < object.size(); i++){
        GameObject tempObject = object.get(i);
            
            tempObject.render(g);
    }
    }
  
  public void addObject(GameObject object){
      this.object.add(object);
  }
  
  public void removeObject(GameObject object) {
      this.object.remove(object);
  }
  
  
}
