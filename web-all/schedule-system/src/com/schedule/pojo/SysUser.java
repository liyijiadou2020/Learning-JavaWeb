package com.schedule.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author: liyijia
 * @version: 0.0
 * @create time: 2024-01-2024/1/24
 * @description: sys_user 表格的实体类
 *
 * @规范：
 *  1. 实体类的类名与表格的名称应该一一对应（对应不是一致
 *  2. 实体类的熟悉名和表格的列名应该对应
 *  3. 每个属性都是私有的
 *  4. 每个属性都需要有 getter setter
 *  5. 必须具有无参构造器
 *  6. 应该实现序列化接口
 *  7. 应该重新类的 hashcode 和 equals 方法
 *  8. toString 不要求重写
 *
 *  可以使用 lombok 处理 getter、setter、equals、hashcode、equals、hashcode
 *  Lombok 使用步骤：
 *  1. IDEA 安装 Lombok 插件 （2022版会自动安装）
 *  2. 是否勾选了 enable annotation processing
 *  3. 导入注解Lombok的依赖，在实体类上添加注释
 */

@AllArgsConstructor // 添加了全参构造
@NoArgsConstructor
@Data // @Data 就相当于：@Getter + @Setter + @EqualsAndHashCode + @ToString
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;

}
