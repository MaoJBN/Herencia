
package com.mycompany.game.spaceship;

public class MileniumFalcon extends NuclearShip{
    private boolean hyperspeed;
    private int cannons;
    private boolean shield;

    public MileniumFalcon(boolean hyperspeed, int cannons, boolean shield, String name, boolean armed, int crew, int damage, int health, int speed) {
        super(name, armed, crew, damage, health, speed);
        this.hyperspeed = hyperspeed;
        this.cannons = cannons;
        this.shield = shield;
    }
    
    @Override
    public void shoot(){
        System.out.println("disparo a cañonazos");
    }
    public void toogleShield(){
    this.shield = !this.shield;
    }
}
