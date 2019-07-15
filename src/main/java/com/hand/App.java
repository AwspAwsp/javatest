package com.hand;

import com.hand.exam1.Jtrain;
import com.hand.exam1.Jtrain1;
import com.hand.exam2.Csql;

import javax.swing.text.html.HTMLDocument;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        //第一个项目
        Jtrain train=new Jtrain();
        train.CreatMap();
        train.sort();
        //第二个项目
        Csql csql=new Csql();
        String name="shanghai";
        String name1="Customer_id";
        csql.Getselect(name);
        csql.Getselect1(name1);
    }
}
