package f1;

import javax.print.DocFlavor;

public interface Function<T,R> {

        R apply(T t);

}
