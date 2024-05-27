
package com.mycompany.game;

import com.mycompany.game.spaceship.MileniumFalcon;
import com.mycompany.game.spaceship.StellarDestroyer;

public class Game {

    public static void main(String[] args) {
        StellarDestroyer sD = new StellarDestroyer(true, true, "los 50 de joselito", true, 4, 20, 100, 200);
        sD.shoot();
        MileniumFalcon mF = new MileniumFalcon(true, 2, true, "tururu",true, 4, 20, 100, 200);
        mF.shoot();
    }
}
