/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.plantsvszombies.model;

/**
 *
 * @author jhonf
 */
public class ClsDecoratorZombie implements IZombie{
    private IZombie wrappeZombie;

    public ClsDecoratorZombie(IZombie obj){

    }

    public boolean executeMove(){ return true; }
    public boolean executeAttack(){ return true; }


    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
