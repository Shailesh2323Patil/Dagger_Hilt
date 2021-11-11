package com.example.dagger_hilt.V1_Introduction


/*
* Here we follow the Single Source of Truth Principle
* Mobile can do only its work it is not going to create the other classes
* */
class Mobile(var processor: Processor,var battery: Battery) {
}