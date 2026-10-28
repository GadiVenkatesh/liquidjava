package testSuite;

import org.example.missing.Options;

import liquidjava.specification.Refinement;

// A refinement violation in known code must still be reported alongside an unresolved field write (#426)
@SuppressWarnings("unused")
public class ErrorUnresolvedFieldWrite {
    static void positive(@Refinement("_ > 0") int value) {
    }

    void configure(Options opts) {
        opts.sampleSize = 1;
        positive(-1); // Expect: Refinement Error
    }
}
