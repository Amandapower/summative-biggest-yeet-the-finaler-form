/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules.components;

import modules.entities.Character;
import modules.entities.Entity;

/**
 *
 * @author camet2651
 */
public class Gravity extends Component {

    int ySpeed;
    int gravity;

    public Gravity() {
        super("gravity");
    }

    @Override
    public void initialize(Entity entity) {
        this.ySpeed = 0;
        this.gravity = 2;
    }

    @Override
    public void update(Entity entity) {
        if (entity instanceof Character) {
            Character c = (Character) entity;
            if (!c.isJumping() && !c.isOnGround()) {
                this.ySpeed += this.gravity;
                entity.setY(entity.getY() - this.ySpeed);
            }
        }
    }
}
