## Credit-Application-Program-Concurrency

This program demonstrates the use of concurrency using threads in a Producer-Consumer pattern. The program simulates loan applications being processed by a credit company.
## Producers

The Applicants class represents the Producers, which are responsible for creating and adding loan applications to the shared queue. Each instance of the Applicants class runs in its own thread, allowing multiple loan applications to be added to the queue simultaneously, independently and asynchronously.
## Consumers

The CreditCompany class represents the Consumers, which are responsible for retrieving and processing loan applications from the shared queue. Each instance of the CreditCompany class runs in its own thread, allowing multiple loan applications to be processed simultaneously, independently and asynchronously.
## Shared Queue

The shared queue is represented by the ApplicationQueue class, which holds the loan applications that are produced by the Producers and consumed by the Consumers.
## Advantages

Using the Producer-Consumer pattern with threads allows for parallel processing, improving the overall performance and efficiency of the program. It also allows for easy scalability, as new Producers and Consumers can be added or removed as needed.

## Quick Start
To run the program, execute the TestCreditApplication class. It creates three producer threads and two consumer threads, passing the shared queue to them as a parameter in the constructor methods.

<img src="CPM.png">
