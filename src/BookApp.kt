import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.layout.VBox
import javafx.stage.Stage

class BookApp : Application() {
    private var books = createBookList()
    override fun start(primaryStage: Stage) {
        val root = VBox()
        val scene = Scene(root, 600.0, 400.0)

        val addBook = Button("Добавить книгу")
        val showBooks = Button("Показать все книги")
        val filterBooks = Button("Фильтрация книг по году")
        val sortBooks = Button("Сортировка по названию")

        val output = TextArea()
        output.isEditable = false

        addBook.setOnAction {
            val title = showInputDialog("Введите название книги:")
            val author =showInputDialog("Введите автора:")
            val year = showInputDialog("Введите год издания:").toIntOrNull() ?: 0
            if (title.isNotEmpty() && author.isNotEmpty())
                books = books + createBook(title, author, year)
        }

        showBooks.setOnAction {
            output.text = "Все книги:\n" + books.joinToString("\n")
        }

        filterBooks.setOnAction {
            val year =showInputDialog("Введите год для фильтрации:").toIntOrNull() ?: 0
            val filteredBooks = filterBooksByYear(books, year)
            output.text = "Книги, опубликованные после $year:\n" + filteredBooks.joinToString("\n")
        }

    }


    private fun showInputDialog(dialogText: String): String {
        val inputDialog = TextInputDialog()
        inputDialog.title = "Введите данные"
        inputDialog.contentText = dialogText
        val result = inputDialog.showAndWait()
        return result.orElse("")
    }
}

