package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.e */
public final class C38234e {

    /* renamed from: a */
    public final String f90341a;

    /* renamed from: b */
    public final boolean f90342b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.e$a */
    public static final class C38235a {

        /* renamed from: a */
        public String f90343a = "";

        /* renamed from: b */
        public boolean f90344b = true;

        static {
            Covode.recordClassIndex(45719);
        }
    }

    static {
        Covode.recordClassIndex(45718);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38234e)) {
            return false;
        }
        C38234e eVar = (C38234e) obj;
        return C89219l.m154714a(this.f90341a, eVar.f90341a) && this.f90342b == eVar.f90342b;
    }

    public final int hashCode() {
        String str = this.f90341a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f90342b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "AdHalfWebPageHideParams(clickFrom=" + this.f90341a + ", needLog=" + this.f90342b + ")";
    }

    private C38234e(String str, boolean z) {
        this.f90341a = str;
        this.f90342b = z;
    }

    public /* synthetic */ C38234e(String str, boolean z, byte b) {
        this(str, z);
    }
}
