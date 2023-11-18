package com.sol.vicariussolassignment.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.sol.vicariussolassignment.entity.User;

public interface UserRepository extends ElasticsearchRepository<User, Integer>{

}
