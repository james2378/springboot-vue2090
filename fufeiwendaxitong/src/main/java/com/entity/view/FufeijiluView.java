package com.entity.view;

import com.entity.FufeijiluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 付费记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fufeijilu")
public class FufeijiluView extends FufeijiluEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 forum
			/**
			* 帖子标题
			*/
			private String forumName;
			/**
			* 问题帖子信息 的 用户
			*/
			private Integer forumYonghuId;
			/**
			* 发布内容
			*/
			private String forumContent;
			/**
			* 父id
			*/
			private Integer superIds;
			/**
			* 帖子状态
			*/
			private Integer forumStateTypes;
				/**
				* 帖子状态的值
				*/
				private String forumStateValue;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public FufeijiluView() {

	}

	public FufeijiluView(FufeijiluEntity fufeijiluEntity) {
		try {
			BeanUtils.copyProperties(this, fufeijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set forum

					/**
					* 获取： 帖子标题
					*/
					public String getForumName() {
						return forumName;
					}
					/**
					* 设置： 帖子标题
					*/
					public void setForumName(String forumName) {
						this.forumName = forumName;
					}

					/**
					* 获取：问题帖子信息 的 用户
					*/
					public Integer getForumYonghuId() {
						return forumYonghuId;
					}
					/**
					* 设置：问题帖子信息 的 用户
					*/
					public void setForumYonghuId(Integer forumYonghuId) {
						this.forumYonghuId = forumYonghuId;
					}



					/**
					* 获取： 发布内容
					*/
					public String getForumContent() {
						return forumContent;
					}
					/**
					* 设置： 发布内容
					*/
					public void setForumContent(String forumContent) {
						this.forumContent = forumContent;
					}

					/**
					* 获取： 父id
					*/
					public Integer getSuperIds() {
						return superIds;
					}
					/**
					* 设置： 父id
					*/
					public void setSuperIds(Integer superIds) {
						this.superIds = superIds;
					}

					/**
					* 获取： 帖子状态
					*/
					public Integer getForumStateTypes() {
						return forumStateTypes;
					}
					/**
					* 设置： 帖子状态
					*/
					public void setForumStateTypes(Integer forumStateTypes) {
						this.forumStateTypes = forumStateTypes;
					}


						/**
						* 获取： 帖子状态的值
						*/
						public String getForumStateValue() {
							return forumStateValue;
						}
						/**
						* 设置： 帖子状态的值
						*/
						public void setForumStateValue(String forumStateValue) {
							this.forumStateValue = forumStateValue;
						}










				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
