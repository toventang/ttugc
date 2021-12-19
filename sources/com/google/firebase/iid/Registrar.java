package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.firebase.C27695b;
import com.google.firebase.components.AbstractC27714e;
import com.google.firebase.components.AbstractC27719h;
import com.google.firebase.components.C27710b;
import com.google.firebase.components.C27727n;
import com.google.firebase.iid.p2015a.AbstractC27755a;
import com.google.firebase.installations.AbstractC27845g;
import com.google.firebase.p2010b.AbstractC27702d;
import com.google.firebase.p2011c.AbstractC27706c;
import com.google.firebase.p2014f.AbstractC27749h;
import com.google.firebase.p2014f.C27748g;
import java.util.Arrays;
import java.util.List;

public final class Registrar implements AbstractC27719h {
    static {
        Covode.recordClassIndex(33340);
    }

    @Override // com.google.firebase.components.AbstractC27719h
    public final List<C27710b<?>> getComponents() {
        return Arrays.asList(C27710b.m55404a(FirebaseInstanceId.class).mo46356a(C27727n.m55442a(C27695b.class)).mo46356a(C27727n.m55442a(AbstractC27702d.class)).mo46356a(C27727n.m55442a(AbstractC27749h.class)).mo46356a(C27727n.m55442a(AbstractC27706c.class)).mo46356a(C27727n.m55442a(AbstractC27845g.class)).mo46355a(C27761af.f65229a).mo46354a(1).mo46357a(), C27710b.m55404a(AbstractC27755a.class).mo46356a(C27727n.m55442a(FirebaseInstanceId.class)).mo46355a(C27762ag.f65230a).mo46357a(), C27748g.m55473a("fire-iid", "20.2.3"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.iid.Registrar$a */
    public static class C27753a implements AbstractC27755a {

        /* renamed from: a */
        final FirebaseInstanceId f65217a;

        static {
            Covode.recordClassIndex(33341);
        }

        public C27753a(FirebaseInstanceId firebaseInstanceId) {
            this.f65217a = firebaseInstanceId;
        }
    }

    static final /* synthetic */ AbstractC27755a lambda$getComponents$1$Registrar(AbstractC27714e eVar) {
        return new C27753a((FirebaseInstanceId) eVar.mo46348a(FirebaseInstanceId.class));
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(AbstractC27714e eVar) {
        return new FirebaseInstanceId((C27695b) eVar.mo46348a(C27695b.class), (AbstractC27702d) eVar.mo46348a(AbstractC27702d.class), (AbstractC27749h) eVar.mo46348a(AbstractC27749h.class), (AbstractC27706c) eVar.mo46348a(AbstractC27706c.class), (AbstractC27845g) eVar.mo46348a(AbstractC27845g.class));
    }
}
