package com.dao;

import com.entity.FufeijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FufeijiluView;

/**
 * 付费记录 Dao 接口
 *
 * @author 
 */
public interface FufeijiluDao extends BaseMapper<FufeijiluEntity> {

   List<FufeijiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
