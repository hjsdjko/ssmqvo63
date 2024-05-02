package com.entity.view;

import com.entity.ShixichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实习成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-15 10:18:47
 */
@TableName("shixichengji")
public class ShixichengjiView  extends ShixichengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShixichengjiView(){
	}
 
 	public ShixichengjiView(ShixichengjiEntity shixichengjiEntity){
 	try {
			BeanUtils.copyProperties(this, shixichengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
