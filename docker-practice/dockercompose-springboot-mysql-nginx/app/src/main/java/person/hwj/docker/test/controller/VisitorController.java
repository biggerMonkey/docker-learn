package person.hwj.docker.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import person.hwj.docker.test.dao.VisitorRepositoryDao;
import person.hwj.docker.test.entity.Visitor;

/**
 * @author huangwenjun
 * @Date 2018年6月21日
 */
@RestController
public class VisitorController {

    @Autowired
    private VisitorRepositoryDao repository;

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        String ip = request.getRemoteAddr();
        Visitor visitor = repository.findByIp(ip);
        if (visitor == null) {
            visitor = new Visitor();
            visitor.setIp(ip);
            visitor.setTimes(1);
        } else {
            visitor.setTimes(visitor.getTimes() + 1);
        }
        repository.save(visitor);
        return "I have been seen ip " + visitor.getIp() + " " + visitor.getTimes() + " times.";
    }
}
