package com.cydeo.bootstrap;

import com.cydeo.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final AccountRepository accountRepository;

    public DataGenerator(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }



    @Override
    public void run(String... args) throws Exception {

    accountRepository.findAllByCountryOrState("UK","New York").forEach(System.out::println);

    accountRepository.findAllByAgeLessThanEqual(50).forEach(System.out::println);

        accountRepository.findAllByCountryOrState("UK","New York").forEach(System.out::println);

        accountRepository.findAllByAgeLessThanEqual(50).forEach(System.out::println);


    }
}
