package com.itheima;

import com.itheima.pojo.User;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class VelocityText {
    @Test
    public void text1() throws IOException {
        // 1.设置velocity的资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 2.初始化引擎
        Velocity.init(prop);
        // 3.创建velocity容器
        VelocityContext context = new VelocityContext();
        context.put("name","lisi");
        // 4.加载模板文件
        Template template = Velocity.getTemplate("vms/velocity_01.vm","utf-8");
        // 5.合并数据到模板
        FileWriter fw = new FileWriter("E:\\idea\\22.volocity\\day01\\velocity_01\\src\\main\\resources\\HTML\\velocity_01.html");
        template.merge(context,fw);
        // 6.释放资源
        fw.close();
    }
    @Test
    public void text2() throws IOException {
        // 1.设置velocity的资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 2.初始化引擎
        Velocity.init(prop);
        // 3.创建velocity容器
        VelocityContext context = new VelocityContext();
        context.put("name","lisi");
        // 4.加载模板文件
        Template template = Velocity.getTemplate("vms/velocity_02.vm","utf-8");
        // 5.合并数据到模板
        FileWriter fw = new FileWriter("E:\\idea\\22.volocity\\day01\\velocity_01\\src\\main\\resources\\HTML\\velocity_02.html");
        template.merge(context,fw);
        // 6.释放资源
        fw.close();
    }
    @Test
    public void text3() throws IOException {
        // 1.设置velocity的资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 2.初始化引擎
        Velocity.init(prop);
        // 3.创建velocity容器
        VelocityContext context = new VelocityContext();
        User user = new User();
        user.setUsername("zhangshan");
        user.setPassword("123456");
        user.setEmail("236551321321");

        context.put("user",user);
        // 4.加载模板文件
        Template template = Velocity.getTemplate("vms/velocity_03.vm","utf-8");
        // 5.合并数据到模板
        FileWriter fw = new FileWriter("E:\\idea\\22.volocity\\day01\\velocity_01\\src\\main\\resources\\HTML\\velocity_03.html");
        template.merge(context,fw);
        // 6.释放资源
        fw.close();
    }
    @Test
    public void text4() throws IOException {
        // 1.设置velocity的资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 2.初始化引擎
        Velocity.init(prop);
        // 3.创建velocity容器
        VelocityContext context = new VelocityContext();

        List<User> userList = new ArrayList<User>();
        userList.add(new User("张三","123456","15465465"));
        userList.add(new User("lisi","123456","15465465"));
        userList.add(new User("wangwu","123456","15465465"));
        context.put("userList",userList);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        context.put("map",map);
        // 4.加载模板文件
        Template template = Velocity.getTemplate("vms/velocity_04.vm","utf-8");
        // 5.合并数据到模板
        FileWriter fw = new FileWriter("E:\\idea\\22.volocity\\day01\\velocity_01\\src\\main\\resources\\HTML\\velocity_04.html");
        template.merge(context,fw);
        // 6.释放资源
        fw.close();
    }
    @Test
    public void text5() throws IOException {
        // 1.设置velocity的资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class","org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        // 2.初始化引擎
        Velocity.init(prop);
        // 3.创建velocity容器
        VelocityContext context = new VelocityContext();
        context.put("code","#if($!{user.name})<h1>真</h1>#else<h1>假</h1>#end");
        List<User> userList = new ArrayList<User>();
        userList.add(new User("张三","123456","15465465"));
        userList.add(new User("lisi","123456","15465465"));
        userList.add(new User("wangwu","123456","15465465"));
        context.put("userList",userList);

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        context.put("map",map);
        // 4.加载模板文件
        Template template = Velocity.getTemplate("vms/velocity_05.vm","utf-8");
        // 5.合并数据到模板
        FileWriter fw = new FileWriter("E:\\idea\\22.volocity\\day01\\velocity_01\\src\\main\\resources\\HTML\\velocity_05.html");
        template.merge(context,fw);
        // 6.释放资源
        fw.close();
    }
}
