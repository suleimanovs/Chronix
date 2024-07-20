package kz.android.resources.system

import android.content.Context
import android.provider.Settings
import kz.android.resources.constants.NumberConstants

enum class SystemNavigation {
    THREE_BUTTON,
    TWO_BUTTON,
    GESTURE;

    companion object {

        private const val NAVIGATION_MODE: String = "navigation_mode"

        /**
         * Navigation bar mode.
         * 0 = three button
         * 1 = two button
         * 2 = fully gestural
         */
        fun create(context: Context) = entries.getOrNull(
            Settings.Secure.getInt(context.contentResolver, NAVIGATION_MODE, -NumberConstants.ONE)
        )
    }
}