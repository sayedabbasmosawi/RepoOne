Feature: hub Spot contacts 

Scenario Outline: hubSpot test Scanerios for contacts


	Given use is already in login page 
	When title of login page is HubSpt 
	Then user enters "<username>" and "<password>" 
	And user click on button 
	And user is on homepage 
	And user moves to contact page
	And user enter "<email>" and "<firstname>" and "<lastname>"
	And User close the browser 
	
	Examples: 
	
	|username					 |haji1@gmail.com|haji1@gmail.com|	password		|firstname|lastname|
	|abasmosawisayed110@gmail.com|haji2@gmail.com|haji2@gmail.com|	12345678Ab@@	|haj Abbas|azaad   |
	|abasmosawisayed110@gmail.com|jahi3@gmail.com|haji3@gmail.com|	12345678Ab@		|Haj Abbas|Azaaaadi|
	
	
	