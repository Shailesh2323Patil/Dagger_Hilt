package com.example.dagger_hilt.V1_Introduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger_hilt.R

/*
* Introduction of Dagger Hilt in android in hindi || Android Dependency Injection
*
* What is Dagger Hilt
* Hilt Provides a standard way to incorporate Dagger dependency injection into an
* android Application.
* 1) Dependency
* 2) Dagger
*
* The goals of Hilt Are -
* 1. To Simplify Dagger-related infrastructure for Android Apps.
* 2. To create a standard set of components and scopes to ease setup,
* readability / understanding, and code sharing between apps.
* 3. To just take care of where to inject dependencies and rest all of the code
* generations happens by dagger itself by using annotations and thus
* removing all the boilerplate code.
* */
class V1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v1)

        var mobile : Mobile = Mobile(Processor(), Battery());
    }
}