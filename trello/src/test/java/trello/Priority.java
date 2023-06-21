package trello;

import org.testng.annotations.Test;

public class Priority {	
		@Test(priority = 0)
		
			public void chech() {
			System.out.println("zero");
				
				
			}
		@Test(priority = 1)
		public void de() {
			System.out.println("one");
			
		}
		@Test(priority = -1)
		public void ae() {
			System.out.println("-1");
			
		}
		@Test(priority = -5)
		public void fi() {
			System.out.println("-5");
			
		}
		@Test
		public void a() {
			System.out.println("nopri a");
		}
		@Test
		public void b() {
			System.out.println("no pr b");
		}
}


