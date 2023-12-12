package com.multi.api;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(MovieVO movievo) {
		my.insert("movie.insert",movievo);
	}
	
}
