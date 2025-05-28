/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.bare.core.model.repository

import android.util.Log
import androidx.annotation.VisibleForTesting
import com.google.samples.apps.bare.core.datastore.BareAppPreferencesDataSource
import com.google.samples.apps.bare.core.model.data.DarkThemeConfig
import com.google.samples.apps.bare.core.model.data.ThemeBrand
import com.google.samples.apps.bare.core.model.data.UserData
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

internal class OfflineFirstUserDataRepository @Inject constructor(
    private val bareAppPreferencesDataSource: BareAppPreferencesDataSource,
) : UserDataRepository {

    override val userData: Flow<UserData> =
        bareAppPreferencesDataSource.userData

    @VisibleForTesting
    override suspend fun setThemeBrand(themeBrand: ThemeBrand) {
        bareAppPreferencesDataSource.setThemeBrand(themeBrand)
    }

    override suspend fun setDarkThemeConfig(darkThemeConfig: DarkThemeConfig) {
        bareAppPreferencesDataSource.setDarkThemeConfig(darkThemeConfig)
        Log.d("BareApp", "Dark theme config set to: $darkThemeConfig")
    }

    override suspend fun setDynamicColorPreference(useDynamicColor: Boolean) {
        bareAppPreferencesDataSource.setDynamicColorPreference(useDynamicColor)
    }
}