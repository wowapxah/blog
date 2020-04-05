package ru.wowapxah.blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.wowapxah.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
