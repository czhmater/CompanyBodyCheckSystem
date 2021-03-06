package team.yingyingmonster.ccbs.service.serviceinterface;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import team.yingyingmonster.ccbs.database.bean.Role;

import java.util.List;

public interface RoleService {
    List<Role> selectAllRole();
    PageInfo<Role> selectRolePage(Integer pageNum, Integer pageSize);
}
