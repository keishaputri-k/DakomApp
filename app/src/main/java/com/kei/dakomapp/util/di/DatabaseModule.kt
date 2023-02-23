package com.kei.dakomapp.util.di

import android.content.Context
import androidx.room.Room
import com.kei.dakomapp.room.local.DatabaseLocal
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    const val DATABASE_NAME = "recipes_database"

    @Singleton
    @Provides
    fun providesDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, DatabaseLocal::class.java, DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideDao(database: DatabaseLocal) = database.favDao()

}