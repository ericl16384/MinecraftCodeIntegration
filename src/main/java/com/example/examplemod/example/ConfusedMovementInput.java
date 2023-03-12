//package com.example.examplemod;
//
//public class ConfusedMovementInput extends MovementInput {
//
//    public ConfusedMovementInput(MovementInput interceptedMovementInput) {
//        underlyingMovementInput = interceptedMovementInput;
//        System.out.println("construct movementinput");
//    }
//
//    @Override
//    public void updatePlayerMoveState() {
//        underlyingMovementInput.updatePlayerMoveState();
//        EntityPlayer p = Minecraft.getMinecraft().thePlayer;
//        this.jump = underlyingMovementInput.jump &&
//                !p.isPotionActive(37) &&
//                !p.isPotionActive(39) &&
//                !p.isPotionActive(41);
//        this.sneak = underlyingMovementInput.sneak;
//        if (p.isPotionActive(37) || p.isPotionActive(39) || p.isPotionActive(41)) {
//            this.moveForward = 0;
//            this.moveStrafe = 0;
//        }
//        if (p.isPotionActive(49)) {
//            this.moveStrafe = -underlyingMovementInput.moveStrafe;
//            this.moveForward = -underlyingMovementInput.moveForward;
//        } else {
//            this.moveStrafe = underlyingMovementInput.moveStrafe;
//            this.moveForward = underlyingMovementInput.moveForward;
//        }
//
//    }
//
//    public void setConfusion(boolean newConfused) {
//        confused = newConfused;
//    }
//
//    protected MovementInput underlyingMovementInput;
//    private boolean confused = false;
//
//}