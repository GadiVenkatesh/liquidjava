package testSuite;

import org.example.missing.Options;

// Writing a field whose declaration cannot be resolved must not crash the verifier (#426)
@SuppressWarnings("unused")
public class CorrectUnresolvedFieldWrite {
    void configure() {
        Options opts = new Options();
        opts.sampleSize = 1;
    }
}
