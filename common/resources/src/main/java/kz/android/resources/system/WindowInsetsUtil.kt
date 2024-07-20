package kz.android.resourcess.system

import android.annotation.SuppressLint
import android.content.res.Resources
import androidx.annotation.Px

enum class InsetType(val identifierName: String) {
    StatusBar("status_bar_height"),
    NavigationBar("navigation_bar_height"),
}

@[Px SuppressLint("DiscouragedApi")]
fun windowInsetsPixel(insetType: InsetType): Int {
    val resources = Resources.getSystem()
    val resourceId = resources.getIdentifier(insetType.identifierName, "dimen", "android")
    return resources.getDimensionPixelSize(resourceId)
}