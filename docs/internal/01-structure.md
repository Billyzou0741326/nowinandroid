# Structure

Mental model of the project structure:

```
+- Project level 
|  +- App level
|     +- Data
|     +- Network
|     +- State
```

## Project Level

| File/Folder                 | Description                                         |
|-----------------------------|-----------------------------------------------------|
| `app/`                      | The main application.                               |
| `app-nia-catalog/`          | Catalog module for showcasing application features. |
| `gradle/libs.versions.toml` | Version catalog for dependencies.                   |
| `build.gradle.kts`          | Main build file.                                    |
| `settings.gradle.kts`       | Settings file (e.g. includes project paths).        |

## App Level

| Name                                    | Description                                                                                                           |
|-----------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| `build.gradle.kts`                      | Main build file for the application.                                                                                  |
| `src/main/res/AndroidManifest.xml`      | Manifest file for the application.                                                                                    |
| `src/main/kotlin/.../XxxActivity.kt`    | Main activity file - the entrypoint of the application.                                                               |
| `src/main/kotlin/.../XxxApplication.kt` | (Optional) Main application - runs before the main activity. Performs necessary global actions (e.g. initialization). |

## Concepts

| Name                         |
|------------------------------|
| (1) Navigation               |
| (2) ViewModel                |
| (3) Saved UI State           |
| (4) Theme                    |
| (5) Offline First Repository |
| (6) Work                     |
