package com.p084a.p088b;

import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.AbstractC21524b;

/* renamed from: com.a.b.d */
public final class C1873d {

    /* renamed from: a */
    public AbstractC21524b f5680a;

    /* renamed from: b */
    public int f5681b;

    /* renamed from: c */
    public boolean f5682c;

    /* renamed from: d */
    public boolean f5683d;

    /* renamed from: e */
    public boolean f5684e;

    /* renamed from: f */
    public boolean f5685f;

    /* renamed from: g */
    public boolean f5686g;

    /* renamed from: h */
    private int f5687h;

    /* renamed from: com.a.b.d$a */
    public static class C1874a {

        /* renamed from: a */
        public AbstractC21524b f5688a;

        /* renamed from: b */
        public int f5689b = 1;

        /* renamed from: c */
        public int f5690c;

        /* renamed from: d */
        public boolean f5691d = true;

        /* renamed from: e */
        public boolean f5692e = true;

        /* renamed from: f */
        public boolean f5693f = true;

        /* renamed from: g */
        public boolean f5694g = true;

        /* renamed from: h */
        public boolean f5695h = true;

        static {
            Covode.recordClassIndex(2044);
        }
    }

    static {
        Covode.recordClassIndex(2043);
    }

    /* renamed from: a */
    public final int mo5579a() {
        int i = this.f5687h;
        if (i != 0) {
            return i;
        }
        throw new IllegalStateException("themeID not set");
    }

    public C1873d(C1874a aVar) {
        this.f5680a = aVar.f5688a;
        this.f5681b = aVar.f5689b;
        this.f5687h = aVar.f5690c;
        this.f5682c = aVar.f5691d;
        this.f5683d = aVar.f5692e;
        this.f5684e = aVar.f5693f;
        this.f5685f = aVar.f5694g;
        this.f5686g = aVar.f5695h;
    }
}
