package com.bytedance.ies.xbridge.p1334m.p1336b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18707c;
import com.bytedance.ies.xbridge.p1334m.p1337c.C18724d;
import com.bytedance.ies.xbridge.p1334m.p1338d.C18728a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.m.b.c */
public final class C18715c extends AbstractC18707c {
    static {
        Covode.recordClassIndex(21409);
    }

    @Override // com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18707c
    /* renamed from: a */
    public final void mo29746a(C18724d dVar, AbstractC18707c.AbstractC18708a aVar, EnumC18483e eVar) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar.mo29748a("Context not provided in host");
            return;
        }
        String str = dVar.f44507a;
        if (str == null) {
            C89219l.m154710a("key");
        }
        C18728a.m34765a(context).mo29436b(str);
        aVar.mo29747a(new C18745b(), "");
    }
}
