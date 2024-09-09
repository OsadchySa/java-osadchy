import java.util.ArrayList;

public class TypesDemo {
    public static void main(String[] args) {

        Book book1 = new Book("Moby-Dick", 585, "Herman Melville", "Adventure");
        Book book2 = new Book("1984", 328, "George Orvell", "Dystopian");
        Book book3 = new Book("To Kill a Mockingbird", 281, "Harper Lee", "Drama");
        Book book4 = new Book("Pride and Prejudice", 432, "Jane Austen", "Romance");
        Book book5 = new Book("The Great Gatsby", 180, "Scott Fitzgerald", "Tragedy");
        //System.out.println(book3.getAuthors());
        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;
        for (Object o : books) {
            System.out.println(o);
        }


        Car car1 = new Car("BMW M3", 503, 3, true);
        Car car2 = new Car("Audi RS7", 591, 4, true);
        Car car3 = new Car("Ford Mustang GT", 480, 5, false);
        Car car4 = new Car("Porsche 911 Turbo S", 640, 3.8, true);
        Car car5 = new Car("Honda Civic Type R", 315, 2, true);
        ArrayList cars = new ArrayList();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        for (Object o : cars) {
            System.out.println(o);
        }



        Dog dog1 = new Dog("Tuzik", 8, "Chihua");
        Dog dog2 = new Dog("Zhuzha", 4, "Spitz");
        Dog dog3 = new Dog("Jack", 3, "Ovcharka");
        Dog dog4 = new Dog("Fiona", 2, "Buldog");
        Dog dog5 = new Dog("Lucky", 7, "Terier");
        dog2.setAge(5);
        ArrayList dogs = new ArrayList();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);
        for (Object o : dogs) {
            System.out.println(o);
        }


        Post post1 = new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
        Post post2 = new Post(1, 2, "qui est esse", "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla");
        Post post3 = new Post(1, 3, "ea molestias quasi exercitationem repellat qui ipsa sit aut", "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut");
        Post post4 = new Post(1, 4, "eum et est occaecati", "ullam et saepe reiciendis voluptatem adipisci\nsit amet autem assumenda provident rerum culpa\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\nquis sunt voluptatem rerum illo velit");
        Post post5 = new Post(1, 5, "nesciunt quas odio", "repudiandae veniam quaerat sunt sed\nalias aut fugiat sit autem sed est\nvoluptatem omnis possimus esse voluptatibus quis\nest aut tenetur dolor neque");
        ArrayList posts = new ArrayList();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
        posts.add(post5);
        for (Object o : posts) {
            System.out.println(o);
        }


        Comment comment1 = new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");
        Comment comment2 = new Comment(1, 2, "quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com", "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et");
        Comment comment3 = new Comment(1, 3, "odio adipisci rerum aut animi", "Nikita@garfield.biz", "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione");
        Comment comment4 = new Comment(1, 4, "alias odio sit", "Lew@alysha.tv", "non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati");
        Comment comment5 = new Comment(1, 5, "vero eaque aliquid doloribus et culpa", "Hayden@althea.biz", "harum non quasi et ratione\ntempore iure ex voluptates in ratione\nharum architecto fugit inventore cupiditate\nvoluptates magni quo et");
        ArrayList comments = new ArrayList();
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        comments.add(comment4);
        comments.add(comment5);
        for (Object o : comments) {
            System.out.println(o);
        }
    }
}
