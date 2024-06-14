package com.sparta.fifteen.aop;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Slf4j(topic = "log 출력")
@Aspect
@Component
public class LogAop {

    private static final Logger logger = LoggerFactory.getLogger(LogAop.class);

    @Around("execution(* com.sparta.fifteen.controller..*.*(..))")
    public Object afterAllController(ProceedingJoinPoint joinPoint) throws Throwable {
        String requestUrl = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        String httpMethod = joinPoint.getSignature().getName();

        logger.info("Request URL: {}", requestUrl);
        logger.info("HTTP Method: {}", httpMethod);

        Object result = joinPoint.proceed();

        return result;
    }
}