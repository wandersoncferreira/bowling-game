# bowling-game

A Clojure project designed to solve the `Bowling Kata` proposed by
Uncle Bob some time ago.

The idea of this kata is to create a code to compute a scoring system
to a bowling game. In order to do so, the rules of bowling must be
known, there is a first attempt to describe it below.


I am going to use TDD to solve it, you can switch to a specific branch
and see the commit messages documenting what test was written in there
and the appropriate code extension necessary to make it pass.

## Rules

    - The bowling game is split in 10 frames
    - Each frame contains 2 rolls (or "throws")
    - Your score is the sum of the pins you knocked out with each of
    the rolls
      - Special case 1 (SPARE) : 10 pins w/ 2 balls; you can roll again 
      (sum 5 +  5 + next-roll)
      - Special case 2 (STRIKE): 10 pins w/ 1 ball; you can roll again twice.
      (sum 10 + next-roll-1 + next-roll-2)  (you only consumes 1 frame doing this)
      - Special case 3 (SPARE): 10th frame you need to throw an additional ball
      - Special case 4 (STRIKE): 10th frame you need to throw two more balls

## Implementations

    I will keep a link to the branch with the most current
    implementation. The idea of these katas is to very regularly
    implement it again to practice and explore concepts in your
    programming language and abstractions. Therefore, it will be
    several links here (I hope).
    
    
1. 2020/04/20 - [Imperative Implementation. First attempt] - master
2. 2020/04/21 - [More functional approach] - k1

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
    
