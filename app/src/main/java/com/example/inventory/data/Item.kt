package com.example.inventory.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item")
data class Item(
    // for specifying use id as primary key
    @PrimaryKey(autoGenerate = true) //generating an id for every new entity
    val id: Int = 0,
    @ColumnInfo(name="name") // for giving a different column name then the variable name
    val itemName: String,
    @ColumnInfo(name = "price")
    val itemPrice: Double,
    @ColumnInfo(name = "quantity")
    val quantityInStock: Int
)