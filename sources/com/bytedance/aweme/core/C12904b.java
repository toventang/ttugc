package com.bytedance.aweme.core;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.aweme.core.b */
public final class C12904b {

    /* renamed from: a */
    public EnumC12906b f31421a;

    /* renamed from: b */
    public int f31422b;

    static {
        Covode.recordClassIndex(14738);
    }

    /* renamed from: com.bytedance.aweme.core.b$a */
    public static class C12905a {

        /* renamed from: a */
        public EnumC12906b f31423a = EnumC12906b.CLOSE;

        /* renamed from: b */
        public int f31424b = 30;

        static {
            Covode.recordClassIndex(14739);
        }

        /* renamed from: a */
        public final C12904b mo20733a() {
            return new C12904b(this);
        }
    }

    /* renamed from: a */
    public static C12904b m23149a() {
        return new C12905a().mo20733a();
    }

    /* renamed from: com.bytedance.aweme.core.b$b */
    public enum EnumC12906b {
        CLOSE,
        COMMIT;

        static {
            Covode.recordClassIndex(14740);
        }
    }

    C12904b(C12905a aVar) {
        this.f31421a = aVar.f31423a;
        this.f31422b = aVar.f31424b;
    }
}
