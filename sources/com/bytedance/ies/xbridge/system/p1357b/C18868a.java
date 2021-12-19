package com.bytedance.ies.xbridge.system.p1357b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1349o.C18806a;
import com.bytedance.ies.xbridge.system.p1356a.AbstractC18843a;
import com.bytedance.ies.xbridge.system.p1361c.C18894a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.b.a */
public final class C18868a extends AbstractC18843a {
    static {
        Covode.recordClassIndex(21578);
    }

    @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18843a
    /* renamed from: a */
    public final void mo29829a(C18894a aVar, AbstractC18843a.AbstractC18844a aVar2, EnumC18483e eVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(eVar, "");
        if (!aVar.f44732a) {
            Activity a = C18806a.m34902a((Context) mo29616a(Context.class));
            if (a == null) {
                aVar2.mo29831a("context can not convert to activity");
                return;
            }
            a.getWindow().addFlags(8192);
        }
        aVar2.mo29830a(new C18745b(), "");
    }
}
