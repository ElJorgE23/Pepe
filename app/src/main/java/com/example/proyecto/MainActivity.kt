package com.example.proyecto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyecto.ui.theme.ProyectoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Aplicar el tema dinámico basado en el tema del sistema
            ProyectoTheme {
                // Navegación de la aplicación
                navegacion()
            }
        }
    }
}

@Composable
fun navegacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Rutas.Principal.ruta) {
        composable(route = Rutas.Tareas.ruta) {
            Tareas(navController)
        }
        composable(route = Rutas.Principal.ruta) {
            Principal(navController)
        }
        composable(route = Rutas.Notas.ruta) {
            Notas(navController)
        }
        composable(route = Rutas.AgregarTareas.ruta) {
            AgregarTareas(navController)
        }
        composable(route = Rutas.AgregarNotas.ruta) {
            AgregarNotas(navController)
        }
    }
}
