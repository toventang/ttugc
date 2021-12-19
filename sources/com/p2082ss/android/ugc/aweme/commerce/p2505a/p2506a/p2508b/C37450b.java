package com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2508b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.a.b.b */
public final class C37450b {

    /* renamed from: a */
    public final long f88407a;

    /* renamed from: b */
    public final String f88408b;

    /* renamed from: c */
    public boolean f88409c;

    /* renamed from: d */
    public C37451a f88410d;

    /* renamed from: e */
    public final ArrayList<C37451a> f88411e = new ArrayList<>();

    static {
        Covode.recordClassIndex(44835);
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.a.a.b.b$a */
    public static class C37451a {

        /* renamed from: a */
        public final int f88412a;

        /* renamed from: b */
        public final int f88413b;

        /* renamed from: c */
        public final int f88414c;

        /* renamed from: d */
        public final int f88415d;

        static {
            Covode.recordClassIndex(44836);
        }

        /* renamed from: a */
        public final int mo65163a() {
            return (this.f88415d - this.f88413b) * (this.f88414c - this.f88412a);
        }

        /* renamed from: a */
        public final C37451a mo65164a(C37451a aVar) {
            return new C37451a(Math.max(this.f88412a, aVar.f88412a), Math.max(this.f88413b, aVar.f88413b), Math.min(this.f88414c, aVar.f88414c), Math.min(this.f88415d, aVar.f88415d));
        }

        public C37451a(int i, int i2, int i3, int i4) {
            this.f88412a = i;
            this.f88413b = i2;
            this.f88414c = i3;
            this.f88415d = i4;
        }
    }

    public C37450b(long j, String str) {
        this.f88407a = j;
        this.f88408b = str;
    }
}
