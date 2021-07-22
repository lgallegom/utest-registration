@stories
  Feature: Registration at utest website
    As a tester, I want to register at utest website to learn new skills

  @scenario
  Scenario Outline: Registration at utest website
    Given than Laura wants to register at utest website
    When she complete the data at form
    |firstName|lastName|email|month|day|year|language|city|zip|country|computer|version|languageCom|mobile|model|mobileOS|password|
    |<firstName>|<lastName>|<email>|<month>|<day>|<year>|<language>|<city>|<zip>|<country>|<computer>|<version>|<languageCom>|<mobile>|<model>|<mobileOS>|<password>|
    Then she see a finish message
    |strFinish|
    |<strFinish>|

    Examples:
      |firstName|lastName|email|month|day|year|language|city|zip|country|computer|version|languageCom|mobile|model|mobileOS|password|strFinish|
      |Laura|Mazo|lauram123@hotmail.com|December|24|1990|Spanish|Medellin|055430|Colombia|Windows|7|Spanish|Samsung|Galaxy|Android 4.1|Laura12345*|Complete Setup|
