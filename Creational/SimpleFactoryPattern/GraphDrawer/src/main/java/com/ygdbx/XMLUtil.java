package com.ygdbx;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

public class XMLUtil {
    public static String getType() {
        try {

            ClassLoader classLoader = XMLUtil.class.getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("config.xml");

            // 创建文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(inputStream);

            // 获取节点值
            NodeList nodeList = document.getElementsByTagName("type");
            Node typenode = nodeList.item(0).getFirstChild();
            String type = typenode.getNodeValue();
            return type;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
