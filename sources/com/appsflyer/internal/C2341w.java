package com.appsflyer.internal;

import com.C1764a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.appsflyer.internal.w */
public final class C2341w {

    /* renamed from: Ι */
    private boolean f7109;

    /* renamed from: ι */
    public String f7110;

    static {
        Covode.recordClassIndex(2613);
    }

    /* renamed from: ɩ */
    public final boolean mo6490() {
        return this.f7109;
    }

    /* renamed from: com.appsflyer.internal.w$e */
    enum EnumC2342e {
        GOOGLE(0),
        AMAZON(1);
        

        /* renamed from: Ι */
        private int f7114;

        public final String toString() {
            return String.valueOf(this.f7114);
        }

        static {
            Covode.recordClassIndex(2614);
        }

        private EnumC2342e(int i) {
            this.f7114 = i;
        }
    }

    public final String toString() {
        return C1764a.m5928a("%s,%s", new Object[]{this.f7110, Boolean.valueOf(this.f7109)});
    }

    C2341w(String str, boolean z) {
        this.f7110 = str;
        this.f7109 = z;
    }
}
