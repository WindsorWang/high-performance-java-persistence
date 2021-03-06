package com.vladmihalcea.book.hpjp.hibernate.transaction.spring.hibernate.dao;

import com.vladmihalcea.book.hpjp.hibernate.transaction.forum.Post;
import org.springframework.stereotype.Repository;

/**
 * <code>PostDAOImpl</code> - Post DAO Impl
 *
 * @author Vlad Mihalcea
 */
@Repository
public class PostDAOImpl extends GenericDAOImpl<Post, Long> implements PostDAO {

    protected PostDAOImpl() {
        super(Post.class);
    }
}
