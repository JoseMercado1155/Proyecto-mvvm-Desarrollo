package com.example.ejemplomvvm.model

class QuoteProvider {
    companion object {

        fun random(): QuoteModel {
            val position = (0..10).random()
            return quotes[position]
        }

        private val quotes = listOf(
            QuoteModel(
                quote = "¡No es un error, es una característica no documentada!",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "“Desarrollador de software”: un organismo que convierte la cafeína en software",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "Si la depuración es el proceso de eliminar errores de software, entonces la programación debe ser el proceso de ponerlos en práctica.",
                author = "Edsger Dijkstra"
            ),
            QuoteModel(
                quote = "Una interfaz de usuario es como un chiste. Si tienes que explicarlo, no es tan bueno.",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "¡No me importa si funciona en tu máquina! ¡No te enviaremos tu máquina!",
                author = "Vidiu Platon"
            ),
            QuoteModel(
                quote = "Medir el progreso de la programación por líneas de código es como medir el progreso de la construcción de aviones por peso.",
                author = "Bill Gates"
            ),
            QuoteModel(
                quote = "Mi código NO funciona, no tengo idea de por qué. Mi código FUNCIONA, no tengo idea de por qué.",
                author = "Anonymous"
            ),
            QuoteModel(quote = "Las cosas no siempre son #000000 y #FFFFFF", author = "Anonymous"),
            QuoteModel(quote = "Hablar es fácil. Muéstrame el código.", author = "Linus Torvalds"),
            QuoteModel(
                quote = "El software y las catedrales son muy parecidos: primero los construimos, luego oramos.",
                author = "Anonymous"
            ),
            QuoteModel(quote = "Profe, por favor paseme :(", author = "Jose Mercado")
        )
    }
}