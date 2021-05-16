package co.unicauca.plantsvszombies.model;

/**
 *
 * @author Edynson, Jhonfer
 */
public class ClsZombieCommon implements IZombie{
    

    @Override
    public boolean executeMove(){ return true; }

    @Override
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
