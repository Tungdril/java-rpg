public class exploreEvent {
    public static void main(String[] args) {
		int exploreEvent = (int) (((Math.random()+Math.random()) /2) * 3 );
		System.out.println(exploreEvent);

		switch (exploreEvent)
		{
			case 1:
				System.out.println("Nothing Happened"); //Player should be able "to go on" or to "leave" 
				break;
			case 2:
				System.out.println("The Beginning of a Fight! How interesting!"); //fight script should start
				break;
			default:
				System.out.println("Loot!"); //experimental, isn't needed
				break;
		}

	}
}