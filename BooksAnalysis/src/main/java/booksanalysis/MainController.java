package booksanalysis;
import booksanalysis.model.Book;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;
public class MainController implements Initializable {
    @FXML
    private TableView<Book> book;
    private TableColumn<Book, String> title;
    private TableColumn<Book, String> author;
    private TableColumn<Book, String> genre;
    private TableColumn<Book, Integer> yearPublication;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        title.setCellValueFactory(new PropertyValueFactory<Book, String>("title"));
        author.setCellValueFactory(new PropertyValueFactory<Book, String>("author"));
        genre.setCellValueFactory(new PropertyValueFactory<Book, String>("genre"));
        yearPublication.setCellValueFactory(new PropertyValueFactory<Book, Integer>("yearPublication"));
    }

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
}
