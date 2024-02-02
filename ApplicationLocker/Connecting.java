package com.thippeswamy.app.ApplicationLocker;

import com.thippeswamy.app.LockedAppliction.NumberPuzzleGame;
import com.thippeswamy.app.LockedAppliction.BasicMathCalculator;

abstract class Connecting {
    public abstract void Connecting();
}

class Calling1 extends Connecting {
    @Override
    public void Connecting() {
        new NumberPuzzleGame();
    }
}

class Calling2 extends Connecting {
    @Override
    public void Connecting() {
        BasicMathCalculator BasicMathCalculator = new BasicMathCalculator();
        BasicMathCalculator.run();
    }
}

class Calling3 extends Connecting {
    @Override
    public void Connecting() {
    }
}

class Calling4 extends Connecting {
    @Override
    public void Connecting() {

    }
}

class Calling {
    public void doSomething(Connecting c) {
        c.Connecting();
    }
}

