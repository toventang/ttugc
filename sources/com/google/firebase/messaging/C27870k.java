package com.google.firebase.messaging;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.firebase.p2008a.AbstractC27682d;
import com.google.firebase.p2008a.AbstractC27683e;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.k */
public final class C27870k {

    /* renamed from: a */
    public final String f65453a;

    /* renamed from: b */
    public final Intent f65454b;

    static {
        Covode.recordClassIndex(33463);
    }

    /* renamed from: com.google.firebase.messaging.k$a */
    static class C27871a implements AbstractC27682d<C27870k> {
        static {
            Covode.recordClassIndex(33464);
        }

        C27871a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00de  */
        @Override // com.google.firebase.p2008a.AbstractC27680b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo41005a(java.lang.Object r6, com.google.firebase.p2008a.AbstractC27683e r7) {
            /*
            // Method dump skipped, instructions count: 289
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C27870k.C27871a.mo41005a(java.lang.Object, java.lang.Object):void");
        }
    }

    /* renamed from: com.google.firebase.messaging.k$c */
    static final class C27873c implements AbstractC27682d<C27872b> {
        static {
            Covode.recordClassIndex(33466);
        }

        C27873c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.google.firebase.p2008a.AbstractC27680b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo41005a(Object obj, AbstractC27683e eVar) {
            eVar.mo46305a("messaging_client_event", ((C27872b) obj).f65455a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.k$b */
    public static final class C27872b {

        /* renamed from: a */
        public final C27870k f65455a;

        static {
            Covode.recordClassIndex(33465);
        }

        C27872b(C27870k kVar) {
            this.f65455a = (C27870k) C25565r.m49314a(kVar);
        }
    }

    C27870k(String str, Intent intent) {
        this.f65453a = C25565r.m49317a(str, (Object) "evenType must be non-null");
        this.f65454b = (Intent) C25565r.m49315a(intent, "intent must be non-null");
    }
}
