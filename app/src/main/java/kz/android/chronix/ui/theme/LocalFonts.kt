package kz.android.chronix.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import kz.android.chronix.R

val FontFamily.Companion.Montserrat get() = FontFamily(
    Font(R.font.montserrat_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.montserrat_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.montserrat_bolditalic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.montserrat_medium, FontWeight.Medium, FontStyle.Normal),
)

val FontFamily.Companion.CeraPro get() = FontFamily(
    Font(R.font.cera_pro_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.cera_pro_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.cera_pro_black, FontWeight.Black, FontStyle.Normal),
    Font(R.font.cera_pro_italic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.cera_pro_italic_medium, FontWeight.Medium, FontStyle.Italic),
)

val FontFamily.Companion.Roboto: FontFamily get() = FontFamily(
    Font(R.font.roboto_light, FontWeight.Light),
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_bold, FontWeight.Bold)
)