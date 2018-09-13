package com.javasm.user.action;

import com.javasm.user.model.UserModel;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserHandler {

    @Autowired//获取solr客户端对象 在ymu文件配置过就能用
    private SolrClient solrClient;

    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){

      return "  This is a spring boot demo";
    }

    @RequestMapping("/model")
    @ResponseBody
    public UserModel model(Model model){

        UserModel user=new UserModel("Alex",1,"admin");
        model.addAttribute("adminUser",user);
        return user;
    }
    @RequestMapping("/listPage")
    public String jumpListPage(Model model){
        //测试th表达式接受数据
        UserModel user=new UserModel("Alex",1,"admin");
        model.addAttribute("adminUser",user);
        model.addAttribute("message","Hello,thank u!");

        //测试接受一个list 循环到表格
        List<UserModel> userList=new ArrayList<UserModel>(){
            {
            add(user);
                    add(new UserModel("Daniel", 2, "123"));
                    add(new UserModel("J", 3, "123"));
                    add(new UserModel("K", 2, "123"));
        }
        };
        model.addAttribute("userList",userList);
        return "user/list";
    }

    @RequestMapping("/login")
    public String jumpLoginPage(){

        return "login/login_page";
    }

    // 写在service里更好一点 solr的方法 测试添加
    @RequestMapping("solr_add")
    @ResponseBody
    public String testSolrAdd (){
        SolrInputDocument document=new SolrInputDocument();
        //以key value的形式向document添加 value可以是对象
        document.addField("username","root");
        document.addField("passwd","123456");
        document.addField("age","12");
        UpdateResponse newcore=null;//添加返回的东西 一般添加不需要返回东西
        try {
            newcore=solrClient.add("newcore",document);//newcore是solr的一个库
            solrClient.commit("newcore");
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newcore.toString();
    }

    @RequestMapping("solr_get")
    @ResponseBody
    public String testSolrGet() throws IOException, SolrServerException {
        SolrDocument document=solrClient.getById("newcore","10086");

        return document.toString();
    }

    @RequestMapping("solr_query")
    @ResponseBody
    public String testSolrQuery() throws IOException, SolrServerException {
        //solr查询对象
        SolrQuery query=new SolrQuery();
        //得到的查询 返回响应
        query.setQuery("1008*");
        //获取查询结果
        QueryResponse response=solrClient.query("newcore",query);
        SolrDocumentList list=response.getResults();
        for (SolrDocument document : list) {
            System.out.println("document = " + document);
        }
        return list.toString();
    }
}
