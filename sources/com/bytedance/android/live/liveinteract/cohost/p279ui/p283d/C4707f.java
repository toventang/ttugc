package com.bytedance.android.live.liveinteract.cohost.p279ui.p283d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.d.f */
public final class C4707f {

    /* renamed from: a */
    public String f12437a;

    static {
        Covode.recordClassIndex(5284);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C4707f) && C89219l.m154714a(this.f12437a, ((C4707f) obj).f12437a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f12437a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TitleItem(title=" + this.f12437a + ")";
    }

    /* renamed from: a */
    public final void mo10451a(String str) {
        C89219l.m154721d(str, "");
        this.f12437a = str;
    }

    public C4707f(String str) {
        C89219l.m154721d(str, "");
        this.f12437a = str;
    }
}
