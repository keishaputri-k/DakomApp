package com.kei.dakomapp.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kei.dakomapp.model.LectureItem
import com.kei.dakomapp.util.Constants.Companion.LECTURES_FAVORITE_TABLE

@Entity(tableName = LECTURES_FAVORITE_TABLE)
class FavoriteEntity (
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: LectureItem
)