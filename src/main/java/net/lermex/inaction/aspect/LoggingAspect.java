package net.lermex.inaction.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* net.lermex..*.*(..))") //PointCut
    public void log(final JoinPoint point) {
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println(point.getSignature().getName() + " called " + "in class " +point.getTarget().getClass().getName() + " at " + timeStamp);
       // System.out.print(point.getSignature().getName() + " called...");


    }

}
