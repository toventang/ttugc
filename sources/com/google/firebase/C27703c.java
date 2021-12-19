package com.google.firebase;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.firebase.p2010b.AbstractC27701c;
import com.google.firebase.p2012d.AbstractC27738a;
import com.google.firebase.p2013e.C27741a;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.c */
public final /* synthetic */ class C27703c implements AbstractC27738a {

    /* renamed from: a */
    private final C27695b f65118a;

    /* renamed from: b */
    private final Context f65119b;

    static {
        Covode.recordClassIndex(33285);
    }

    C27703c(C27695b bVar, Context context) {
        this.f65118a = bVar;
        this.f65119b = context;
    }

    @Override // com.google.firebase.p2012d.AbstractC27738a
    /* renamed from: a */
    public final Object mo46341a() {
        C27695b bVar = this.f65118a;
        return new C27741a(this.f65119b, bVar.mo46332h(), (AbstractC27701c) bVar.f65103c.mo46348a(AbstractC27701c.class));
    }
}
