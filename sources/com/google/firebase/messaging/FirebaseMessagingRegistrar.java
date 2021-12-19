package com.google.firebase.messaging;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.AbstractC25069c;
import com.google.android.datatransport.AbstractC25112e;
import com.google.android.datatransport.AbstractC25113f;
import com.google.android.datatransport.AbstractC25114g;
import com.google.android.datatransport.C25068b;
import com.google.android.datatransport.cct.C25070a;
import com.google.firebase.C27695b;
import com.google.firebase.components.AbstractC27714e;
import com.google.firebase.components.AbstractC27719h;
import com.google.firebase.components.C27710b;
import com.google.firebase.components.C27727n;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.AbstractC27845g;
import com.google.firebase.p2011c.AbstractC27706c;
import com.google.firebase.p2014f.AbstractC27749h;
import com.google.firebase.p2014f.C27748g;
import java.util.Arrays;
import java.util.List;

public class FirebaseMessagingRegistrar implements AbstractC27719h {
    static {
        Covode.recordClassIndex(33445);
    }

    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$a */
    static class C27855a<T> implements AbstractC25113f<T> {
        static {
            Covode.recordClassIndex(33446);
        }

        @Override // com.google.android.datatransport.AbstractC25113f
        /* renamed from: a */
        public final void mo41062a(AbstractC25069c<T> cVar) {
        }

        private C27855a() {
        }

        /* synthetic */ C27855a(byte b) {
            this();
        }
    }

    @Override // com.google.firebase.components.AbstractC27719h
    public List<C27710b<?>> getComponents() {
        return Arrays.asList(C27710b.m55404a(FirebaseMessaging.class).mo46356a(C27727n.m55442a(C27695b.class)).mo46356a(C27727n.m55442a(FirebaseInstanceId.class)).mo46356a(C27727n.m55442a(AbstractC27749h.class)).mo46356a(C27727n.m55442a(AbstractC27706c.class)).mo46356a(new C27727n(AbstractC25114g.class, 0)).mo46356a(C27727n.m55442a(AbstractC27845g.class)).mo46355a(C27868i.f65451a).mo46354a(1).mo46357a(), C27748g.m55473a("fire-fcm", "20.2.3"));
    }

    static AbstractC25114g determineFactory(AbstractC25114g gVar) {
        if (gVar == null || !C25070a.f59449c.contains(C25068b.m48045a("json"))) {
            return new C27856b();
        }
        return gVar;
    }

    static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(AbstractC27714e eVar) {
        return new FirebaseMessaging((C27695b) eVar.mo46348a(C27695b.class), (FirebaseInstanceId) eVar.mo46348a(FirebaseInstanceId.class), (AbstractC27749h) eVar.mo46348a(AbstractC27749h.class), (AbstractC27706c) eVar.mo46348a(AbstractC27706c.class), (AbstractC27845g) eVar.mo46348a(AbstractC27845g.class), determineFactory((AbstractC25114g) eVar.mo46348a(AbstractC25114g.class)));
    }

    /* renamed from: com.google.firebase.messaging.FirebaseMessagingRegistrar$b */
    public static class C27856b implements AbstractC25114g {
        static {
            Covode.recordClassIndex(33447);
        }

        @Override // com.google.android.datatransport.AbstractC25114g
        /* renamed from: a */
        public final <T> AbstractC25113f<T> mo41063a(String str, C25068b bVar, AbstractC25112e<T, byte[]> eVar) {
            return new C27855a((byte) 0);
        }
    }
}
