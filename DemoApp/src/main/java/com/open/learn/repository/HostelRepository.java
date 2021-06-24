/**
 * 
 */
package com.open.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.open.learn.model.Hostel;

/**
 * @author swapnilwarekar
 *
 */
@Repository
public interface HostelRepository extends JpaRepository<Hostel, Integer> {

}
