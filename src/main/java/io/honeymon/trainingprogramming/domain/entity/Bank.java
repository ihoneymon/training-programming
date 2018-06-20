package io.honeymon.trainingprogramming.domain.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author jiheon.kim on 2018. 6. 20.
 */
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Bank {

    @Id
    @GeneratedValue
    private Long id;

    @EqualsAndHashCode.Include
    @ToString.Include
    private String code;

    @EqualsAndHashCode.Include
    @ToString.Include
    private String name;

    @ToString.Exclude
    private String siteUrl;

    @ToString.Exclude
    private LocalDateTime createdDate;
    @ToString.Exclude
    private LocalDateTime lastModifiedDate;


    @Builder
    public Bank(String code, String name, String siteUrl) {
        this.code = code;
        this.name = name;
        this.siteUrl = siteUrl;
        this.createdDate = LocalDateTime.now();
        this.lastModifiedDate = this.createdDate;
    }
}
