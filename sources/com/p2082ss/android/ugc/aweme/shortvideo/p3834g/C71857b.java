package com.p2082ss.android.ugc.aweme.shortvideo.p3834g;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.g.b */
public final class C71857b {

    /* renamed from: e */
    public static final C71858a f161032e = new C71858a((byte) 0);

    /* renamed from: a */
    public final String f161033a;

    /* renamed from: b */
    public final int f161034b;

    /* renamed from: c */
    public final int f161035c;

    /* renamed from: d */
    public final AbstractC89171a<C89391z> f161036d;

    static {
        Covode.recordClassIndex(84406);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71857b)) {
            return false;
        }
        C71857b bVar = (C71857b) obj;
        return C89219l.m154714a(this.f161033a, bVar.f161033a) && this.f161034b == bVar.f161034b && this.f161035c == bVar.f161035c && C89219l.m154714a(this.f161036d, bVar.f161036d);
    }

    public final int hashCode() {
        String str = this.f161033a;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f161034b) * 31) + this.f161035c) * 31;
        AbstractC89171a<C89391z> aVar = this.f161036d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BubbleViewData(key=" + this.f161033a + ", times=" + this.f161034b + ", priority=" + this.f161035c + ", show=" + this.f161036d + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.g.b$a */
    public static final class C71858a {
        static {
            Covode.recordClassIndex(84407);
        }

        private C71858a() {
        }

        public /* synthetic */ C71858a(byte b) {
            this();
        }
    }

    private C71857b(String str, int i, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        this.f161033a = str;
        this.f161034b = 1;
        this.f161035c = i;
        this.f161036d = aVar;
    }

    public /* synthetic */ C71857b(String str, int i, AbstractC89171a aVar, byte b) {
        this(str, i, aVar);
    }
}
