
package com.mycompany.game.spaceship;

public class StellarDestroyer extends NuclearShip{
    private boolean hyperspeed;
    private boolean shield;

    public StellarDestroyer(boolean hyperspeed, boolean shield, String name, boolean armed, int crew, int damage, int health, int speed) {
        super(name, armed, crew, damage, health, speed);
        this.hyperspeed = hyperspeed;
        this.shield = shield;
    }
    
    
    
        @Override
    public void shoot(){
        super.shoot();
        System.out.println("Hiper mega super grandioso rasho laser");
    }
}
