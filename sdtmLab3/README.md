# SDTM Laboratory Work 3

## Topic of the laboratory work

Behavioral Design Patterns


## Author

Daniela Palamari, FAF-181


## Introduction/Theory

Applications tend to contain a lot of different logic inside them. At some point of time amount of code present might
become a problem because it doesn't allow to rapidly introduce new changes because of too coupled code that does not
rely on abstractions and dynamic dispatch. Applying behavioral design patterns allows to introduce an additional layer
of abstraction and therefore to remove unneeded branching instructions.


## Implementation & Explanation

Current application is an extension of work done during first two labs. It models potential objects from music world.
There are music instruments and music players present in the system that are interacting in some way.

During this lab the following patterns were implemented:

1. **State** - state pattern simplifies management of objects with multiple states possbile. In our scenario it was used
to make the code rely on dynamic dispatch and therefore make code more object oriented.

An example could be found in the `SoundMixer` class and another one is `DrumKit` class.

2. **Command** - this pattern decouples decision-making from decision execution. With its help it is possible to define
an action at the beginning of the application amd execute it right before the end. The command object acts as a
self-contained request that has references to all objects that it might need to execute an action.

An example could be found in the `PlaySongCommand` class. It implements `Command` interface that is a common for all
commands in the system.

3. **Observer** - with the help of this pattern it is possible to dynamically react on changes inside an object. For
example, we might enforce some security rules after a transaction completes.

An example could be found in the `SoundMixer` class. It requires client code to implement `SoundMixerEventSubscriber`
interface. After subscription registers client code will be called in response to changes in the objects.

## Results/Screenshots/Conclusions

Behavioral design patterns allow writing code with a way simpler model of communication between objects. Also, it makes
code more extensible by relying on dynamic dispatch instead of manual branching. Some patterns unlock code reuse between
different components of an application.
