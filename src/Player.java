package com.sshev4enko.example.krestiki_noliki;


class Player {
	
    private String name;
    
    public Player(String name) {
        this.name = name;
    }
    
    public CharSequence getName() {
        return (CharSequence)name;
    }
}
