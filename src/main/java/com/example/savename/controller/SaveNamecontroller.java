package com.example.savename.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.savename.bean.SaveName;
import com.example.savename.service.SaveNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Date;
import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/6/27
 */
@Controller
public class SaveNamecontroller {
    @Autowired
    private SaveNameService saveNameService;

    @RequestMapping("insetSaveName")
    @ResponseBody
    public synchronized int insertSaveName(SaveName saveName){
        if(saveName.getGender().equals("1")){
            saveName.setGender("男");
        }else{
            saveName.setGender("女");
        }

        if(saveName.getGongzuo().equals("1")){
            saveName.setGongzuo("前台/文员");
        }else if(saveName.getGongzuo().equals("2")){
            saveName.setGongzuo("行政助理");
        }else if(saveName.getGongzuo().equals("3")){
            saveName.setGongzuo("销售");
        }else{
            saveName.setGongzuo("java开发");
        }
        saveName.setOstatytime(new Date());
        saveNameService.insetSaveName(saveName);
        return 1;
    }

    @RequestMapping("getAllSaveName")
    @ResponseBody
    public List<SaveName> getAllSaveName(){
        return saveNameService.getAllSaveName();
    }

    @RequestMapping("getSaveNameById")
    @ResponseBody
    public SaveName getSaveNameById(Integer id){
        return saveNameService.getSaveNameById(id);
    }

    @RequestMapping("delSaveNameById")
    @ResponseBody
    public int delSaveNameById(Integer id){
        return saveNameService.delSaveNameById(id);
    }

    @RequestMapping("pppp")
    @ResponseBody
    public SaveName doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        response.setContentType("text/html;charset=utf-8");
        /* 设置响应头允许ajax跨域访问 */
        response.setHeader("Access-Control-Allow-Origin", "*");
        /* 星号表示所有的异域请求都可以接受， */
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");

        //获取微信小程序get的参数值并打印
        Integer id =Integer.parseInt(request.getParameter("id"));
        //System.out.println("username=" + username + " ,password=" + password);

        //返回值给微信小程序

        return saveNameService.getSaveNameById(id);


     }

    }
