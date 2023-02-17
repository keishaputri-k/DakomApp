package com.kei.dakomapp.room.entities

import androidx.room.Entity
import androidx.room.*
import com.kei.dakomapp.model.ResponseLectures
import com.kei.dakomapp.util.Constants.Companion.LECTURES_TABLE

@Entity(tableName = LECTURES_TABLE)
class LecturesEntity( var responseLecture: ResponseLectures) {

    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

}