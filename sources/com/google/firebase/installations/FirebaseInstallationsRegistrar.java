package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;
import com.google.firebase.C27695b;
import com.google.firebase.components.AbstractC27714e;
import com.google.firebase.components.AbstractC27719h;
import com.google.firebase.components.C27710b;
import com.google.firebase.components.C27727n;
import com.google.firebase.p2011c.AbstractC27706c;
import com.google.firebase.p2014f.AbstractC27749h;
import com.google.firebase.p2014f.C27748g;
import java.util.Arrays;
import java.util.List;

public class FirebaseInstallationsRegistrar implements AbstractC27719h {
    static {
        Covode.recordClassIndex(33406);
    }

    @Override // com.google.firebase.components.AbstractC27719h
    public List<C27710b<?>> getComponents() {
        return Arrays.asList(C27710b.m55404a(AbstractC27845g.class).mo46356a(C27727n.m55442a(C27695b.class)).mo46356a(C27727n.m55442a(AbstractC27706c.class)).mo46356a(C27727n.m55442a(AbstractC27749h.class)).mo46355a(C27848i.f65422a).mo46357a(), C27748g.m55473a("fire-installations", "16.3.2"));
    }

    static /* synthetic */ AbstractC27845g lambda$getComponents$0(AbstractC27714e eVar) {
        return new C27839c((C27695b) eVar.mo46348a(C27695b.class), (AbstractC27749h) eVar.mo46348a(AbstractC27749h.class), (AbstractC27706c) eVar.mo46348a(AbstractC27706c.class));
    }
}
