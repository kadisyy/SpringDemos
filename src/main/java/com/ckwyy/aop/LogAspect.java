package com.ckwyy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.thymeleaf.expression.Arrays;

/**
 * Created by 媛媛 on 2021/5/8.
 */
@Aspect
public class LogAspect {


    @Pointcut("execution(public int com.ckwyy.aop.Comput.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        System.out.println("开始运行,参数 = " + java.util.Arrays.asList(joinPoint.getArgs()));
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinpoint) {
        System.out.println("运行结束,方法名 =" + java.util.Arrays.asList(joinpoint.getSignature().getName()));
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logRet(Object result) {
        System.out.println("运行结束,返回值是 = " + result);
    }


    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("运行异常,异常信息 = " + exception);
    }
}
