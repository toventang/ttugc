package com.p2082ss.android.ugc.aweme.discover.lynx.spark.p2785b;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.page.C15593c;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2780b.EnumC42198c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.spark.b.b */
public final class C42275b {

    /* renamed from: a */
    public final String f98488a;

    /* renamed from: b */
    public final C15593c f98489b;

    /* renamed from: c */
    public EnumC42198c f98490c;

    static {
        Covode.recordClassIndex(50217);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42275b)) {
            return false;
        }
        C42275b bVar = (C42275b) obj;
        return C89219l.m154714a(this.f98488a, bVar.f98488a) && C89219l.m154714a(this.f98489b, bVar.f98489b) && C89219l.m154714a(this.f98490c, bVar.f98490c);
    }

    public final int hashCode() {
        String str = this.f98488a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C15593c cVar = this.f98489b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        EnumC42198c cVar2 = this.f98490c;
        if (cVar2 != null) {
            i = cVar2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SparkCache(name=" + this.f98488a + ", sparkView=" + this.f98489b + ", preloadStatus=" + this.f98490c + ")";
    }

    /* renamed from: a */
    public final void mo71467a(EnumC42198c cVar) {
        C89219l.m154721d(cVar, "");
        this.f98490c = cVar;
    }

    public C42275b(String str, C15593c cVar, EnumC42198c cVar2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(cVar2, "");
        this.f98488a = str;
        this.f98489b = cVar;
        this.f98490c = cVar2;
    }
}
