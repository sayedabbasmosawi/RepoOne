Feature: hub Spot login 

Scenario Outline: hubSpot test Scanerios

	Given use is already in login page 
	When title of login page is HubSpt 
	Then user enters "<username>" and "<password>" 
	And user click on button 
	And user is on homepage 
	 
	
	Examples: 
	
	|username					 |	password		|
	|abasmosawisayed110@gmail.com|	12345678Ab@@	|
	|abasmosawisayed110@gmail.com|	12345678Ab@		|
	
	
	
