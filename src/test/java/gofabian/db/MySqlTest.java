package gofabian.db;

import gofabian.ExecuteReturningTest;
import gofabian.QueryTest;
import gofabian.RecordTest;
import org.junit.jupiter.api.Nested;
import org.springframework.test.context.TestPropertySource;


public class MySqlTest {

    static final String R2DBC_URL_PROPERTY = "spring.r2dbc.url=r2dbc:tc:mysql:///db?TC_IMAGE_TAG=5.6.23";

    @Nested
    @TestPropertySource(properties = MySqlTest.R2DBC_URL_PROPERTY)
    class MySqlQueryTest extends QueryTest {

    }

    @Nested
    @TestPropertySource(properties = MySqlTest.R2DBC_URL_PROPERTY)
    class MySqlRecordTest extends RecordTest {
    }

    @Nested
    @TestPropertySource(properties = MySqlTest.R2DBC_URL_PROPERTY)
    class MySqlExecuteReturningTest extends ExecuteReturningTest {
    }

}
