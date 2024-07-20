package kz.android.theme.main

import android.content.res.Resources
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.Lifecycle
import androidx.navigation.*
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.CoroutineScope

/**
 * Destinations used in the [GbApp].
 */
object MainDestinations {
    const val HOME_ROUTE = "home"
    const val GAME_CARD_DETAIL_ROUTE = "cardRoute"
    const val GAME_CARD = "gameCard"
    const val SUB_CATALOG_ROUTE = "subCatalog"
    const val CATALOG_GAME = "catalogGame"
}

/**
 * Remembers and creates an instance of [AppState]
 */
@Composable
fun rememberAppState(
        navController: NavHostController = rememberNavController(),
        resources: Resources = resources(),
        coroutineScope: CoroutineScope = rememberCoroutineScope()
) =
        remember(navController, resources, coroutineScope) {
            GbAppState(navController)
        }

/**
 * Responsible for holding state related to [GbApp] and containing UI-related logic.
 */
@Stable
class GbAppState(val navController: NavHostController) {
    // ----------------------------------------------------------
    // Источник состояния BottomBar
    // ----------------------------------------------------------

    val bottomBarTabs = HomeSections.values()
    private val bottomBarRoutes = bottomBarTabs.map { it.route }

    // Атрибут отображения навигационного меню bottomBar
    val shouldShowBottomBar: Boolean @Composable get() = navController.currentBackStackEntryAsState().value?.destination?.route in bottomBarRoutes

    // ----------------------------------------------------------
    // Источник состояния навигации
    // ----------------------------------------------------------

    val currentRoute: String? get() = navController.currentDestination?.route

    fun upPress() {
        navController.navigateUp()
    }

    fun navigateToBottomBarRoute(route: String) {
        if (route != currentRoute) {
            navController.navigate(route) {
                launchSingleTop = true
                restoreState = true
                popUpTo(findStartDestination(navController.graph).id) {
                    saveState = true
                }
            }
        }
    }
}

private fun NavBackStackEntry.lifecycleIsResumed() =
        this.lifecycle.currentState == Lifecycle.State.RESUMED

private val NavGraph.startDestination: NavDestination?
    get() = findNode(startDestinationId)

private tailrec fun findStartDestination(graph: NavDestination): NavDestination {
    return if (graph is NavGraph) findStartDestination(graph.startDestination!!) else graph
}

/**
 * A composable function that returns the [Resources]. It will be recomposed when `Configuration`
 * gets updated.
 */

@[ReadOnlyComposable Composable]
private fun resources(): Resources {
    return LocalContext.current.resources
}
