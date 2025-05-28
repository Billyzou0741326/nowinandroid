# Theme

Take the NiA app as an example, the theme is defined in the
`core/designsystem/src/main/kotlin/com/google/samples/apps/nowinandroid/core/designsystem/theme/Theme.kt` file.
There are a few files in the same directory that are related to theming, such as:
- `Color.kt`
- `Theme.kt`
- `Type.kt`

Fear not, these files typically don't need to be entirely handcrafted. Instead, you can use the
[Material Theme Builder](https://material-foundation.github.io/material-theme-builder/) to generate
the theme. Select the desired colors and typography, and then export by clicking the button at the
top right of the page. Extract the generated zip file and copy the kotlin files into your designsystem
module.
