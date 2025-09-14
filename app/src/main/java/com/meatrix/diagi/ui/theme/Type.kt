package com.meatrix.diagi.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.meatrix.diagi.R

@Immutable
data class CustomTypography(
    val regularSmall: TextStyle,
    val semiBoldSmall: TextStyle,
    val boldSmall: TextStyle,
    val regularMedium: TextStyle,
    val semiBoldMedium: TextStyle,
    val boldMedium: TextStyle,
    val regularLarge: TextStyle,
    val semiBoldLarge: TextStyle,
    val boldLarge: TextStyle,
    val headerTitleText: TextStyle
)

val LocalTypography = staticCompositionLocalOf {
    CustomTypography(
        regularSmall = TextStyle(),
        semiBoldSmall = TextStyle(),
        boldSmall = TextStyle(),
        regularMedium = TextStyle(),
        semiBoldMedium = TextStyle(),
        boldMedium = TextStyle(),
        regularLarge = TextStyle(),
        semiBoldLarge = TextStyle(),
        boldLarge = TextStyle(),
        headerTitleText = TextStyle()
    )
}

val MaterialTheme.type: CustomTypography
    @Composable
    @ReadOnlyComposable
    get() = LocalTypography.current

// Noto Sans font
val NotoSansFontFamily = FontFamily(
    Font(R.font.noto_sans_thin, FontWeight.Thin),
    Font(R.font.noto_sans_extralight, FontWeight.ExtraLight),
    Font(R.font.noto_sans_light, FontWeight.Light),
    Font(R.font.noto_sans_regular, FontWeight.Normal),
    Font(R.font.noto_sans_medium, FontWeight.Medium),
    Font(R.font.noto_sans_semibold, FontWeight.SemiBold),
    Font(R.font.noto_sans_bold, FontWeight.Bold),
    Font(R.font.noto_sans_extrabold, FontWeight.ExtraBold),
    Font(R.font.noto_sans_black, FontWeight.Black)
)

@Composable
fun provideTypography(): Pair<CustomTypography, Typography> {
    val customTypography = CustomTypography(
        regularSmall = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.small_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp
        ),
        semiBoldSmall = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.small_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp
        ),
        boldSmall = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.small_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp
        ),
        regularMedium = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.medium_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp
        ),
        semiBoldMedium = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.medium_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp
        ),
        boldMedium = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.medium_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp
        ),
        regularLarge = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.large_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp
        ),
        semiBoldLarge = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.large_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp
        ),
        boldLarge = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.large_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp
        ),
        headerTitleText = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.header_title_text).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp
        )
    )

    val materialTypography = Typography(
        bodySmall = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.small_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        bodyMedium = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.medium_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        bodyLarge = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.large_title_text).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        displaySmall = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.small_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        displayMedium = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.medium_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        displayLarge = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.large_title_text).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        headlineSmall = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.small_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        headlineMedium = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.medium_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        headlineLarge = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.large_title_text).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        titleSmall = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.small_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        titleMedium = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.medium_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        titleLarge = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.large_title_text).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        labelSmall = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.small_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        labelMedium = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.medium_text_size).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        ),
        labelLarge = TextStyle(
            fontFamily = NotoSansFontFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            fontSize = dimensionResource(R.dimen.large_title_text).value.sp,
            lineHeight = dimensionResource(R.dimen.text_line_height).value.sp,
            letterSpacing = dimensionResource(R.dimen.letter_spacing).value.sp,
        )
    )
    return Pair(customTypography, materialTypography)
}