package co.unicauca.plantsvszombies.model;

/**
 *
 * @author Edynson, Jhonfer
 */
public class ClsDecoratorPlant implements IPlant{

    private IPlant wrappePlant;

    public ClsDecoratorPlant(IPlant obj){
        wrappePlant = obj;
    }
    
    @Override
    public boolean executeMove(){ 
        wrappePlant.move();
        return true; 
    }

    @Override
    public boolean executeAttack(){ 
        wrappePlant.attack();
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
