package com.joe.mall.tiny.service;

import com.joe.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Classname PmsBrandService
 * @Description
 * @Date 2019/8/22 14:30
 * @Created by maqiao-001
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
