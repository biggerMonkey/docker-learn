package person.hwj.docker.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author huangwenjun
 * @Date 2018年6月21日
 */
@Entity
public class Visitor {

    @Id
    private String ip;

    @Column(name = "times")
    private Integer times;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }
}
