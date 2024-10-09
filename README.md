# Vote Counter Project

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## Overview

The **Vote Counter Project** is a Java application that simulates an election vote counting system for Sith Senate Members. It randomly generates election results, records votes for candidates, and reports the results, including the number of valid votes, votes for each candidate, and any spoiled votes.

## Features

- **Simulates** an election with four candidates: Darth Sidius, Darth Maul, Darth Vader, and Darth Plagueis.
- **Randomly** generates votes, including some invalid votes.
- **Displays** the number of valid votes and the percentage of votes received by each candidate.
- **Handles** expanding the capacity of the vote storage arrays when needed.

## Technologies Used

- Java SE 11 or higher
- Java Development Kit (JDK)
- Any IDE of your choice (e.g., IntelliJ IDEA, Eclipse)

## Installation

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/yourusername/vote-counter-project.git
   cd vote-counter-project
   ```

2. Compile the Project: Navigate to the src/votecounterproject directory and compile the Java files, specifying the bin directory for compiled classes:

   ```bash
   cd src/votecounterproject
   javac -d ../../bin *.java
   ```

3. Run the Application: Execute the main class:
   ```bash
   java -cp ../../bin votecounterproject.VoteCounterProject
   ```

## Output Sample

When you run the program, you will see output similar to the following, which indicates the results of a randomly generated election:

```bash
45678 valid votes were cast.
Darth Sidius: 11342 votes, 24.8%.
Darth Maul: 15421 votes, 33.7%.
Darth Vader: 12345 votes, 27.0%.
Darth Plagueis: 6540 votes, 14.4%.
There were 99 spoiled votes.
```

## Class Descriptions

`VoteCounterProject`
The main class that initiates the election results simulation.

`ArrayListVoteCounter`
This class handles the recording of votes, reporting of results, and managing the list of candidates.

`SithSenateMember`
Represents a candidate in the election and keeps track of the number of votes received.

## License

This project is open-source and available under the [MIT License](LICENSE).
