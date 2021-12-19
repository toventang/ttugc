package com.p2082ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1542m.C21411c;
import com.bytedance.p1542m.p1544b.C21409a;
import com.google.android.play.core.p1966e.C26993a;
import com.google.android.play.core.tasks.AbstractC27059a;
import com.google.android.play.core.tasks.AbstractC27072n;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.e */
public final /* synthetic */ class C31325e implements AbstractC27059a {

    /* renamed from: a */
    private final C31310a f75048a;

    /* renamed from: b */
    private final AbstractC31339n f75049b;

    /* renamed from: c */
    private final String f75050c;

    static {
        Covode.recordClassIndex(38025);
    }

    C31325e(C31310a aVar, AbstractC31339n nVar, String str) {
        this.f75048a = aVar;
        this.f75049b = nVar;
        this.f75050c = str;
    }

    @Override // com.google.android.play.core.tasks.AbstractC27059a
    /* renamed from: a */
    public final void mo35008a(Exception exc) {
        C31310a aVar = this.f75048a;
        AbstractC31339n nVar = this.f75049b;
        String str = this.f75050c;
        AbstractC31333m<?> b = aVar.mo57317b(nVar.f75088l);
        if (b != null) {
            C21409a aVar2 = new C21409a(str, C21411c.f50799c.mo35000b(), 6);
            if (exc instanceof C26993a) {
                aVar2.f50794g = ((AbstractC27072n) exc).getErrorCode();
            } else {
                aVar2.f50794g = 1;
            }
            aVar2.f50796i = exc;
            C1731i.m5640b(new CallableC31331k(b, aVar2), C1731i.f5562a);
        }
    }
}
