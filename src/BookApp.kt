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


    }


    private fun showInputDialog(dialogText: String): String {
        val inputDialog = TextInputDialog()
        inputDialog.title = "Введите данные"
        inputDialog.contentText = dialogText
        val result = inputDialog.showAndWait()
        return result.orElse("")
    }
}
}
