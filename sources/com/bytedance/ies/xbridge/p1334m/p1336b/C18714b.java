package com.bytedance.ies.xbridge.p1334m.p1336b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18704b;
import com.bytedance.ies.xbridge.p1334m.p1337c.C18720b;
import com.bytedance.ies.xbridge.p1334m.p1337c.C18722c;
import com.bytedance.ies.xbridge.p1334m.p1338d.C18728a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.m.b.b */
public final class C18714b extends AbstractC18704b {
    static {
        Covode.recordClassIndex(21408);
    }

    @Override // com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18704b
    /* renamed from: a */
    public final void mo29743a(C18720b bVar, AbstractC18704b.AbstractC18705a aVar, EnumC18483e eVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar.mo29745a("Context not provided in host");
            return;
        }
        String str = bVar.f44503a;
        if (str == null) {
            C89219l.m154710a("key");
        }
        Object a = C18728a.m34765a(context).mo29433a(str);
        C18722c cVar = new C18722c();
        cVar.f44505a = a;
        aVar.mo29744a(cVar, "");
    }
}
