/// <reference path="../../TSDef/p5.global-mode.d.ts" />

let url = 'moral';
let canvas;


let button;
let moralArray;
let moral;

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

}


function createNewMoral(){
    moralArray = loadJSON(url, displayNewMoral);
}

function displayNewMoral(){
    print(moralArray);
    moral = moralArray[0];
    print (moral);


}

function windowResized(){
    resizeCanvas(windowWidth,windowHeight);
}

