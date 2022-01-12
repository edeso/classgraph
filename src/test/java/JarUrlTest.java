
import java.net.URL;
import java.net.URLClassLoader;

import org.junit.jupiter.api.Test;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;

/**
 * DefaultPackageTest.
 */
public class JarUrlTest {

  @Test
  public void test() throws Exception {
    ScanResult scanResult = new ClassGraph().verbose()
        .overrideClassLoaders(new URLClassLoader(new URL[] { new URL("jar:file:issue209.jar!/") })).scan();
  }

}
