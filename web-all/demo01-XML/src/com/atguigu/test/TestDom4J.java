package com.atguigu.test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * @author: liyijia
 * @version: 0.0
 * @create time: 2024-01-2024/1/17
 * @description: DOM4J 进行 XML 解析
 */
public class TestDom4J {

    @Test
    public void testRead() throws DocumentException {
        //     读取 jdbc.xml 配置文件，获得 document 对象
        SAXReader saxReader = new SAXReader();
        // 通过类加载器获得指向字节码根路径下的指定文件的输入流
        InputStream resourceAsStream = TestDom4J.class.getClassLoader().getResourceAsStream("jdbc.xml");
        // 通过输入流获取配置文件，解析成一个dom对象
        Document document = saxReader.read(resourceAsStream);
        //     从 document 对象上获取配置文件中的信息
        Element rootElement = document.getRootElement();


        System.out.println(rootElement.getName());
        List<Element> elements = rootElement.elements();
        for (Element e: elements) {
            System.out.println(e.getName());
            System.out.println(e.getText());
            System.out.println(e.attributeValue("id"));
        }
    }


}
