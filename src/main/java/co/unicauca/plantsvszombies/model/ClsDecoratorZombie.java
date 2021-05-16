package co.unicauca.plantsvszombies.model;

/**
 *
 * @author Edynson, Jhonfer
 */
public class ClsDecoratorZombie implements IZombie{
    private IZombie wrappeZombie;

    public ClsDecoratorZombie(IZombie obj){
        wrappeZombie = obj;
    }
    
    @Override
    public boolean executeMove(){ 
        wrappeZombie.move();
        return true; 
    }

    @Override
    public boolean executeAttack(){ 
        wrappeZombie.attack();
        return true; 
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
