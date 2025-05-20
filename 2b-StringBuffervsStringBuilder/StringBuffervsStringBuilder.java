
//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending the string 
//‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which one is better.
public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        long startTime, endTime;

        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("AIET");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ns");

        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("AIET");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ns");
    }
}
