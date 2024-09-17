private var idCounter = 0
data class Book (val id:Int,
                 val title:String,
                 val author:String,
                 val year:Int)

private fun createBook(title: String, author: String, year: Int): Book {
    return Book(++idCounter, title, author, year)
}
