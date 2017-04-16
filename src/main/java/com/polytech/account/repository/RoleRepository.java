package com.polytech.account.repository;

import com.polytech.account.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sergio on 14/04/2017.
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}