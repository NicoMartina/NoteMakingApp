Note Taking App

Overview

This is a simple Note Taking App built in Java that allows users to create, remove, and display notes. Each note consists of a title, body, and timestamp to keep track of when it was created. The app uses a List to manage the notes and provides a simple console interface to interact with the app.

Features

Add Notes: Users can create a new note by providing a title and body text.
Remove Notes: Users can remove notes by title.
Display Notes: Users can view all their notes, including their title, body, and creation timestamp.
Technologies Used

Java (for the backend logic)
Scanner (for user input from the console)
ArrayList (for storing the list of notes)
Setup and Installation

Clone this repository to your local machine:
git clone https://github.com/yourusername/note-taking-app.git
Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse) or use a text editor and terminal.
Compile and run the project:
If using the terminal, navigate to the folder where you saved the project, and run the following commands:
javac Main.java
java Main
The app will ask you to input a command from the console, and you can use the following options:
1: Make a note
2: Remove a note
3: Display all notes
4: Exit the app
Usage

Upon running the app, you'll be greeted with the main menu. You can choose one of the following options:
1. Make a note: You will be prompted to enter the title and body of the note.
2. Remove a note: You will be asked to provide the title of the note you want to delete.
3. Display all notes: All your saved notes will be displayed, showing the title, body, and creation timestamp.
4. Exit: Exit the application.
If you choose to add or remove notes, the app will let you know whether the action was successful.
Code Structure

Note.java: This class represents a note with a title, body, and creation timestamp.
NoteList.java: This class handles the logic for storing, removing, and displaying notes.
Main.java: The entry point of the app, which contains the main loop and handles user input.
Example

Here’s what the console interaction looks like:

Welcome to your Note Taking App
What would you like to do?
1. Make a note
2. Remove a note
3. Display all notes
4. Exit
Choose your option: 1
Title: Write a Poem
Body: I need to write a poem by Friday otherwise I will be fired
Note added successfully!

Welcome to your Note Taking App
What would you like to do?
1. Make a note
2. Remove a note
3. Display all notes
4. Exit
Choose your option: 3
Title: Write a Poem
Body: I need to write a poem by Friday otherwise I will be fired
Created at: 2025-04-08 09:19:33
-----------------
Future Enhancements

Save Notes to File: Implement functionality to save and load notes from a file.
User Authentication: Allow different users to manage their own notes.
Note Categories: Organize notes into categories or tags.
Graphical User Interface (GUI): Build a GUI for the app using JavaFX or Swing.
License

This project is licensed under the MIT License - see the LICENSE file for details.
