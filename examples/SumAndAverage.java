import jdk.incubator.vector.*;

public class SumAndAverage {

      static final VectorSpecies<Integer> SPECIES = IntVector.SPECIES_256;
      
      static void SumAndAverageComputation(int[] a) {
      
            //int sum = 0;
            for (int i=0; i < SPECIES.loopBound(a.length); i += SPECIES.length()) {       
              var b = a.add(a[i]);
              System.out.println(b);
            }
            
      }
      
      
      public static void main(String[] args) throws Exception {
      
      int a[] = {1,2,3,4,5,6,7,8,9,10};
      SumAndAverageComputation(a);
      
      }
      
}      
            
                    
