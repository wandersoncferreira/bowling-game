# bowling-game

A Clojure library designed to solve the `Bowling Kata` proposed by
Uncle Bob some time ago.

I am going to use TDD to solve it.


## Rules

    - The bowling game is split in 10 frames
    - Each frame contains 2 rolls (or "throws")
    - Your score is the sum of the pins you knocked out with each of
    the rolls
      - Special case 1: 10 pints w/ 2 balls; you can roll again 
      (sum 5 +  5 + next-roll)
      - Special case 2: 10 pints w/ 1 ball; you can roll again twice.
      (sum 10 + next-roll-1 + next-roll-2)


## License

Copyright © 2020 Wanderson Ferreira

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
    
