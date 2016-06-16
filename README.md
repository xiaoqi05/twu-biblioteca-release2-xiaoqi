
#Assignment: Biblioteca Release 2
```
Instructions to push your code to code.google.com
=================================================
1. Sign into GitHub and create a new repository
        Repository name: twu-biblioteca-yourname
        Privacy level: Public
        Don't check "Initialize this repository with a README"
        Add .gitignore: None
        Add a license: Apache License 2.0

2. Run 'git init' in the folder that was extracted from the downloaded .zip file, in order to
 initialize local repository.

3. Make a local commit.
    $ git add -A
    $ git commit -m “Initial commit”

(Dont forget to add the hidden .idea folder, as it will make opening your project in Intellij easier.)

4. After you are done with the local commit, you can share your code with "The World" by pushing it to your
 GitHub repository.
    $ git remote add origin https://github.com/<YOUR-GITHUB-USERNAME>/twu-biblioteca-<YOURNAME>
    $ git push origin master

Instructions to open your code in Intellij
==========================================
1. Go to File -> Open (or Open Project)
2. Select the directory containing the code
DONE !
```

The Bangalore Public Library is quite happy with the first release of Biblioteca. Time for us to move on to the next release! This release of Biblioteca needs to have two major features:

##User Stories
- List Movies - As a customer, I would like to see a list of available movies, so that I can browse for a movie that I might check-out. Movies have a name, year, director and movie rating (from 1-10 or unrated).
- Check-out Movie - As a customer, I would like to check out a movie from the library, so I can enjoy it at home.
- User Accounts - Login - As a librarian, I want to know who has checked out a book, so that I can hold them accountable for returning it. Users must now login using their library number (which is in the format xxx-xxxx) and a password in order to check-out and return books. User credentials are predefined, so registering new users is not part of this story.
- User Accounts - User information - As a customer, I want to be able to see my user information (name, email address and phone number), so that I know that the library can contact me. This option should only be available when the customer is logged in and should only display that customer’s information.
##Technical Requirements
- All the code must be developed using TDD
- Biblioteca still needs to be a console application 
- We do not need a database for this release
##Assignment Setup
This assignment just builds upon the work you did for the first assignment. Continue to work on the same codebase. A new setup is not required.




