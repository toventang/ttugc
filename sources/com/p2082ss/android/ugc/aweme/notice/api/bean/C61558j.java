package com.p2082ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.j */
public final class C61558j {

    /* renamed from: a */
    public EnumC61551c f139729a;

    /* renamed from: b */
    public EnumC61563o f139730b;

    static {
        Covode.recordClassIndex(72233);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61558j)) {
            return false;
        }
        C61558j jVar = (C61558j) obj;
        return C89219l.m154714a(this.f139729a, jVar.f139729a) && C89219l.m154714a(this.f139730b, jVar.f139730b);
    }

    public final int hashCode() {
        EnumC61551c cVar = this.f139729a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        EnumC61563o oVar = this.f139730b;
        if (oVar != null) {
            i = oVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "NoticeGroupAttrs(clearOccasion=" + this.f139729a + ", showType=" + this.f139730b + ")";
    }

    private /* synthetic */ C61558j() {
        this(EnumC61551c.Normal, EnumC61563o.ShowDefault);
    }

    public C61558j(EnumC61551c cVar, EnumC61563o oVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(oVar, "");
        this.f139729a = cVar;
        this.f139730b = oVar;
    }
}
