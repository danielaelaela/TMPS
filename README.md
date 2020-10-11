# Creational Design Patterns

Author: Daniela Palamari

## Introduction/Theory

Creational design patterns is what we use in object creation, in order to make it less complex and more controllable, or in short, more flexible.
Some of these patterns include: Singleton, Builder, Prototype, Factory Method, Abstract Factory.

This laboratory work presents the examples of Abstract Factory, Builder and Prototype patterns. 
In short, The _Builder Design Pattern_ is useful when it comes to objects of a higher complexity, which uses another builder (which is suggested by the name of the pattern) to construct an object. On the other hand, the _Abstract Factory Design Pattern_ is used to create families of dependent objects or objects that are somehow related. The _Prototype Pattern_ refers to creating a clone object


## Implementation & Explanation

I developed the domain model around the topic of musical instruments. Drums are quite complex objects and have a lot of options for configuration and customization. To be able to easily customize your drums I have created a _builder_ named `DrumKitBuilder`. Each drum kit vendor will need to have an implementation of this interface. Other musical instruments were chosen just to provide a wider range of supported musical instruments.

Musical instruments have an option to be copied and in this way `MusicalInstrument` type conforms to the _prototype_ design pattern. 

Suppose that in your city there are only two music shops. One is for the beginners and the other one is for professionals. To represent these music shops I used an _abstract factory_ named `MusicalInstrumentFactory`.

## Conclusions

Creational design patterns are very convenient for creation of complex objects, especially the one with many nested attributes. Factories and builders create an additional abstraction layer between the client and implementation and it makes the client code more reusable. However design patterns should be used with care because they add additional complexity to the source code and to the domain model.
