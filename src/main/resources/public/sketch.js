/// <reference path="../../TSDef/p5.global-mode.d.ts" />

let url = 'https://alohaajoe.github.io/moralomat/moral';
let canvas;

let button;
let moralArray;
let moral = "Moral";

function preload(){

}

function setup() {
    ellipseMode(CENTER);
    rectMode(CENTER);
    angleMode(DEGREES);
    imageMode(CENTER);
    textAlign(CENTER, BOTTOM);


    canvas = createCanvas(windowWidth,windowHeight);
    canvas.position(0,0);
    colorMode(HSB, 255,255,255,100);

    button = createButton("Neue Moral");
    button.position(width/2 - button.width/2 , height/2);
}

function draw() {
    //drawLittleHelpers();
    background(40,50,255,50);
    button.mousePressed(createNewMoral);
    displayNewMoral();
}

function drawLittleHelpers() {
    line(0,height/2,width,height/2);
    line(width/2,0,width/2, height);
}


function createNewMoral(){
    moralArray = loadJSON(url, gotData);
}

function gotData(){
    print(moralArray);
    moral = moralArray[0];
    print (moral);
}

function displayNewMoral(){
    fill('black');
    textSize(30);
    text(moral,width/2,height/2 - 25);

}

function windowResized(){
    resizeCanvas(windowWidth,windowHeight);
    button.position(width/2 - button.width/2 , height/2);
}

