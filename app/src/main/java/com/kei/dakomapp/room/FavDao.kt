package com.kei.dakomapp.room

import androidx.room.*
import com.kei.dakomapp.room.entities.FavoriteEntity
import com.kei.dakomapp.room.entities.LecturesEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FavDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLectures(recipesEntity: LecturesEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavoriteLecture(favoritesEntity: FavoriteEntity)

    @Query("SELECT * FROM lectures_table ORDER BY id ASC")
    fun readLecture(): Flow<List<LecturesEntity>>

    @Query("SELECT * FROM lectures_favorite_table ORDER BY id ASC")
    fun readFavoriteLecture(): Flow<List<FavoriteEntity>>

    @Delete
    suspend fun deleteFavoriteRecipe(favoritesEntity: FavoriteEntity)

}