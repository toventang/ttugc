package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1375d.p1376a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19180a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.EnumC19189i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a.b */
public final class C19142b {

    /* renamed from: a */
    public static final C19142b f45296a = new C19142b();

    private C19142b() {
    }

    static {
        Covode.recordClassIndex(21905);
    }

    /* renamed from: a */
    public static AbstractC19180a m35683a(EnumC19189i iVar) {
        C89219l.m154719c(iVar, "");
        int i = C19143c.f45297a[iVar.ordinal()];
        if (i == 1) {
            return new C19145e();
        }
        if (i != 2) {
            return new C19144d();
        }
        return new C19141a();
    }
}
