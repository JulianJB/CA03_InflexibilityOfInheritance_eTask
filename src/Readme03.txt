1) explain the design issue that results from trying to replace inheritance with the use of interfaces

Although the solution improved from the use of inheritance which led to either unexpected behavior or
class explosion, the use of interfaces is not the best approach neither.

The main design issue of replacing inheritance with interfaces is that it will ultimately lead to duplicate
code and it will become a huge maintenance issue in the future.

Take a look at this part of the code of the Flyable interface and the MallardDuck and RedHeadDuck classes:

interface Flyable {
	void fly();
}

class MallardDuck extends Duck implements Flyable, Quackable {
	public void fly() {
	    // Previous implementation:
	    // System.out.println("<<" + this.getClass().getName() + " fly style>>");
		// Manually adding a change to the fly() method implementation:
		System.out.println("<<" + this.getClass().getName() + " wheesh>>");
	}
}

class RedHeadDuck extends Duck implements Flyable, Quackable {
	public void fly() {
	    // Previous implementation:
	    // System.out.println("<<" + this.getClass().getName() + " fly style>>");
		// Manually adding a change to the fly() method implementation:
		System.out.println("<<" + this.getClass().getName() + " wheesh>>");
	}
}

As it can be seen, even the smallest of changes, like changing a simple output message, represent a
considerable time-consuming maintenance task, destroying the concept of code reuse and adding the
complexity of performing repetitive tasks for producing changes to achieve the expected behavior in
the program.