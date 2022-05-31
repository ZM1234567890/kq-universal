package com.kqinfo.universal.workflow.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 流程实例
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
@TableName("tbl_process_instance")
@ApiModel(value = "ProcessInstance对象", description = "流程实例")
public class ProcessInstance implements Serializable {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.ASSIGN_ID)
	private Long id;

	@ApiModelProperty(value = "流程名称")
	private String name;

	@ApiModelProperty(value = "页面跳转地址")
	private String callUri;

	@ApiModelProperty(value = "流程定义id")
	private Long processId;

	@ApiModelProperty(value = "业务id")
	private String businessId;

	@ApiModelProperty(value = "流程发起人")
	private String creator;

	@ApiModelProperty(value = "流程变量")
	private String variable;

	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private LocalDateTime createTime;

	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private LocalDateTime updateTime;

}