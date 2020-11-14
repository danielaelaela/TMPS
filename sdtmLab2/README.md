# SDTM Laboratory Work 2

## Topic of the laboratory work

Structural Design Patterns


## Author

Daniela Palamari, FAF-181


## Introduction/Theory

Relationships between objects might be complex enough so to manage and to communicate with them is needed to write
cumbersome source code that is hard to maintain and even to reason about. Structural design patterns can simplify
relationships between objects by providing more flat and maintainable structures. Most of these patterns hide the
complexity of object hierarchies behind simple abstractions.


## Implementation & Explanation

Current implementation extended the work done during the first laboratory work. It was based around the topic of musical
instruments. Now it was extended in a way to provide an option to play songs on these instruments. Several player actor
models were introduced.

The following patterns were implemented:
1. **Composite** - MusicPlayer allows us to play the same song using only one musician or an orchestra made of hundreds
   of musicians and exclusive guests like rock-star bands.
   
   `MusicPlayer` interface was introduced to provide a common interface for different types of actors. Depending on the
   concrete types the song playing will be either executed directly or delegated to all children objects.

2. **Decorator** - Xylophone is optionally mounted on the drum kit. The domain model represents this type of relationship
   through the xylophone drum kit extension.
   
   `XylophoneDrumKitExtension` class implements this pattern. It extends the capabilities of a drum kit while at the
   same time providing the same programmatic interface.

3. **Proxy** - some instruments are quite noisy and it might be beneficial to play them in a way so no one hears you. Sound
   mixer produces noise only when it is connected to the speakers and is silent otherwise.
   
   `SoundMixer` class implements this pattern. It encapsulates the logic about when to call the real object depending on
   the internal state.

## Results/Screenshots/Conclusions

Structural design patterns are very useful to create flat and easily maintainable object hierarchies. Most of the
patterns attempt to delegate some part of the work to other objects while either adding new functionality or completely
changing the way an object behaves. These patterns allow writing easily extendable source code bases.