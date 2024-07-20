package kz.android.chronix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import kz.android.theme.ChronixTheme
import kz.android.theme.main.HomeSections
import kz.android.ui_components.AppScaffold

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            ChronixTheme(darkTheme = true) {
                AppScaffold(
                    bottomBar = { AppBottomNavigation(navController) },
                    modifier = Modifier.fillMaxSize(),
                    floatingActionButtonPosition = FabPosition.Center,
                    isFloatingActionButtonDocked = true,
                    floatingActionButton = {

                    }
                ) { innerPadding ->
                    MainScreenNavigation(navController)
                }
            }
        }
    }
}


@[Composable OptIn(ExperimentalMaterial3Api::class)]
fun AppBottomNavigation(navController: NavHostController) {


    BottomAppBar(
        scrollBehavior = null,
        actions = {
            AppNavigationBar(navController = navController)
        },
        modifier = Modifier
            .height(72.dp)
            .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp)),
        tonalElevation = 40.dp,
    )
}

@Composable
private fun AppNavigationBar(navController: NavHostController) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()


    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier,
        tonalElevation = 16.dp

    ) {
        HomeSections.entries.forEach {
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = "",
                        modifier = Modifier.size(35.dp),
                    )
                },
                label = {
                    Text(text = it.title)
                },
                selected = (navBackStackEntry?.destination?.route == it.route),
                onClick = {
                    navController.navigate(it.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

@Composable
fun MainScreenNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = HomeSections.SCREEN1.route) {

        composable(HomeSections.SCREEN1.route) {
            Text(text = "Screen1", modifier = Modifier.fillMaxSize(), textAlign = TextAlign.Center)
        }
        composable(HomeSections.SCREEN2.route) {
            Text(text = "Screen2", modifier = Modifier.fillMaxSize(), textAlign = TextAlign.Center)
        }

        composable(HomeSections.SCREEN3.route) {
            Text(text = "Screen3", modifier = Modifier.fillMaxSize(), textAlign = TextAlign.Center)
        }
    }
}