package com.cebon.cdjcy.user.service;

import com.cebon.cdjcy.user.domain.RoleAndMenu;
import com.cebon.cdjcy.common.core.Service;
import com.cebon.cdjcy.common.restResult.PageParam;
import java.util.List;

/**
* @author lirong
* @Description: // TODO 为类添加注释
* @date 2018-11-14 02:17:34
*/
public interface RoleAndMenuService extends Service<RoleAndMenu> {

    /**
     * 根据分页、排序信息和检索条件查询 @size 条 字典表数据
     * @param pageParam 分页参数
     * @param query  查询关键字
     * @return
     */
    List<RoleAndMenu> list(PageParam pageParam, String query);

    /**
     * 批量添加角色对应权限
     * @param roleAndMenuList
     */
    public void addList(List<RoleAndMenu> roleAndMenuList);

    /**
     * 根据角色id删除对应权限
     * @param id 角色id
     */
    public void deleteByRoleId(long id);

}
