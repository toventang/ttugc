package com.p2082ss.android.ttvecamera.p2202k;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttvecamera.k.b */
public final class C30929b {

    /* renamed from: a */
    public AbstractC30928a f74126a;

    /* renamed from: b */
    private boolean f74127b;

    static {
        Covode.recordClassIndex(37554);
    }

    /* renamed from: a */
    public final void mo56036a() {
        if (!this.f74127b) {
            this.f74127b = true;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.k.b$b */
    public enum EnumC30931b {
        UNKNOWN,
        BOOST_CPU,
        RESTORE_CPU;

        static {
            Covode.recordClassIndex(37556);
        }
    }

    /* renamed from: com.ss.android.ttvecamera.k.b$a */
    public static class C30930a {

        /* renamed from: a */
        public EnumC30931b f74128a;

        /* renamed from: b */
        public int f74129b;

        static {
            Covode.recordClassIndex(37555);
        }

        public C30930a(EnumC30931b bVar) {
            this.f74128a = bVar;
        }

        public C30930a(EnumC30931b bVar, int i) {
            this.f74128a = bVar;
            this.f74129b = i;
        }
    }

    /* renamed from: a */
    public final void mo56037a(AbstractC30928a aVar) {
        this.f74127b = false;
        this.f74126a = aVar;
    }
}
