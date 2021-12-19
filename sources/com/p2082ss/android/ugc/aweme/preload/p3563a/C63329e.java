package com.p2082ss.android.ugc.aweme.preload.p3563a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.preload.a.e */
public final class C63329e {

    /* renamed from: f */
    public static final C63331b f143731f = new C63331b((byte) 0);

    /* renamed from: a */
    public String f143732a;

    /* renamed from: b */
    public int f143733b;

    /* renamed from: c */
    public int f143734c;

    /* renamed from: d */
    public long f143735d;

    /* renamed from: e */
    public Aweme f143736e;

    static {
        Covode.recordClassIndex(74612);
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.a.e$b */
    public static final class C63331b {
        static {
            Covode.recordClassIndex(74614);
        }

        private C63331b() {
        }

        public /* synthetic */ C63331b(byte b) {
            this();
        }

        /* renamed from: a */
        public static C63329e m114821a(String str) {
            C63330a aVar = new C63330a();
            aVar.f143737a = str;
            aVar.f143738b = -1;
            aVar.f143739c = 7;
            aVar.f143740d = System.currentTimeMillis();
            return aVar.mo101919a();
        }

        /* renamed from: a */
        public static C63329e m114822a(String str, int i) {
            C63330a aVar = new C63330a();
            aVar.f143737a = str;
            aVar.f143738b = i;
            aVar.f143739c = 5;
            aVar.f143740d = System.currentTimeMillis();
            return aVar.mo101919a();
        }
    }

    public C63329e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.a.e$a */
    public static final class C63330a {

        /* renamed from: a */
        public String f143737a;

        /* renamed from: b */
        public int f143738b;

        /* renamed from: c */
        public int f143739c;

        /* renamed from: d */
        public long f143740d;

        /* renamed from: e */
        public Aweme f143741e;

        static {
            Covode.recordClassIndex(74613);
        }

        /* renamed from: a */
        public final C63329e mo101919a() {
            return new C63329e(this);
        }
    }

    public final int hashCode() {
        int i;
        String str = this.f143732a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + this.f143734c;
    }

    public final String toString() {
        return "RxTaskInfo{name=" + this.f143732a + ", strategy=" + this.f143733b + ", priority=" + this.f143734c + ", time=" + this.f143735d + "}";
    }

    public C63329e(C63330a aVar) {
        C89219l.m154721d(aVar, "");
        this.f143732a = aVar.f143737a;
        this.f143733b = aVar.f143738b;
        this.f143734c = aVar.f143739c;
        this.f143735d = aVar.f143740d;
        this.f143736e = aVar.f143741e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (true ^ C89219l.m154714a(getClass(), obj.getClass()))) {
            return false;
        }
        C63329e eVar = (C63329e) obj;
        if (this.f143734c != eVar.f143734c) {
            return false;
        }
        return C89219l.m154714a((Object) this.f143732a, (Object) eVar.f143732a);
    }
}
