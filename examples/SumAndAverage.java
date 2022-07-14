import jdk.incubator.vector.*;

public class SumAndAverage {

      static final VectorSpecies<Float> SPECIES = FloatVector.SPECIES_256;
      
      static void SumAndAverageComputation(float[] a) {
      
            int sum = 0;
            float b[] = {0,0,0,0,0,0,0,0,0,0};
            var i = SPECIES.loopBound(a.length);
            System.out.println(i);   
          
          /*  for (int i=0; i < SPECIES.loopBound(a.length); i += SPECIES.length()) {    
              FloatVector va = FloatVector.fromArray(SPECIES, a, i);
              System.out.println(va);                                   // 1 2 3 4 5 6 7 8
              va.intoArray(b,i);                 
              System.out.println(b);                                   // 2 3 4 5 6 7 8 9
            }*/
            
      }
      
      
      public static void main(String[] args) throws Exception {
      
      float a[] = {1,2,3,4,5,6,7,8,9,10};
      SumAndAverageComputation(a);
      
      }
      
}      
            
                    
