package com.vauth.foxyvpn.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.vauth.foxyvpn.data.FoxyColorTheme

val FoxSeed = Color(0xFF00B0FF)

// Soft Neumorphism Light Palette (Warm-Cool Porcelain with tactile dual shadows)
val NeuLightBg = Color(0xFFE6E9EF)
val NeuLightSurface = Color(0xFFECEFF4)
val NeuLightSurfaceElevated = Color(0xFFDDE2EB)
val NeuLightShadowLight = Color(0xFFFFFFFF)
val NeuLightShadowDark = Color(0xFFC2C9D6)

val md_theme_light_primary = Color(0xFF0284C7)
val md_theme_light_onPrimary = Color(0xFFFFFFFF)
val md_theme_light_primaryContainer = Color(0xFFE0F2FE)
val md_theme_light_onPrimaryContainer = Color(0xFF082F49)
val md_theme_light_inversePrimary = Color(0xFF7DD3FC)

val md_theme_light_secondary = Color(0xFF2563EB)
val md_theme_light_onSecondary = Color(0xFFFFFFFF)
val md_theme_light_secondaryContainer = Color(0xFFDBEAFE)
val md_theme_light_onSecondaryContainer = Color(0xFF0E1D2E)

val md_theme_light_tertiary = Color(0xFF10B981)
val md_theme_light_onTertiary = Color(0xFFFFFFFF)
val md_theme_light_tertiaryContainer = Color(0xFFD1FAE5)
val md_theme_light_onTertiaryContainer = Color(0xFF042F2E)

val md_theme_light_error = Color(0xFFDC2626)
val md_theme_light_onError = Color(0xFFFFFFFF)
val md_theme_light_errorContainer = Color(0xFFFEE2E2)
val md_theme_light_onErrorContainer = Color(0xFF450A0A)

val md_theme_light_background = NeuLightBg
val md_theme_light_onBackground = Color(0xFF181B22)
val md_theme_light_surface = NeuLightSurface
val md_theme_light_onSurface = Color(0xFF181B22)
val md_theme_light_surfaceVariant = Color(0xFFDCE1EA)
val md_theme_light_onSurfaceVariant = Color(0xFF525B6C)
val md_theme_light_surfaceTint = md_theme_light_primary

val md_theme_light_surfaceContainerLowest = Color(0xFFFFFFFF)
val md_theme_light_surfaceContainerLow = Color(0xFFF2F4F8)
val md_theme_light_surfaceContainer = NeuLightSurface
val md_theme_light_surfaceContainerHigh = Color(0xFFE2E6EE)
val md_theme_light_surfaceContainerHighest = Color(0xFFD8DEE8)
val md_theme_light_surfaceBright = Color(0xFFF8FAFC)
val md_theme_light_surfaceDim = Color(0xFFD2D8E4)

val md_theme_light_outline = Color(0xFF94A3B8)
val md_theme_light_outlineVariant = Color(0xFFCBD5E1)
val md_theme_light_inverseSurface = Color(0xFF1D1F24)
val md_theme_light_inverseOnSurface = Color(0xFFF1F5F9)
val md_theme_light_scrim = Color(0xFF000000)

// Soft Neumorphism Dark Palette based on the new Blue & White Fox Identity:
// Deep Charcoal Obsidian (#14171E / #1B1F28) + Electric Cyan (#00E5FF / #00B0FF) + Royal Azure (#2563EB / #2E65F3)
val NeuDarkBg = Color(0xFF14171E)
val NeuDarkSurface = Color(0xFF1B1F28)
val NeuDarkSurfaceElevated = Color(0xFF11141B)
val NeuDarkShadowLight = Color(0xFF242A36)
val NeuDarkShadowDark = Color(0xFF0A0D12)

val md_theme_dark_primary = Color(0xFF00B0FF)
val md_theme_dark_onPrimary = Color(0xFF0A0D14)
val md_theme_dark_primaryContainer = Color(0xFF0C4A6E)
val md_theme_dark_onPrimaryContainer = Color(0xFFE0F2FE)
val md_theme_dark_inversePrimary = Color(0xFF0284C7)

val md_theme_dark_secondary = Color(0xFF2E65F3)
val md_theme_dark_onSecondary = Color(0xFFFFFFFF)
val md_theme_dark_secondaryContainer = Color(0xFF1E3A8A)
val md_theme_dark_onSecondaryContainer = Color(0xFFDBEAFE)

val md_theme_dark_tertiary = Color(0xFF18C964)
val md_theme_dark_onTertiary = Color(0xFF042F2E)
val md_theme_dark_tertiaryContainer = Color(0xFF065F46)
val md_theme_dark_onTertiaryContainer = Color(0xFFD1FAE5)

val md_theme_dark_error = Color(0xFFF43F5E)
val md_theme_dark_onError = Color(0xFFFFFFFF)
val md_theme_dark_errorContainer = Color(0xFF7F1D1D)
val md_theme_dark_onErrorContainer = Color(0xFFFEE2E2)

val md_theme_dark_background = NeuDarkBg
val md_theme_dark_onBackground = Color(0xFFF4F6FA)
val md_theme_dark_surface = NeuDarkSurface
val md_theme_dark_onSurface = Color(0xFFF4F6FA)
val md_theme_dark_surfaceVariant = Color(0xFF242A37)
val md_theme_dark_onSurfaceVariant = Color(0xFF9BA3B2)
val md_theme_dark_surfaceTint = md_theme_dark_primary

val md_theme_dark_surfaceContainerLowest = Color(0xFF0E1116)
val md_theme_dark_surfaceContainerLow = Color(0xFF151921)
val md_theme_dark_surfaceContainer = NeuDarkSurface
val md_theme_dark_surfaceContainerHigh = Color(0xFF222834)
val md_theme_dark_surfaceContainerHighest = Color(0xFF2A313F)
val md_theme_dark_surfaceBright = Color(0xFF343C4D)
val md_theme_dark_surfaceDim = Color(0xFF101318)

val md_theme_dark_outline = Color(0xFF3E485A)
val md_theme_dark_outlineVariant = Color(0xFF28303E)
val md_theme_dark_inverseSurface = Color(0xFFF4F6FA)
val md_theme_dark_inverseOnSurface = Color(0xFF14171E)
val md_theme_dark_scrim = Color(0xFF000000)

data class FoxyStatusColors(
    val connected: Color,
    val connecting: Color,
    val disconnected: Color,
)

val LightStatusColors = FoxyStatusColors(
    connected = Color(0xFF2563EB),
    connecting = Color(0xFF0284C7),
    disconnected = Color(0xFF64748B),
)

val DarkStatusColors = FoxyStatusColors(
    connected = Color(0xFF2E65F3),
    connecting = Color(0xFF00E5FF),
    disconnected = Color(0xFF8E96A6),
)

@Suppress("UNUSED_PARAMETER")
fun statusColorsForTheme(darkTheme: Boolean, colorTheme: FoxyColorTheme): FoxyStatusColors {
    return if (darkTheme) DarkStatusColors else LightStatusColors
}

val LocalFoxyStatusColors = staticCompositionLocalOf { DarkStatusColors }
