User Story:

As a researcher, I would like to view the frequency of a given word and any similar words in my
notebook entry.

-----------------------------------------------------------------------

Development:

The solution consists of a Graphical User Interface (a SPA frontend, see Example_Normal.jpg and Example_Error_ServiceNotAvailable.jpg files at the project's root) and a REST service implemented as per the user request.


1. Architecture

	1.1. FrontEnd

		- Single page application created with Angular framework

	1.2. BackEnd

		- REST API created with Spring Boot
		- Java 8


2. Definition of DONE

	- Backend Testing executed successfully with Postman
	- No TODO points remaining
	- Error Handling in both frontend and backend have been implemented
