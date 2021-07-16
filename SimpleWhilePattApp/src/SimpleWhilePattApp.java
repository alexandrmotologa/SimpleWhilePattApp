//
//public class SimpleWhilePattApp {
//
//	public static void main(String[] args) {
//		int rx = 2, ry = 2;
//		int y = 1;
//		
//		
//		while( y <= 10) {
//		
//			int x = 1;
//			
//			while( x <= 10 ) {
//				if(x == rx && y == ry) {
//					System.out.print("+ ");
//				} else {
//					System.out.print("* ");
//				}
//				
//				x++;
//					
//			}
//			System.out.println();
//			y++;
//		}
//			
//	}
//
//}


public class SimpleWhilePattApp {

	public static void main(String[] args) {
		int rx = 1, ry = 10;
		int y = 1;
		
		
		while( y <= 10) {
		
			int x = 1;
			
			while( x <= 10 ) {
				
				if(x == 1 || x == 10) {
					System.out.print("* ");
				} else if(x >= 2 && y == 1 ){
					System.out.print("* ");
				}else if(x >= 2 && y == 10 ){
					System.out.print("* ");
				}else if(x >=4 || x <=9){
					System.out.print("  ");
				} 
				if(x == rx && y == ry) {
					if(rx >=4 || rx<=9 && ry >=2 || ry<=9) {
						System.out.print("\b+");
					} else {
						System.out.println();
					}
				}
				x++;
					
			}
			if(y <= 10) {
				System.out.println();
			} 
			y++;
		}
			
	}

}

