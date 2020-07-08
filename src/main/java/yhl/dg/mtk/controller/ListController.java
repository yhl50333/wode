package yhl.dg.mtk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yhl.dg.mtk.dao.ListDao;
import yhl.dg.mtk.pojo.Activity;
import yhl.dg.mtk.service.ListService;

import java.util.List;

@Controller
public class ListController {
    @Autowired
    ListDao  listDao;
    @Autowired
    ListService listService;
    @RequestMapping("find")
    public String ListFindAll(Model model){
        List<Activity> list = listDao.findAll();
        model.addAttribute("list",list);
        return "accye";
    }
    @RequestMapping("doDeleteById")
    public String doDeleteById(int id){
        listDao.deleteById(id);
        return "forward:find";
    }
    @RequestMapping("doFindById")
    public String doLoadById(int id,Model model){
        Activity aty = listDao.findById(id);
        model.addAttribute("aty", aty);
        return "forward:find";
    }
    @RequestMapping("doSaveActivity")
    public String doSaveActivity(Activity activity){
        listService.doSaveActivity(activity);
        return "redirect:find";
    }

}
