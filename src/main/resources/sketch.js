/// <reference path="../../TSDef/p5.global-mode.d.ts" />

let url = 'http://localhost:8080/moral';
let canvas;


let button;


function preload(){

}

function setup() {
    ellipseMode(CENTER);
    rectMode(CENTER);
    angleMode(DEGREES);
    imageMode(CENTER);

    canvas = createCanvas(windowWidth,windowHeight);
    canvas.position(0,0);
    colorMode(RGB);

    button = createButton("Neue Moral");
    button.position(width/2 , height/2);
}

function draw() {
    background(100,0,255);
    button.mousePressed(createNewMoral);
    fill(255);
    ellipse(50,50,20,20);
}


function createNewMoral(){
    loadJSON(url, displayNewMoral);
}

function displayNewMoral(data){
    print(data);

}

function windowResized(){
    resizeCanvas(windowWidth,windowHeight);
}

