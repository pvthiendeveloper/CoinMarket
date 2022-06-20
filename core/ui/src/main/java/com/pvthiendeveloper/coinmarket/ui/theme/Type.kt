package com.pvthiendeveloper.coinmarket.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.pvthiendeveloper.coinmarket.ui.R

val coinMarketFontFamily = FontFamily(
    Font(R.font.opensans_bold, weight = FontWeight.Bold),
    Font(R.font.opensans_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(R.font.opensans_light, weight = FontWeight.Light),
    Font(R.font.opensans_medium, weight = FontWeight.Medium),
    Font(R.font.opensans_regular, weight = FontWeight.Normal),
    Font(R.font.opensans_semibold, weight = FontWeight.SemiBold),
)

internal val Typography = Typography(
    h5 = TextStyle(
        fontFamily = coinMarketFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        letterSpacing = 0.sp
    ),
    h6 = TextStyle(
        fontFamily = coinMarketFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        letterSpacing = 0.15.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = coinMarketFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        letterSpacing = 0.15.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = coinMarketFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        letterSpacing = 0.1.sp
    ),
    body1 = TextStyle(
        fontFamily = coinMarketFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        letterSpacing = 0.5.sp
    ),
    body2 = TextStyle(
        fontFamily = coinMarketFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        letterSpacing = 0.25.sp
    ),
    button = TextStyle(
        fontFamily = coinMarketFontFamily,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp,
        letterSpacing = 1.25.sp
    ),
    caption = TextStyle(
        fontFamily = coinMarketFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 0.4.sp
    ),
    overline = TextStyle(
        fontFamily = coinMarketFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
        letterSpacing = 1.5.sp
    )
)