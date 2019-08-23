package com.joe.mall.tiny.dao;

import com.joe.mall.tiny.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname UmsAdminRoleRelationDao
 * @Description 后台用户与角色管理自定义Dao
 * @Date 2019/8/23 14:18
 * @Created by maqiao-001
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
