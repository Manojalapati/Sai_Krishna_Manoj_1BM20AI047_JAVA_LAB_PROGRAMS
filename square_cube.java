import java.util.Random;
import square.*;
import cube.*;

abstract class rand{
 int number;
 abstract int random_num();
}
class rand2 extends rand{
 int random_num()
 {
  Random randomNum = new Random();
  number = randomNum.nextInt(100); 
  return number;
 }
}


public class square_cube {
    
}
