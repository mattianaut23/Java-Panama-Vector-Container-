import jdk.incubator.vector.*;

public class MinAndMax {

      static final VectorSpecies<Float> SPECIES = FloatVector.SPECIES_256;
      
      static void MinAndMaxComputation(float[] a) {
                  
             for (int i = 0; i < SPECIES.loopBound(a.length); i += SPECIES.length() ) {
                   FloatVector va = FloatVector.fromArray(SPECIES, a, i);                
                   float f = va.lane(i);
                   System.out.println(f);
             }
           
      }
      
      
      public static void main(String[] args) throws Exception {
      
      float a[] = {3,0,1,4,5,6,9,2};
      MinAndMaxComputation(a);
      
      }
      
}      
            
                    
