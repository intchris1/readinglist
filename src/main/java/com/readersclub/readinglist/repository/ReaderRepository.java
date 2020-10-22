package com.readersclub.readinglist.repository;

import com.readersclub.readinglist.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, String> {

    Reader findByUserName(String userName);

}
