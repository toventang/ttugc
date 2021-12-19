package com.bytedance.ies.powerlist.page;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17714i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.page.h */
public final class C17712h {

    /* renamed from: c */
    public static final C17712h f42360c = new C17712h(new AbstractC17714i.C17719e(EnumC17699e.Refresh, (byte) 0), new C17681a());

    /* renamed from: d */
    public static final C17713a f42361d = new C17713a((byte) 0);

    /* renamed from: a */
    public final AbstractC17714i f42362a;

    /* renamed from: b */
    public final C17681a f42363b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17712h)) {
            return false;
        }
        C17712h hVar = (C17712h) obj;
        return C89219l.m154714a(this.f42362a, hVar.f42362a) && C89219l.m154714a(this.f42363b, hVar.f42363b);
    }

    public final int hashCode() {
        AbstractC17714i iVar = this.f42362a;
        int i = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        C17681a aVar = this.f42363b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PowerPageData(event=" + this.f42362a + ", state=" + this.f42363b + ")";
    }

    /* renamed from: com.bytedance.ies.powerlist.page.h$a */
    public static final class C17713a {
        static {
            Covode.recordClassIndex(20273);
        }

        private C17713a() {
        }

        public /* synthetic */ C17713a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(20272);
    }

    public C17712h(AbstractC17714i iVar, C17681a aVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(aVar, "");
        this.f42362a = iVar;
        this.f42363b = aVar;
    }
}
