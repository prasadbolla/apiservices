package com.services.order.save.api.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Transactional
public interface ServiceRequestsRepository extends JpaRepository<ServiceRequests, Long> {

}
