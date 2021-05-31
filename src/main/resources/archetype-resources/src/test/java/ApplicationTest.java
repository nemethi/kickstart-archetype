package ${package};

#set( $Integer = 0 )
#set( $versionIsGreaterThan8 = $Integer.parseInt($javaVersion) > 8 )
#if( $versionIsGreaterThan8 )
import org.junit.jupiter.api.Test;
#else
import org.junit.Test;
#end

public class ApplicationTest {

    @Test
    public void testMethod() {
        // FIXME
    }
}
