package com.spring.security.repository;



    import com.spring.security.model.User;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserRepository extends JpaRepository<User, Long> {

        User findByUserName(String username);
    }

