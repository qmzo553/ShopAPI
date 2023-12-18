package com.example.shopapi.repository;

import com.example.shopapi.domain.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : urstory
 * @mailto : urstory@peonani.com
 * @created : 2023/02/15, 수요일
 **/
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);
}
