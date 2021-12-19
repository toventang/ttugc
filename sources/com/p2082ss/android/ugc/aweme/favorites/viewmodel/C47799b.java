package com.p2082ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.favorites.api.C47192d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.b */
public final class C47799b {

    /* renamed from: c */
    public static final C47800a f110747c = new C47800a((byte) 0);

    /* renamed from: a */
    public final C47192d f110748a;

    /* renamed from: b */
    public final int f110749b;

    static {
        Covode.recordClassIndex(56425);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47799b)) {
            return false;
        }
        C47799b bVar = (C47799b) obj;
        return C89219l.m154714a(this.f110748a, bVar.f110748a) && this.f110749b == bVar.f110749b;
    }

    public final int hashCode() {
        C47192d dVar = this.f110748a;
        return ((dVar != null ? dVar.hashCode() : 0) * 31) + this.f110749b;
    }

    public final String toString() {
        return "CollectionDetailWithType(detail=" + this.f110748a + ", type=" + this.f110749b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.b$a */
    public static final class C47800a {
        static {
            Covode.recordClassIndex(56426);
        }

        private C47800a() {
        }

        public /* synthetic */ C47800a(byte b) {
            this();
        }
    }

    public C47799b(C47192d dVar, int i) {
        C89219l.m154721d(dVar, "");
        this.f110748a = dVar;
        this.f110749b = i;
    }
}
