package com.services.persistance.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.services.persistance.api.entities.ServiceRequestHistory;

@Repository
@Transactional
public interface ServiceRequestHistoryRepository extends JpaRepository<ServiceRequestHistory, Long> {

}
