package kz.android.theme

import androidx.compose.ui.graphics.Color


/**
 * [ChronixColorScheme] - описывает использование цветов в приложении.
 *
 * @property primary Основной цвет, используемый для основных элементов интерфейса.
 * @property onPrimary Цвет текста и иконок, используемый на фоне основного цвета.
 * @property primaryContainer Цвет контейнера для основного цвета, используемый для элементов, содержащих основной цвет.
 * @property onPrimaryContainer Цвет текста и иконок, используемый на фоне контейнера основного цвета.
 * @property inversePrimary Инверсированный основной цвет, используемый для выделения элементов на фоне, противоположном основному цвету.
 * @property secondary Вторичный цвет, используемый для менее важных элементов интерфейса.
 * @property onSecondary Цвет текста и иконок, используемый на фоне вторичного цвета.
 * @property secondaryContainer Цвет контейнера для вторичного цвета, используемый для элементов, содержащих вторичный цвет.
 * @property onSecondaryContainer Цвет текста и иконок, используемый на фоне контейнера вторичного цвета.
 * @property tertiary Третичный цвет, используемый для дополнительных акцентов.
 * @property onTertiary Цвет текста и иконок, используемый на фоне третичного цвета.
 * @property tertiaryContainer Цвет контейнера для третичного цвета, используемый для элементов, содержащих третичный цвет.
 * @property onTertiaryContainer Цвет текста и иконок, используемый на фоне контейнера третичного цвета.
 * @property background Цвет фона приложения.
 * @property onBackground Цвет текста и иконок, используемый на фоне основного фона.
 * @property surface Цвет поверхности, используемый для карточек, панелей и других контейнеров.
 * @property onSurface Цвет текста и иконок, используемый на фоне поверхности.
 * @property surfaceVariant Вариант цвета поверхности для более детализированных элементов интерфейса.
 * @property onSurfaceVariant Цвет текста и иконок, используемый на фоне варианта поверхности.
 * @property surfaceTint Оттенок поверхности, который акцентирует основной цвет.
 * @property inverseSurface Инверсированный цвет поверхности, используемый для выделения элементов на контрастном фоне.
 * @property inverseOnSurface Цвет текста и иконок, используемый на фоне инверсированной поверхности.
 * @property error Цвет ошибки, используемый для сообщений об ошибках и значков предупреждения.
 * @property onError Цвет текста и иконок, используемый на фоне цвета ошибки.
 * @property errorContainer Цвет контейнера для ошибки, используемый для элементов, содержащих сообщения об ошибках.
 * @property onErrorContainer Цвет текста и иконок, используемый на фоне контейнера для ошибки.
 * @property outline Цвет обводки, используемый для выделения границ элементов.
 * @property outlineVariant Вариант цвета обводки для менее акцентированных границ.
 * @property scrim Цвет затемнения, используемый для затемнения фона при появлении диалоговых окон или других всплывающих элементов.
 * @property surfaceBright Яркий цвет поверхности для выделения.
 * @property surfaceContainer Цвет контейнера поверхности, используемый для основных контейнеров.
 * @property surfaceContainerHigh Цвет контейнера поверхности для более акцентированных контейнеров.
 * @property surfaceContainerHighest Цвет контейнера поверхности для самых акцентированных контейнеров.
 * @property surfaceContainerLow Цвет контейнера поверхности для менее акцентированных контейнеров.
 * @property surfaceContainerLowest Цвет контейнера поверхности для самых менее акцентированных контейнеров.
 * @property surfaceDim Тусклый цвет поверхности для менее ярких элементов.
 */
interface ChronixColorScheme {
    val primary: Color
    val onPrimary: Color
    val primaryContainer: Color
    val onPrimaryContainer: Color
    val inversePrimary: Color
    val secondary: Color
    val onSecondary: Color
    val secondaryContainer: Color
    val onSecondaryContainer: Color
    val tertiary: Color
    val onTertiary: Color
    val tertiaryContainer: Color
    val onTertiaryContainer: Color
    val background: Color
    val onBackground: Color
    val surface: Color
    val onSurface: Color
    val surfaceVariant: Color
    val onSurfaceVariant: Color
    val surfaceTint: Color
    val inverseSurface: Color
    val inverseOnSurface: Color
    val error: Color
    val onError: Color
    val errorContainer: Color
    val onErrorContainer: Color
    val outline: Color
    val outlineVariant: Color
    val scrim: Color
    val surfaceBright: Color
    val surfaceDim: Color
    val surfaceContainer: Color
    val surfaceContainerHigh: Color
    val surfaceContainerHighest: Color
    val surfaceContainerLow: Color
    val surfaceContainerLowest: Color
}

object ChronixLightColors : ChronixColorScheme {

    override val primary: Color = Color(0xFF4CAF50) // Green
    override val onPrimary: Color = Color(0xFFFFFFFF) // White
    override val primaryContainer: Color = Color(0xFFC8E6C9) // Light Green
    override val onPrimaryContainer: Color = Color(0xFF1B5E20) // Dark Green
    override val inversePrimary: Color = Color(0xFF1B5E20) // Dark Green
    override val secondary: Color = Color(0xFFFF9800) // Orange
    override val onSecondary: Color = Color(0xFFFFFFFF) // White
    override val secondaryContainer: Color = Color(0xFFFFE0B2) // Light Orange
    override val onSecondaryContainer: Color = Color(0xFFE65100) // Dark Orange
    override val tertiary: Color = Color(0xFF009688) // Teal
    override val onTertiary: Color = Color(0xFFFFFFFF) // White
    override val tertiaryContainer: Color = Color(0xFFB2DFDB) // Light Teal
    override val onTertiaryContainer: Color = Color(0xFF004D40) // Dark Teal
    override val background: Color = Color(0xFFFFFFFF) // White
    override val onBackground: Color = Color(0xFF000000) // Black
    override val surface: Color = Color(0xFFFFFFFF) // White
    override val onSurface: Color = Color(0xFF000000) // Black
    override val surfaceVariant: Color = Color(0xFFE0E0E0) // Light Gray
    override val onSurfaceVariant: Color = Color(0xFF757575) // Gray
    override val surfaceTint: Color = primary // Green
    override val inverseSurface: Color = Color(0xFF000000) // Black
    override val inverseOnSurface: Color = Color(0xFFFFFFFF) // White
    override val error: Color = Color(0xFFD32F2F) // Red
    override val onError: Color = Color(0xFFFFFFFF) // White
    override val errorContainer: Color = Color(0xFFFFCDD2) // Light Red
    override val onErrorContainer: Color = Color(0xFFB71C1C) // Dark Red
    override val outline: Color = Color(0xFFBDBDBD) // Gray
    override val outlineVariant: Color = Color(0xFF9E9E9E) // Darker Gray
    override val scrim: Color = Color(0xFF000000) // Black
    override val surfaceBright: Color = Color(0xFFFAFAFA) // Very Light Gray
    override val surfaceContainer: Color = Color(0xFFF5F5F5) // Very Light Gray
    override val surfaceContainerHigh: Color = Color(0xFFEEEEEE) // Light Gray
    override val surfaceContainerHighest: Color = Color(0xFFE0E0E0) // Light Gray
    override val surfaceContainerLow: Color = Color(0xFFFAFAFA) // Very Light Gray
    override val surfaceContainerLowest: Color = Color(0xFFF5F5F5) // Very Light Gray
    override val surfaceDim: Color = Color(0xFFE0E0E0) // Light Gray
}

object ChronixDarkColors : ChronixColorScheme {
    override val primary: Color = Color(0xFF4CAF50)
    override val onPrimary: Color = Color(0xFF212121)
    override val primaryContainer: Color = Color(0xFF2E7D32)
    override val onPrimaryContainer: Color = Color(0xFFF1F8E9)
    override val inversePrimary: Color = Color(0xFF66BB6A)
    override val secondary: Color = Color(0xFF424242)
    override val onSecondary: Color = Color(0xFFBDBDBD)
    override val secondaryContainer: Color = Color(0xFF616161)
    override val onSecondaryContainer: Color = Color(0xFFE0E0E0)
    override val tertiary: Color = Color(0xFF757575)
    override val onTertiary: Color = Color(0xFFE0E0E0)
    override val tertiaryContainer: Color = Color(0xFF9E9E9E)
    override val onTertiaryContainer: Color = Color(0xFFF5F5F5)
    override val background: Color = Color(0xFF303030)
    override val onBackground: Color = Color(0xFFBDBDBD)
    override val surface: Color = Color(0xFF424242)
    override val onSurface: Color = Color(0xFFE0E0E0)
    override val surfaceVariant: Color = Color(0xFF616161)
    override val onSurfaceVariant: Color = Color(0xFFE0E0E0)
    override val surfaceTint: Color = Color(0xFF4CAF50)
    override val inverseSurface: Color = Color(0xFFFAFAFA)
    override val inverseOnSurface: Color = Color(0xFF212121)
    override val error: Color = Color(0xFFB00020)
    override val onError: Color = Color(0xFFFFFFFF)
    override val errorContainer: Color = Color(0xFFD32F2F)
    override val onErrorContainer: Color = Color(0xFFFFCDD2)
    override val outline: Color = Color(0xFFBDBDBD)
    override val outlineVariant: Color = Color(0xFF757575)
    override val scrim: Color = Color(0xFF000000)
    override val surfaceBright: Color = Color(0xFF757575)
    override val surfaceDim: Color = Color(0xFF212121)
    override val surfaceContainer: Color = Color(0xFF424242)
    override val surfaceContainerHigh: Color = Color(0xFF616161)
    override val surfaceContainerHighest: Color = Color(0xFF757575)
    override val surfaceContainerLow: Color = Color(0xFF303030)
    override val surfaceContainerLowest: Color = Color(0xFF212121)
}