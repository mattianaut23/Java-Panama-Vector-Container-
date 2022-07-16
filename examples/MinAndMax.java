import jdk.incubator.vector.*;

public class MinAndMax {

      static final VectorSpecies<Float> SPECIES = FloatVector.SPECIES_256;
      
      static void MinAndMaxComputation(float[] a) {
                  
             for (int i = 0; i < a.length; i += SPECIES.length()) {
                   VectorMask<Float> m = SPECIES.indexInRange(i, a.length);
                   FloatVector va = FloatVector.fromArray(SPECIES, a, i, m);                
                   float f = va.lane(i);
                   System.out.println(f);
             }
           
      }
      
      
      public static void main(String[] args) throws Exception {
      
      float a[] = {3,0};
      MinAndMaxComputation(a);
      
      }
      
}      
            
                    
