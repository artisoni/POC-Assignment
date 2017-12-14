Feature: Sample_Cucumber test file

Scenario: Verify_right_number_of_value_on_screen
Given The name of the Browser as "Chrome", "https://www.exercise1.com/values"
When Currency Value textbox apprears
Then Verify this right number on screen

Scenario: value_grt than zero_current_format
Given The name of the Browser as "Chrome", "https://www.exercise1.com/values"
When Currency Value for V2 is ""
Then Verify this Value is Greather Than Zero


Scenario: compare_total_balanace
Given The name of the Browser as "Chrome", "https://www.exercise1.com/values"
When Balance Currency Value for bal  is ""
Then Sum Values seen on screen and get totals

Then comapre with balance value on screen

Scenario: verify_currency_format
Given The name of the Browser as "Chrome", "https://www.exercise1.com/values"
When Currency Value for V3 is ""
Then Verify this Value is Formatted as Currency

Scenario: Verify_balance_value_on_screen
Given The name of the Browser as "Chrome", "https://www.exercise1.com/values"
When balance currency  Value textbox apprears
Then assert balance value on screen

Scenario: mockup
Given The name of the Browser as "Chrome", "https://www.exercise1.com/values"
When screen shows up
Then Verify all testing done 
