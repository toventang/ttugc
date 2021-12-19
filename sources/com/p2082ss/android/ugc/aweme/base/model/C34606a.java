package com.p2082ss.android.ugc.aweme.base.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.base.model.a */
public final class C34606a {

    /* renamed from: a */
    public EnumC34607a f81662a;

    /* renamed from: b */
    public Object f81663b;

    static {
        Covode.recordClassIndex(41570);
    }

    /* renamed from: a */
    public final int mo61082a() {
        Object obj = this.f81663b;
        if (obj == null) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.base.model.a$a */
    public enum EnumC34607a {
        RES_ID,
        URL,
        URL_MODEL;

        static {
            Covode.recordClassIndex(41571);
        }
    }

    /* renamed from: a */
    public static C34606a m70656a(int i) {
        return new C34606a(EnumC34607a.RES_ID, Integer.valueOf(i));
    }

    private C34606a(EnumC34607a aVar, Object obj) {
        this.f81662a = aVar;
        this.f81663b = obj;
    }
}
