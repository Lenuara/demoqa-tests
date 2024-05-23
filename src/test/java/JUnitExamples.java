import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitExamples {

  @BeforeAll
  static void beforeAll()
  {
    System.out.println("Here is beforeAll()");
  }

  @AfterAll
  static void afterAll()
  {
    System.out.println("Here is afterAll()");
  }

  @BeforeEach
   void beforeEach()
  {
    System.out.println("      Here is beforeEach()");
  }

  @AfterEach
  void afterEach()
  {
    System.out.println("      Here is afterEach()");
  }

  @Test
   void firstTest()
    {
     System.out.println("            Here is firstTest()");
    }
  @Test
     void secondTest()
  {
    System.out.println("           Here is secondTest()");
  }
}
