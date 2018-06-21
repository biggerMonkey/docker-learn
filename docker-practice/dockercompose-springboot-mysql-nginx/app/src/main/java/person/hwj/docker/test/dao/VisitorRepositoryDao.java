package person.hwj.docker.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import person.hwj.docker.test.entity.Visitor;

/**
 * @author huangwenjun
 * @Date 2018年6月21日
 */
public interface VisitorRepositoryDao extends JpaRepository<Visitor, Long> {

    public Visitor findByIp(String ip);

}
