package com.kei.dakomapp.room.entities

import androidx.room.Entity
import androidx.room.*
import com.kei.dakomapp.model.ResponseLectures


class LecturesEntity( var responseLecture: ResponseLectures) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

}