package io.honyemon.trainingprogramming.domain.entity

import io.honeymon.trainingprogramming.domain.entity.Bank
import spock.lang.Specification

/**
 *
 * @author jiheon.kim on 2018. 6. 20.
 */
class BankSpec extends Specification{

    def "Bank 생성시 생성일시/변경일시는 동일하다"() {
        def bankCode = "001"
        def bankName = "한국은행"
        def bankSiteUrl = "http://www.bok.or.kr"

        when:
        Bank bank = new Bank(bankCode, bankName, bankSiteUrl)

        then:
        bank.code == bankCode
        bank.name == bankName
        bank.siteUrl == bankSiteUrl
        bank.createdDate == bank.lastModifiedDate
    }
}
