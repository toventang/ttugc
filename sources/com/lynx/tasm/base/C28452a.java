package com.lynx.tasm.base;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.base.a */
public final class C28452a {
    static {
        Covode.recordClassIndex(34448);
    }

    /* renamed from: a */
    public static long m56871a() {
        try {
            return ((Long) Class.forName("com.ss.android.agilelogger.ALog").getMethod("getALogSimpleWriteFuncAddr", new Class[0]).invoke(null, new Object[0])).longValue();
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }
}
