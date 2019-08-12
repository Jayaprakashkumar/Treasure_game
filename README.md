# Treasure_game
Find the shortest path to the treasure using functional program : Clojure

Compile the program:
1. Run the clojure file in the Intellij using REPL curvsive plugin

Reference:
1. https://practicalli.github.io/clojure/
2. https://clojure.org/reference/data_structures
3.https://www.tutorialspoint.com/clojure/

In terms of your task, it can be described as follows. You can assume that you are an intrepid explorer, searching for buried treasure. Specifically, you are underground, wandering through a series of very dark tunnels. You have no light and no signs to guide your way. All you can do is blindly feel around and wander through the tunnels until you hopefully enter the room that contains the treasure. You can, however, leave a trail of breadcrumbs behind you so that if you come to the end of a tunnel and you can’t go any further, you can get back to where you were and try again in another direction. This may all sound very abstract, but a simple example will illustrate what has to be done. A map of the tunnels will be stored in a simple text file. The map is used by the application to determine if the explorer can move in a certain direction. The map could look like this:                                       

---#--###----                                                                                                                           
-#---#----##-                                                                                                                           
####-#-#-#-##                                                                                                                           
---#---#-#---                                                                                                                           
-#-####---##-                                                                                                                           
-#------#----                                                                                                                           
-############                                                                                                                           
------------@                                                                                                                           
  
  
Here, the '–' characters indicate that you are free to move in this direction. The '#' character indicates that you cannot move any further in this direction and you should go somewhere else. The '@' character indicates the location of the treasure. In this case, it is in the bottom right corner, but it could be anywhere in the map. In your application, you will always begin searching in the top left corner of the map. So when you run your code, you might print something like the following to the screen:

Woo hoo, I found the treasure :-)                                                                                                       
+++#--###--#-                                                                                                                           
!#+++#+++-##-                                                                                                                           
####+#+#+#!##                                                                                                                           
+++#+++#+#!!!                                                                                                                           
+#+####++!##!                                                                                                                           
+#++++++#!!!!                                                                                                                          
+############                                                                                                                           
++++++++++++@  

The complete description of the project available in A2.pdf
