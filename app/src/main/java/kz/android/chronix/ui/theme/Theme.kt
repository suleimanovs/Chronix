package kz.android.chronix.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = ChronixDarkColors.primary,
    secondary = ChronixDarkColors.secondary,
    tertiary = ChronixDarkColors.tertiary,
    background = ChronixDarkColors.background,
    surface = ChronixDarkColors.surface,
    onPrimary = ChronixDarkColors.onPrimary,
    onSecondary = ChronixDarkColors.onSecondary,
    onTertiary = ChronixDarkColors.onTertiary,
    onBackground = ChronixDarkColors.onBackground,
    onSurface = ChronixDarkColors.onSurface,
    error = ChronixDarkColors.error,
    onError = ChronixDarkColors.onError,
    errorContainer = ChronixDarkColors.errorContainer,
    onErrorContainer = ChronixDarkColors.onErrorContainer,
    outline = ChronixDarkColors.outline,
    outlineVariant = ChronixDarkColors.outlineVariant,
    scrim = ChronixDarkColors.scrim,
    surfaceTint = ChronixDarkColors.surfaceTint,
    surfaceVariant = ChronixDarkColors.surfaceVariant,
    inverseSurface = ChronixDarkColors.inverseSurface,
    inverseOnSurface = ChronixDarkColors.inverseOnSurface,
    inversePrimary = ChronixDarkColors.inversePrimary,
    onSecondaryContainer = ChronixDarkColors.onSecondaryContainer,
    onTertiaryContainer = ChronixDarkColors.onTertiaryContainer,
    onSurfaceVariant = ChronixDarkColors.onSurfaceVariant,
    primaryContainer = ChronixDarkColors.primaryContainer,
    surfaceContainer = ChronixDarkColors.surfaceContainer,
    surfaceBright = ChronixDarkColors.surfaceBright,
    secondaryContainer = ChronixDarkColors.secondaryContainer,
    tertiaryContainer = ChronixDarkColors.tertiaryContainer,
    onPrimaryContainer = ChronixDarkColors.onPrimaryContainer,
)

private val LightColorScheme = lightColorScheme(
    primary = ChronixLightColors.primary,
    secondary = ChronixLightColors.secondary,
    tertiary = ChronixLightColors.tertiary,
    background = ChronixLightColors.background,
    surface = ChronixLightColors.surface,
    onPrimary = ChronixLightColors.onPrimary,
    onSecondary = ChronixLightColors.onSecondary,
    onTertiary = ChronixLightColors.onTertiary,
    onBackground = ChronixLightColors.onBackground,
    onSurface = ChronixLightColors.onSurface,
    error = ChronixLightColors.error,
    onError = ChronixLightColors.onError,
    errorContainer = ChronixLightColors.errorContainer,
    onErrorContainer = ChronixLightColors.onErrorContainer,
    outline = ChronixLightColors.outline,
    outlineVariant = ChronixLightColors.outlineVariant,
    scrim = ChronixLightColors.scrim,
    surfaceTint = ChronixLightColors.surfaceTint,
    surfaceVariant = ChronixLightColors.surfaceVariant,
    inverseSurface = ChronixLightColors.inverseSurface,
    inverseOnSurface = ChronixLightColors.inverseOnSurface,
    inversePrimary = ChronixLightColors.inversePrimary,
    onSecondaryContainer = ChronixLightColors.onSecondaryContainer,
    onTertiaryContainer = ChronixLightColors.onTertiaryContainer,
    onSurfaceVariant = ChronixLightColors.onSurfaceVariant,
    primaryContainer = ChronixLightColors.primaryContainer,
    surfaceContainer = ChronixLightColors.surfaceContainer,
    surfaceBright = ChronixLightColors.surfaceBright,
    secondaryContainer = ChronixLightColors.secondaryContainer,
    tertiaryContainer = ChronixLightColors.tertiaryContainer,
    onPrimaryContainer = ChronixLightColors.onPrimaryContainer,
)

@Composable
fun ChronixTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(colorScheme = colorScheme, typography = Typography, content = content)
}

internal val CurrentTheme = staticCompositionLocalOf { Theme.LIGHT }

enum class Theme {
    LIGHT, DARK
}