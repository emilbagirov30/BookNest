var idCounter = 0
data class Book (val id:Int,
                 val title:String,
                 val author:String,
                 val year:Int){
    override fun toString(): String {
        return "$id. \"$title\", $author, $year"
    }
}

fun createBook(title: String, author: String, year: Int): Book {
    return Book(++idCounter, title, author, year)
}

fun createBookList():List<Book> {
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

fun sortBooksByTitle(books: List<Book>): List<Book> {
    return books.sortedBy { it.title }
}

fun main() {
    val books = createBookList()
    println("Все книги:")
    books.forEach { println(it) }

    val filteredBooksByYear = filterBooksByYear(books, 2000)
    println("\nКниги, опубликованные после 2000 года: ")
    filteredBooksByYear.forEach { println(it) }

    val sortedBooksByTitle = sortBooksByTitle(books)
    println("\nОтсортированный список книг: ")
    sortedBooksByTitle.forEach { println(it) }


}

