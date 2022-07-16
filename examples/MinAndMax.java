import jdk.incubator.vector.*;

public class MinAndMax {

      static final VectorSpecies<Float> SPECIES = FloatVector.SPECIES_256;
      
      static void MinAndMaxComputation(float[] a) {
                  
             for (int i = 0; i < SPECIES.loopBound(a.length); i += SPECIES.length()) {
                   FloatVector va = FloatVector.fromArray(SPECIES, a, i);                 
                   FloatVector vb = va.min(1);
                   System.out.println(vb);
             }
           
      }
      
      
      public static void main(String[] args) throws Exception {
      
      float a[] = {1,2};
      MinAndMaxComputation(a);
      
      }
      
}      
            
                    
