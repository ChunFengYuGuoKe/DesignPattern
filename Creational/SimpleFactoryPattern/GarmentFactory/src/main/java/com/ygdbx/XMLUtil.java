package com.ygdbx;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.InputStream;

public class XMLUtil {
    public static String getGarmentType() {
        try {
            // 获取类加载器
            ClassLoader classLoader = XMLUtil.class.getClassLoader();
            // 使用类加载器加载XML文件作为流
            InputStream inputStream = classLoader.getResourceAsStream("config.xml");
            // 创建文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document document = builder.parse(inputStream);

            // 获取包含服饰类型的文本节点
            NodeList node = document.getElementsByTagName("garmentType");
            Node classNode = node.item(0).getFirstChild();
            String type = classNode.getNodeValue().trim();
            return type;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
