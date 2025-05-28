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

package com.google.samples.apps.bare.feature.history

import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import com.google.samples.apps.bare.R
import com.google.samples.apps.bare.designsystem.component.BareLoadingWheel

@Composable
internal fun HistoryRoute(
    modifier: Modifier = Modifier,
) {
    HistoryScreen(
        modifier = modifier,
    )
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Composable
internal fun HistoryScreen(
    modifier: Modifier = Modifier,
) {
    LoadingState(modifier)
}

@Composable
private fun LoadingState(modifier: Modifier = Modifier) {
    BareLoadingWheel(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentSize()
            .testTag("history:loading"),
        contentDesc = stringResource(id = R.string.feature_history_loading),
    )
}
