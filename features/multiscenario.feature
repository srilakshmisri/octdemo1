Feature: Refund of item

Background:
Given refund of any faulty item as per the guidelines

Scenario: Jeff returns faulty microwave
Given Jeff has brought microwave for $100
And Jeff has the reciept
When Jeff returns the faulty item 
Then Jeff got the refund of $90

Scenario: Jeff returns faulty microwave
Given Jeff has brought microwave for $120
And Jeff has the reciept
When Jeff returns the faulty item 
Then Jeff got the refund of $110