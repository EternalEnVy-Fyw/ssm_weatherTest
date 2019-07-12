package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.bean.Airqualityindex;
import com.qf.bean.District;
import com.qf.service.AirqualityindexService;
import com.qf.service.DistrictService;
import com.qf.utils.AllInter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class AirqualityindexController {

    @Resource
    private AirqualityindexService airqualityindexService;
    @Resource
    private DistrictService districtService;

    @RequestMapping("findAllAir")
    public String findAllAir(Airqualityindex airqualityindex, @RequestParam(defaultValue = "1") int index, ModelMap map){
        PageInfo<Airqualityindex> pageInfo = airqualityindexService.findAllAir(airqualityindex, index, AllInter.PAGESIZE);
        List<District> districtList = districtService.findAllDis();
        map.addAttribute("page",pageInfo);
        map.addAttribute("disList",districtList);
        map.addAttribute("districtid",airqualityindex.getDistrictid());
        return "show";
    }

    @RequestMapping("selectAddDis")
    public String selectAddDis(ModelMap map){
        List<District> districtList = districtService.findAllDis();
        map.addAttribute("disList",districtList);
        return "add";
    }

    @RequestMapping("addAir")
    public void addAir(Airqualityindex airqualityindex, HttpServletResponse response){
        int k = airqualityindexService.insertSelective(airqualityindex);
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter writer = response.getWriter();
            if(k>0){
                writer.print("<script>alert('新增成功');location.href='findAllAir'</script>");
            }else{
                writer.print("<script>alert('新增失败');location.href='selectAddDis'</script>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("updateSelect")
    public String updateSelect(int id,ModelMap map){
        Airqualityindex airqualityindex = airqualityindexService.selectByPrimaryKey(id);
        List<District> districtList = districtService.findAllDis();
        map.addAttribute("disList",districtList);
        map.addAttribute("air",airqualityindex);
        return "update";
    }

    @RequestMapping("updateAir")
    public void updateAir(Airqualityindex airqualityindex,HttpServletResponse response){
        int k = airqualityindexService.updateByPrimaryKeySelective(airqualityindex);
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter writer = response.getWriter();
            if(k>0){
                writer.print("<script>alert('修改成功');location.href='findAllAir'</script>");
            }else{
                writer.print("<script>alert('修改失败');location.href='updateSelect?id="+airqualityindex.getId()+"'</script>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("deleteAir")
    public void deleteAir(int id,HttpServletResponse response){
        int k = airqualityindexService.deleteByPrimaryKey(id);
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter writer = response.getWriter();
            if(k>0){
                writer.print("<script>alert('删除成功');location.href='findAllAir'</script>");
            }else{
                writer.print("<script>alert('删除失败');location.href='findAllAir'</script>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
