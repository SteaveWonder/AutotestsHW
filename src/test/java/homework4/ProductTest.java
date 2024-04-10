package homework4;

import home4.ProductsEntity;
import org.hibernate.Query;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductTest extends AbstractTest{
    @Test
    void getProduct_whenValid_shouldReturn() throws SQLException {
        //given
        String sql = "SELECT * FROM products";
        Statement stmt  = getConnection().createStatement();
        int countTableSize = 0;
        //when
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            countTableSize++;
        }
        final Query query = getSession().createSQLQuery(sql).addEntity(ProductsEntity.class);
        //then
        Assertions.assertEquals(10, countTableSize);
        Assertions.assertEquals(10, query.list().size());
    }

    @ParameterizedTest
    @CsvSource({"1, 300.0", "2, 450.0", "3, 700.0"})
    void getProductById_whenValid_shouldReturn(int id, String menuName) throws SQLException {
        //given
        String sql = "SELECT * FROM products WHERE product_id=" + id;
        Statement stmt  = getConnection().createStatement();
        String price = "";
        //when
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            price = rs.getString(3);
        }
        //then
        Assertions.assertEquals(price, menuName);
    }
}
