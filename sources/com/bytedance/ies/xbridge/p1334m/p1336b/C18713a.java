package com.bytedance.ies.xbridge.p1334m.p1336b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18701a;
import com.bytedance.ies.xbridge.p1334m.p1337c.C18718a;
import com.bytedance.ies.xbridge.p1334m.p1338d.C18728a;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.m.b.a */
public final class C18713a extends AbstractC18701a {
    static {
        Covode.recordClassIndex(21407);
    }

    @Override // com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18701a
    /* renamed from: a */
    public final void mo29740a(C18752c cVar, AbstractC18701a.AbstractC18702a aVar, EnumC18483e eVar) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar.mo29742a("Context not provided in host");
            return;
        }
        Set<String> a = C18728a.m34765a(context).mo29434a();
        C18718a aVar2 = new C18718a();
        aVar2.f44501a = C89070n.m154590j(a);
        aVar.mo29741a(aVar2, "");
    }
}
