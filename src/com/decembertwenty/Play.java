package com.decembertwenty;

interface Playable {
    void play();
}
class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }
}
class Piano implements Playable{

    @Override
    public void play() {
        System.out.println("Playing Piano");
    }
}

class Playing{
    public static void main (String[] args){
    Guitar guitar1 = new Guitar();
    Piano piano1 = new Piano();

    guitar1.play();
    piano1.play();
    }
}