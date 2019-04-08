#Author: jesusdbarajas@gmail.com
Feature: Verify information of medium posts
  As a medium User
  I want to know the date and the time to read of some posts
  To decide if read or not that post

  Scenario: Validate information
    Given the medium home page loaded
    When I search the posts stored in a excel file
    Then the information about each post shoulder be the same

