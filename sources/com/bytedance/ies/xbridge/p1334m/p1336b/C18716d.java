package com.bytedance.ies.xbridge.p1334m.p1336b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18710d;
import com.bytedance.ies.xbridge.p1334m.p1337c.C18726e;
import com.bytedance.ies.xbridge.p1334m.p1338d.C18728a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.m.b.d */
public final class C18716d extends AbstractC18710d {
    static {
        Covode.recordClassIndex(21410);
    }

    @Override // com.bytedance.ies.xbridge.p1334m.p1335a.AbstractC18710d
    /* renamed from: a */
    public final void mo29749a(C18726e eVar, AbstractC18710d.AbstractC18711a aVar, EnumC18483e eVar2) {
        boolean z;
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar2, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar.mo29750a(0, "Context not provided in host");
            return;
        }
        String str = eVar.f44509a;
        if (str == null) {
            C89219l.m154710a("key");
        }
        AbstractC18659k kVar = eVar.f44510b;
        if (kVar == null) {
            C89219l.m154710a("data");
        }
        switch (C18717e.f44499a[kVar.mo29707a().ordinal()]) {
            case 1:
                z = C18728a.m34765a(context).mo29435a(str, Boolean.valueOf(kVar.mo29708b()));
                break;
            case 2:
                z = C18728a.m34765a(context).mo29435a(str, Integer.valueOf(kVar.mo29710d()));
                break;
            case 3:
                z = C18728a.m34765a(context).mo29435a(str, kVar.mo29711e());
                break;
            case 4:
                z = C18728a.m34765a(context).mo29435a(str, Double.valueOf(kVar.mo29709c()));
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                z = C18728a.m34765a(context).mo29435a(str, kVar.mo29712f());
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                z = C18728a.m34765a(context).mo29435a(str, kVar.mo29713g());
                break;
            default:
                aVar.mo29750a(-3, "Illegal value type");
        }
        if (z) {
            aVar.mo29751a(new C18745b(), "");
            return;
        }
        aVar.mo29750a(-3, "Illegal value type");
    }
}
