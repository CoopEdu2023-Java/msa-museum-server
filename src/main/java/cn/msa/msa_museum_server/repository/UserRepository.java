package cn.msa.msa_museum_server.repository;


import org.springframework.data.repository.CrudRepository;

import cn.msa.msa_museum_server.entity.UserEntity;

import java.util.Optional;


public interface UserRepository extends CrudRepository<UserEntity, Integer> {

    public boolean existsByUsernameAndPassword(String username, String password);

    public Optional<UserEntity> findByUsernameAndPassword(String username, String password);

    public boolean existsByUsername(String username);

    public Optional<UserEntity> findByUsername(String username);
}