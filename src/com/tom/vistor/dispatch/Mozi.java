package com.tom.vistor.dispatch;

public class Mozi {
    
    public void ride(Horse h){
        System.out.println("ÆïÂí");
    }
    
    public void ride(WhiteHorse wh){
        System.out.println("Æï°×Âí");
    }
    
    public void ride(BlackHorse bh){
        System.out.println("ÆïºÚÂí");
    }
    
    public static void main(String[] args) {
        Horse wh = new WhiteHorse();
        Horse bh = new BlackHorse();
        Mozi mozi = new Mozi();
        mozi.ride(wh);
        mozi.ride(bh);
        
        Horse h = new BlackHorse();
        h.eat();
    }

}
