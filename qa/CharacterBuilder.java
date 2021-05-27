// Java program to demonstrate implementation of
// Strategy Pattern


// Driver class
class CharacterBuilder
{
	public static void main(String args[])
	{
		// let us make some behaviors first
		BuildBehavior ModifyBuild = new ModifyBuild();
		BuildBehavior CreateBuild = new CreateBuild();
		FlyBehavior AccelerateFly = new AccelerateFly();
		FlyBehavior DiveFly = new DiveFly();
		FlyBehavior GlideFly = new GlideFly();

		// Make a character with desired behaviors
		Character ayomi = new Ayomi(AccelerateFly,ModifyBuild);
		ayomi.create();
		// Test behaviors
		ayomi.move();
		ayomi.jump();
		ayomi.swim();
		ayomi.build();

		// Change behavior dynamically (algorithms are
		// interchangeable)
		ayomi.setBuildBehavior(CreateBuild);
		ayomi.build();

		// Make the Ximena character
		Character ximena = new Ximena(AccelerateFly,ModifyBuild);
		ximena.create();
		// Test behaviors
		ximena.move();
		ximena.jump();
		ximena.swim();
		ximena.build();

		// Change behavior dynamically (algorithms are
		// interchangeable)
		ximena.setBuildBehavior(CreateBuild);
		ximena.build();


		// Make the Duck character
		Character duck = new Duck(AccelerateFly,ModifyBuild);
		duck.create();
		duck.move();
		duck.jump();
		duck.swim();
		duck.fly();
		duck.setFlyBehavior(DiveFly);
		duck.fly();
		duck.setFlyBehavior(GlideFly);
		duck.fly();
	}
}

// Abstract as you must have a specific character
abstract class Character {

	FlyBehavior flyBehavior;
	BuildBehavior buildBehavior;

	public Character(FlyBehavior flyBehavior,
				BuildBehavior buildBehavior)
	{
		this.buildBehavior = buildBehavior;
		this.flyBehavior = flyBehavior;
	}
	public void move()
	{
		System.out.println("Default Move");
	}
	public void swim()
	{
		System.out.println("Default Swim");
	}
	public void fly()
	{
		// delegate to fly behavior
		flyBehavior.fly();
	}
	public void build()
	{
		// delegate to build behavior
		buildBehavior.build();
	}
	public void jump()
	{
		System.out.println("Default Jump");
	}
	public void setFlyBehavior(FlyBehavior flyBehavior)
	{
		this.flyBehavior = flyBehavior;
	}
	public void setBuildBehavior(BuildBehavior buildBehavior)
	{
		this.buildBehavior = buildBehavior;
	}
	public abstract void create();
}

// Encapsulated fly behaviors
interface FlyBehavior
{
	public void fly();
}
class DiveFly implements FlyBehavior
{
	public void fly()
	{
		System.out.println("Dive Fly");
	}
}
class AccelerateFly implements FlyBehavior
{
	public void fly()
	{
		System.out.println("Accelerate Fly");
	}
}
class GlideFly implements FlyBehavior
{
	public void fly()
	{
		System.out.println("Glide Fly");
	}
}

// Encapsulated build behaviors
interface BuildBehavior
{
	public void build();
}
class ModifyBuild implements BuildBehavior
{
	public void build()
	{
		System.out.println("Modify Build");
	}
}
class CreateBuild implements BuildBehavior
{
	public void build()
	{
		System.out.println("Create Build");
	}
}

// Characters
class Ximena extends Character
{
	public Ximena(FlyBehavior flyBehavior,
			BuildBehavior buildBehavior)
	{
		super(flyBehavior,buildBehavior);
	}
	public void create()
	{
		System.out.println("Ximena");
	}
}
class Ayomi extends Character
{
	public Ayomi(FlyBehavior flyBehavior,
			BuildBehavior buildBehavior)
	{
		super(flyBehavior,buildBehavior);
	}
	public void create()
	{
		System.out.println("Ayomi");
	}
}
class Christopher extends Character
{
	public Christopher(FlyBehavior flyBehavior,
				BuildBehavior buildBehavior)
	{
		super(flyBehavior,buildBehavior);
	}
	public void create()
	{
		System.out.println("Christopher");
	}
}
class Duck extends Character
{
	public Duck(FlyBehavior flyBehavior,
				BuildBehavior buildBehavior)
	{
		super(flyBehavior, buildBehavior);
	}
	public void create()
	{
		System.out.println("Duck");
	}
}
