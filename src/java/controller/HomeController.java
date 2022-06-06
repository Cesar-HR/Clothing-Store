package controller;

import config.env;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Cesar Hidalgo Rojas
 */
//specify the class as controller
@Controller
public class HomeController {

    private JdbcTemplate jdbcTemplate;

    public HomeController() {
        env connection = new env();
        this.jdbcTemplate = new JdbcTemplate(connection.getConnection());
    }


    /*=========================================================
        HOME
    ===========================================================*/
    @RequestMapping("home.htm")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        return mav;
    }

    /*=========================================================
        PRODUCT
    ===========================================================*/
    @ModelAttribute("dataProduct")
    public List<Product> dataProduct() {
        List<Product> listProduct = new ArrayList<Product>();
        String sql = "SELECT * FROM tbl_product";
        listProduct = jdbcTemplate.query(sql, new ProductMapper());
        return listProduct;
    }

    /*=========================================================
        ABOUT
    ===========================================================*/
    @RequestMapping("about.htm")
    public ModelAndView about() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("about");
        return mav;
    }

    /*=========================================================
        HELP
    ===========================================================*/
    @RequestMapping("help.htm")
    public ModelAndView help() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("help");
        return mav;
    }

    /*=========================================================
        CONTACT
    ===========================================================*/
    @RequestMapping("contact.htm")
    public ModelAndView contact() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("contact");
        return mav;
    }
}
