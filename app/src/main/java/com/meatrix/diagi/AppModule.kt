package com.meatrix.diagi

import android.content.Context
import com.meatrix.diagi.data.local.DiagiDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun providesDiagiDB(
        @ApplicationContext context: Context
    ): DiagiDB = DiagiDB.getInstance(context)
}