private var idCounter = 0
data class Book (val id:Int,
                 val title:String,
                 val author:String,
                 val year:Int)

private fun createBook(title: String, author: String, year: Int): Book {
    return Book(++idCounter, title, author, year)
}

private fun createBookList():List<Book> {
    return listOf(
        createBook("Котлин в действии", "Дмитрий Жемеров", 2017),
        createBook("Java: Эффективное программирование", "Джошуа Блох", 2008),
        createBook("451 градус по Фаренгейту", "Рэй Брэдбери", 1953),
        createBook("Капитанская дочка", "Александр Пушкин", 1836),
        createBook("Гарри Поттер и Тайная Комната", "Дж.К. Роулинг", 1998)
    )
}

fun filterBooksByYear(books: List<Book>, year: Int): List<Book> {
    return books.filter { it.year > year }
}