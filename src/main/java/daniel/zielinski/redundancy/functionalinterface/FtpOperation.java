package daniel.zielinski.redundancy.functionalinterface;

import java.io.IOException;

@FunctionalInterface
interface FtpOperation<T, R> {

    R apply(T t) throws IOException;
}
