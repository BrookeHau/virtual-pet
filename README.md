### Virtual Pet
Create a virtual pet. Bonus points if it becomes a fad!

## Classes
* create a ```VirtualPet``` class.
( create a ```VirtualPetApp``` class with a ```main``` method.
* You should house your project in a properly named package…something other than the default package
## Details
Create a virtual pet application. This is your version of a Tamagotchi or DigiPet! This might seem like a daunting task, but we can break it down.

Think of which instance variables and methods you will need. We give suggestions below. Remember that instance variables represent the state of your pet. Methods represent the behavior of your pet, which would include its responses to you feeding or playing with it.

Most games include what is called a game loop, a loop which updates everything in the game, representing the passage of time. We exit this loop when something happens that should cause the game to end. Include a ```tick()``` method (think clocks, not parasites) in your ```VirtualPet``` class representing the passage of a unit of time. This should do things like update instance variables of ```VirtualPet``` that are time dependent, such as hunger or thirst. You should call the ```tick()``` to represent the passage of time after each interaction with the user.

There is always some confusion with this ```tick()``` method. It has some flexibility, what you are doing is changing the properties of your Virtual Pet at some rate in this method…every time this method is called, those properties specified in this method would update.

## Required Tasks
* VirtualPet class
  * Create a ```tick()``` method that represents the passage of time.
  * Create at least three instance variables (aka attributes aka properties aka fields).
  * Create at least three methods (messages you send to your pet).
* VirtualPetApp class
  * Create a main method that…
  * implements a game loop.
  * asks for user input.
  * writes output to the console.
