package io.honeymon.trainingprogramming.domain.repository;

import io.honeymon.trainingprogramming.domain.entity.Bank;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jiheon.kim on 2018. 6. 20.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class BankRepositoryTest {
    @Autowired
    BankRepository bankRepository;

    @Test
    public void testSave() {
        Bank bank = new Bank("002", "한국은행", "https://bok.or.kr");

        bankRepository.save(bank);

        assertThat(bank.getId()).isNotNull();
    }
}
