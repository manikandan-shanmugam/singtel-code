# singtel-code

This assignment is to find out the animal's behavior.

```
                                      Animal(fly,sing,walk,swim)
                                        |
                                        |
                                        |
                       |-------------|----------------|----------------|---------|
                       |             |                |                |         |   
                       |             |                |                |         |  
                     Birds          Fish             Dolphin         Dog      Cat
                     |==>(f,si,w)    |==>(sw)         |==>(sw)        |=>(!f)   |=>(!f)
                     |=>Duck(sw)     |=>Shark
                     |=>Chicken(!f)  |=>clownfish
                     |=>Rooster(!f)  |=> frog
                     |=>Parrot
                     |=>butterfly(!si)
                     
                     f=fly
                     si=sing
                     w=wlak
                     sw=swim
```

```
consider you have java env and git in your laptop, to run this code.

git clone this repo. 
in "test" dir please find "Solution.java"

run the Main() method. it will printout all counts of how many animals can fly, walk,sing,swim.
```
