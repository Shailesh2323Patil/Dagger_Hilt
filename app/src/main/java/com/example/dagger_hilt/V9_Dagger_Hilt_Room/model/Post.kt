package com.example.dagger_hilt.V9_Dagger_Hilt_Room.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Post(
    @PrimaryKey(autoGenerate = true)
    var id : Long,
    var name : String,
    var address : String
)