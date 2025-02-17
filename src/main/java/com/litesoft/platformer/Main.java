package com.litesoft.platformer;

import processing.core.PApplet;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("com.litesoft.platformer.Main");
    }

    public void settings() {
        size(600, 600);
    }

    public void setup() {
    }

    public void draw() {
        background(255);
        fill(255, 0, 0);
        ellipse(mouseX, mouseY, 100, 100);
    }
}