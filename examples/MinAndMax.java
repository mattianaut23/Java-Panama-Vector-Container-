import jdk.incubator.vector.*;

public class MinAndMax {

      static final VectorSpecies<Float> SPECIES = FloatVector.SPECIES_256;
      
      static void MinAndMaxComputation(float[] a) {
                  
             for (int i = 0; i < SPECIES.loopBound(a.length); i ++ ) {
                   FloatVector va = FloatVector.fromArray(SPECIES, a, i);                
                   System.out.println(f);
             }
            
            for (int j = 0; j < va.length ; j++) {
                  System.out.println(va.lane(j));
            }
           
      }
      
      
      public static void main(String[] args) throws Exception {
      
      float a[] = {3,0,1,4,5,6,9,2};
      MinAndMaxComputation(a);
      
      }
      
}      
            
                    
