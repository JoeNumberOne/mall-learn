package com.joe.mall.tiny.service;

import com.joe.mall.tiny.common.api.CommonResult;

/**
 * @Classname UmsMemberService
 * @Description 会员管理Service
 * @Date 2019/8/23 10:48
 * @Created by maqiao-001
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
