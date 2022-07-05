import static java.lang.foreign.MemorySegment;
import static java.lang.foreign.MemorySession;
import static org.unix.stdio_h.printf;
public class HelloWorld {
    public static void main(String[] args) {
       try (var memorySession = MemorySession.newConfined()) {
           MemorySegment cString = memorySession.allocateUtf8String("Hello World! Panama style\n");
           printf(cString);
       }
    }
}
