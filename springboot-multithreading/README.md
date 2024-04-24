# Multi-Threading in Spring Boot using CompletableFuture
# https://www.mockaroo.com/ and generate CSV file as we need to upload the files
# Note: 1 and 2 API calls are not multi-threading. The third one where multi-threading applied.
# (1). http://localhost:9191/users (used 2 files to upload files as to thread pool created).
# (2). http://localhost:9191/users
# (3). http://localhost:9191/users/threads

# Check data in H2 database (http://localhost:9191/h2-console)

About: Multi-Threading
In this project, the CompletableFuture has been used which applied in Java 1.8. 
Following Threads (java 1), Future (java 1.5) and CompletableFuture (java 1.8) can be used as guide line.

1. Threads:
a) Low-level control over concurrency.
b) Prone to errors like race conditions and deadlocks.
c) Manual exception handling.
d) Limited built-in support for composition.

2. Future:
a) Provides asynchronous execution with a clear separation of task submission and result retrieval.
b) Simplifies asynchronous programming.
c) Still requires explicit exception handling.
d) Limited support for composition.

3. CompletableFuture:
a) Highly composable, allowing the chaining of multiple asynchronous tasks.
b) Built-in exception handling and easy error propagation.
c) Provides a more expressive way to work with asynchronous code.
d) Introduced in Java 8 and enhanced in subsequent versions.

