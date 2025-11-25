package com.example.ddm_projetofinal.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserEntityLocal (
    @PrimaryKey(autoGenerate = false) val id: String,
    val name: String,
    val email: String,
    val password: String
)