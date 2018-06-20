package io.honeymon.trainingprogramming.domain.repository;

import io.honeymon.trainingprogramming.domain.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jiheon.kim on 2018. 6. 20.
 */
public interface BankRepository extends JpaRepository<Bank, Long> {
}
