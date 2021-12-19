package com.google.firebase.datatransport;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.AbstractC25114g;
import com.google.android.datatransport.C25068b;
import com.google.android.datatransport.cct.C25070a;
import com.google.android.datatransport.runtime.AbstractC25155f;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.C25164l;
import com.google.android.datatransport.runtime.C25168p;
import com.google.firebase.components.AbstractC27714e;
import com.google.firebase.components.AbstractC27719h;
import com.google.firebase.components.C27710b;
import com.google.firebase.components.C27727n;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class TransportRegistrar implements AbstractC27719h {
    static {
        Covode.recordClassIndex(33322);
    }

    @Override // com.google.firebase.components.AbstractC27719h
    public List<C27710b<?>> getComponents() {
        return Collections.singletonList(C27710b.m55404a(AbstractC25114g.class).mo46356a(C27727n.m55442a(Context.class)).mo46355a(C27739a.f65177a).mo46357a());
    }

    static /* synthetic */ AbstractC25114g lambda$getComponents$0(AbstractC27714e eVar) {
        Set singleton;
        C25168p.m48273a((Context) eVar.mo46348a(Context.class));
        C25168p a = C25168p.m48272a();
        C25070a aVar = C25070a.f59451e;
        if (aVar instanceof AbstractC25155f) {
            singleton = Collections.unmodifiableSet(aVar.mo40995c());
        } else {
            singleton = Collections.singleton(C25068b.m48045a("proto"));
        }
        return new C25164l(singleton, AbstractC25162k.m48261d().mo41125a(aVar.mo40993a()).mo41126a(aVar.mo40994b()).mo41127a(), a);
    }
}
