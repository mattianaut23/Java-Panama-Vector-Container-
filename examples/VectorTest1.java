import jdk.incubator.vector.*;

public class VectorTest1 {
    
    static final VectorSpecies<Float> SPECIES = FloatVector.SPECIES_256;

    static void vectorComputation(float[] a, float[] b, float[] c) {
        for (int i = 0; i < a.length; i += SPECIES.length()) {
            var m = SPECIES.indexInRange(i, a.length);
            var d = SPECIES.length();
            var e = SPECIES;
            // FloatVector va, vb, vc;
            var va = FloatVector.fromArray(SPECIES, a, i, m);
            //var vb = FloatVector.fromArray(SPECIES, b, i, m);
            //var vc = va.mul(va).
            //            add(vb.mul(vb)).
             //           neg();
            //vc.intoArray(c, i, m);
          System.out.println("Test");
          System.out.println(m);
          System.out.println(d);
          System.out.println(e);
          System.out.println(va);
        }
}
    
    public static void main(String[] args) throws Exception {
        float  a[] = {1,1,1,1,1,1,1,1};
        float  b[] = {1,1,1,1,1,1,1,1};
        float[] x = new float[8];

        vectorComputation(a,b,x);
        /*for(float e : x)
            System.out.println(e);*/

    }

    

}
