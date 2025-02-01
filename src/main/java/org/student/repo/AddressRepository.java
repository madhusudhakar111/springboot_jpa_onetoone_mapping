package org.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.student.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
