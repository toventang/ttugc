package com.benchmark.collection;

import com.bytedance.covode.number.Covode;

/* renamed from: com.benchmark.collection.e */
public final class C2457e {

    /* renamed from: a */
    public boolean f7372a;

    /* renamed from: b */
    public int f7373b;

    /* renamed from: c */
    public EnumC2459b f7374c;

    /* renamed from: d */
    public boolean f7375d;

    /* renamed from: com.benchmark.collection.e$a */
    public static class C2458a {

        /* renamed from: a */
        public boolean f7376a;

        /* renamed from: b */
        public int f7377b = 38;

        /* renamed from: c */
        public EnumC2459b f7378c = EnumC2459b.APPLOG;

        /* renamed from: d */
        public boolean f7379d = true;

        static {
            Covode.recordClassIndex(2811);
        }
    }

    static {
        Covode.recordClassIndex(2810);
    }

    /* renamed from: com.benchmark.collection.e$b */
    public enum EnumC2459b {
        APPLOG,
        FAAS_API;

        static {
            Covode.recordClassIndex(2812);
        }
    }

    public C2457e(C2458a aVar) {
        this.f7372a = aVar.f7376a;
        this.f7373b = aVar.f7377b;
        this.f7374c = aVar.f7378c;
        this.f7375d = aVar.f7379d;
    }
}
