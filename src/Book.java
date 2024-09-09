import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder


public class Book {

        private String title;
        private double pages;
        private String authors;
        private String genre;
        public Book(String title, double pages, String authors, String genre) {
            this.title = title;
            this.pages = pages;
            this.authors = authors;
            this.genre = genre;
        }
        public String getTitle(){
            return title;
        }
        public double getPages(){
            return pages;
        }
        public String getAuthors(){
            return authors;
        }
        public String getGenre(){
            return genre;
        }
}
