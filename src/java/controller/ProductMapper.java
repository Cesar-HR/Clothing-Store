package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Product;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Cesar Hidalgo Rojas
 */
public class ProductMapper implements RowMapper<Product> {

    public ProductMapper() {
    }

    @Override
    public Product mapRow(ResultSet rs, int i) throws SQLException {
        return new Product(rs.getInt("idProduct"), rs.getString("name"), rs.getString("picture"), rs.getString("description"), rs.getDouble("price"), rs.getInt("stock"));
    }
}
