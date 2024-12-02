package lesson1;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("QWE", 333, new String[]{"Vasya", "Ivan"}, "novel");
        Book book2 = new Book("ASD", 888, new String[]{"Gosha", "Gena"}, "novel");
        Car car1 = new Car("audi", 190, 2.0f, true);
        Car car2 = new Car("hyundai", 130, 1.6f, false);
        Dog dog1 = new Dog("Zhuzha", 12, "York");

        ArrayList<Object> differents = new ArrayList<>();
        differents.add(book1);
        differents.add(book2);
        differents.add(car1);
        differents.add(car2);
        differents.add(dog1);

        System.out.println(differents);
        System.out.println(differents.size());
        System.out.println(differents.get(1));
        for (int i = 0; i < differents.size(); i++) {
            System.out.println(differents.get(i));
        }

        ArrayList<Object> posts = new ArrayList<>();
        Post post1 = new Post(1,1,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
        Post post2 = new Post(1,2, "qui est esse", "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla");
        Post post3 = new Post(1,3, "ea molestias quasi exercitationem repellat qui ipsa sit aut", "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut");
        Post post4 = new Post(1,4, "eum et est occaecati", "ullam et saepe reiciendis voluptatem adipisci\nsit amet autem assumenda provident rerum culpa\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\nquis sunt voluptatem rerum illo velit");
        Post post5 = new Post(1,5, "nesciunt quas odio", "repudiandae veniam quaerat sunt sed\nalias aut fugiat sit autem sed est\nvoluptatem omnis possimus esse voluptatibus quis\nest aut tenetur dolor neque");
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
        posts.add(post5);

        System.out.println("PRINT POSTS -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Object post: posts) {
            System.out.println(post);
        }

        ArrayList<Object> comments = new ArrayList<>();
        Comment comment1 = new Comment(1,1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");
        Comment comment2 = new Comment(1,2,"quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com","est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et");
        Comment comment3 = new Comment(1,3, "odio adipisci rerum aut animi","Nikita@garfield.biz","quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione");
        Comment comment4 = new Comment(1,4,"alias odio sit","Lew@alysha.tv","non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati");
        Comment comment5 = new Comment(1,5,"vero eaque aliquid doloribus et culpa","Hayden@althea.biz","harum non quasi et ratione\ntempore iure ex voluptates in ratione\nharum architecto fugit inventore cupiditate\nvoluptates magni quo et");
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        comments.add(comment4);
        comments.add(comment5);

        System.out.println("PRINT COMMENTS -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        int index = 0;
        while (index<comments.size()){
            System.out.println(comments.get(index));
            index++;
        }
    }
}
