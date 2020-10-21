// WRITE CODE: - choose to make this Duck implement Flyable or Quackable or both
class RedHeadDuck extends Duck implements Flyable, Quackable {

	@Override
	void display() {
		System.out.println("RedHeadDuck shows its feathers");
	}

	@Override
	public void fly() {
		System.out.println("<<" + this.getClass().getName() + " fly style>>");
	}

	@Override
	public void quack() {
		System.out.println("<<" + this.getClass().getName() + " quack sound>>");
	}
}