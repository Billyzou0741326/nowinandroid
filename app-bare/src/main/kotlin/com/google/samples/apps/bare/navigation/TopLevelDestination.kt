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

package com.google.samples.apps.bare.navigation

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector
import com.google.samples.apps.bare.R
import com.google.samples.apps.bare.designsystem.icon.BareAppIcons
import com.google.samples.apps.bare.feature.history.navigation.HistoryRoute
import com.google.samples.apps.bare.feature.home.navigation.HomeBaseRoute
import com.google.samples.apps.bare.feature.home.navigation.HomeRoute
import kotlin.reflect.KClass

enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    @StringRes val iconTextId: Int,
    @StringRes val titleTextId: Int,
    val route: KClass<*>,
    val baseRoute: KClass<*> = route,
) {
    HOME(
        selectedIcon = BareAppIcons.Home,
        unselectedIcon = BareAppIcons.HomeBorder,
        iconTextId = R.string.feature_home_title,
        titleTextId = R.string.feature_home_title,
        route = HomeRoute::class,
        baseRoute = HomeBaseRoute::class,
    ),
    HISTORY(
        selectedIcon = BareAppIcons.History,
        unselectedIcon = BareAppIcons.HistoryBorder,
        iconTextId = R.string.feature_history_title,
        titleTextId = R.string.feature_history_title,
        route = HistoryRoute::class,
    ),
}
