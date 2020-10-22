// WRITE CODE: - choose to make this Duck implement Flyable or Quackable or both
class RedHeadDuck extends Duck implements Flyable, Quackable {

	@Override
	void display() {
		System.out.println("RedHeadDuck shows its feathers");
	}

	@Override
	public void fly() {
		//System.out.println("<<" + this.getClass().getName() + " fly style>>");
		// Adding a change to the fly() method, now it should print
		// the "wheesh" sound effect, which implies changing each of the
		// fly() method implementations manually.
		System.out.println("<<" + this.getClass().getName() + " wheesh>>");
	}

	@Override
	public void quack() {
		System.out.println("<<" + this.getClass().getName() + " quack sound>>");
	}
}