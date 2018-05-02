package top.liubowen.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标识是否为Protocol定义文件
 * 多个项目时可以用来收集/检测code 防止冲突
 * {start, end} 开区间
 * @author luzj
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ProtocolType {

	short[] value() default {0, Short.MAX_VALUE};
	
}
