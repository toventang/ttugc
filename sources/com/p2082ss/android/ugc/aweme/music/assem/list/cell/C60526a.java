package com.p2082ss.android.ugc.aweme.music.assem.list.cell;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.a */
public final class C60526a {

    /* renamed from: a */
    public final PowerList f137731a;

    /* renamed from: b */
    public final AbstractC39063h.AbstractC39067a f137732b;

    static {
        Covode.recordClassIndex(71078);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60526a)) {
            return false;
        }
        C60526a aVar = (C60526a) obj;
        return C89219l.m154714a(this.f137731a, aVar.f137731a) && C89219l.m154714a(this.f137732b, aVar.f137732b);
    }

    public final int hashCode() {
        PowerList powerList = this.f137731a;
        int i = 0;
        int hashCode = (powerList != null ? powerList.hashCode() : 0) * 31;
        AbstractC39063h.AbstractC39067a aVar = this.f137732b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FooterItem(list=" + this.f137731a + ", listener=" + this.f137732b + ")";
    }

    public C60526a(PowerList powerList, AbstractC39063h.AbstractC39067a aVar) {
        C89219l.m154721d(powerList, "");
        C89219l.m154721d(aVar, "");
        this.f137731a = powerList;
        this.f137732b = aVar;
    }
}
