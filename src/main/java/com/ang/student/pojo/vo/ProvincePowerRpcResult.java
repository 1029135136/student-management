package com.ang.student.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

/**
 * @author: 于昂
 * @date: 2022/8/18
 **/
@Data
public class ProvincePowerRpcResult implements Serializable {
    private boolean success;
    private String errorCode;
    private String errorMsg;
    private Obj obj;

    public static ProvincePowerRpcResult success(String consNo, String dataDate) {
        ProvincePowerRpcResult result = new ProvincePowerRpcResult();
        result.setSuccess(true);
        result.setObj(Obj.fake(consNo, dataDate));
        return result;
    }

    @Data
    public static class Obj implements Serializable {
        private String consNo;
        private String dataDate;
        private String p1;
        private String p2;
        private String p3;
        private String p4;
        private String p5;
        private String p6;
        private String p7;
        private String p8;
        private String p9;
        private String p10;
        private String p11;
        private String p12;
        private String p13;
        private String p14;
        private String p15;
        private String p16;
        private String p17;
        private String p18;
        private String p19;
        private String p20;
        private String p21;
        private String p22;
        private String p23;
        private String p24;
        private String p25;
        private String p26;
        private String p27;
        private String p28;
        private String p29;
        private String p30;
        private String p31;
        private String p32;
        private String p33;
        private String p34;
        private String p35;
        private String p36;
        private String p37;
        private String p38;
        private String p39;
        private String p40;
        private String p41;
        private String p42;
        private String p43;
        private String p44;
        private String p45;
        private String p46;
        private String p47;
        private String p48;
        private String p49;
        private String p50;
        private String p51;
        private String p52;
        private String p53;
        private String p54;
        private String p55;
        private String p56;
        private String p57;
        private String p58;
        private String p59;
        private String p60;
        private String p61;
        private String p62;
        private String p63;
        private String p64;
        private String p65;
        private String p66;
        private String p67;
        private String p68;
        private String p69;
        private String p70;
        private String p71;
        private String p72;
        private String p73;
        private String p74;
        private String p75;
        private String p76;
        private String p77;
        private String p78;
        private String p79;
        private String p80;
        private String p81;
        private String p82;
        private String p83;
        private String p84;
        private String p85;
        private String p86;
        private String p87;
        private String p88;
        private String p89;
        private String p90;
        private String p91;
        private String p92;
        private String p93;
        private String p94;
        private String p95;
        private String p96;

        public static Obj fake(String consNo, String dataDate) {
            Obj result = new Obj();
            Random r = new Random();
            result.setConsNo(consNo);
            result.setDataDate(dataDate);
            for (int i = 1; i <= 96; i++) {
                Class<? extends Obj> resultClass = result.getClass();
                try {
                    resultClass.getMethod("setP" + i, String.class)
                               .invoke(result, String.format("%.4f", r.nextDouble() * 1000));
                } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
            return result;
        }
    }
}
