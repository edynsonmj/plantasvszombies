package co.unicauca.plantsvszombies.model;

/**
 *
 * @author jhonf
 */
public class ClsHongo implements IPlant{

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
