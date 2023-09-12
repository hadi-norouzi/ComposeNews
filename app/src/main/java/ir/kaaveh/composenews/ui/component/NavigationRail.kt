package ir.kaaveh.composenews.ui.component

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.NavigationRail
import androidx.compose.material.NavigationRailItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ir.kaaveh.designsystem.component.BottomNavigationIcon
import ir.kaaveh.navigation.BottomNavItem

@Composable
fun ComposeNewsNavigationRail(
    items: List<BottomNavItem>,
    currentScreenRoute: String?,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit
) {
    NavigationRail(
        modifier = modifier.fillMaxHeight(),
    ) {
        items.forEach { item ->
            val selected = item.route == currentScreenRoute
            NavigationRailItem(
                selected = selected,
                onClick = { onItemClick(item) },
                icon = {
                    BottomNavigationIcon(
                        name = item.name,
                        icon = item.icon,
                        selected = selected,
                        badgeCount = item.badgeCount,
                    )
                }
            )
        }
    }
}