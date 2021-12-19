package com.p2082ss.ttm.player;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.ttm.player.AVDrmCreater */
public class AVDrmCreater {
    static {
        Covode.recordClassIndex(101382);
    }

    public static synchronized long createDrm(int i) {
        synchronized (AVDrmCreater.class) {
            MethodCollector.m26663i(9678);
            if (i == 1) {
                long a = m148223a("com.ss.ttm.drm.intertrust.IntertrustDrm");
                MethodCollector.m26664o(9678);
                return a;
            }
            MethodCollector.m26664o(9678);
            return 0;
        }
    }

    /* renamed from: a */
    private static long m148223a(String str) {
        Class<?> cls;
        ClassLoader a;
        try {
            if (C86286v.f192744a == null || (a = C86286v.f192744a.mo136807a()) == null) {
                cls = Class.forName(str);
            } else {
                cls = Class.forName(str, true, a);
            }
            return Long.parseLong(String.valueOf(cls.getMethod("createDrm", new Class[0]).invoke(null, new Object[0])));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
