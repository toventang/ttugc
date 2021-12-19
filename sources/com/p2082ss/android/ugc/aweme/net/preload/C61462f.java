package com.p2082ss.android.ugc.aweme.net.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.p1243b.C17794i;
import com.bytedance.ttnet.p1703d.C22944d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.preload.f */
public final class C61462f extends C22944d {

    /* renamed from: v */
    public boolean f139524v;

    /* renamed from: w */
    public String f139525w;

    /* renamed from: x */
    public final C17794i f139526x;

    static {
        Covode.recordClassIndex(72118);
    }

    private /* synthetic */ C61462f() {
        this(new C17794i(0, null, false, 7));
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("enable:").append(this.f139524v).append("|strategy:[age:").append(this.f139526x.f42470a).append("]|url:");
        String str = this.f139526x.f42472c;
        if (str == null) {
            str = this.f139525w;
        }
        return append.append(str).append('|').toString();
    }

    /* renamed from: a */
    public final void mo99138a(String str) {
        C89219l.m154721d(str, "");
        this.f139525w = str;
    }

    public C61462f(C17794i iVar) {
        C89219l.m154721d(iVar, "");
        this.f139526x = iVar;
        this.f139524v = true;
        this.f139525w = "";
    }
}
