package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.signin.internal.BinderC26549d;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.aj */
final class BinderC25373aj extends BinderC26549d {

    /* renamed from: a */
    private final WeakReference<C25368ae> f60204a;

    static {
        Covode.recordClassIndex(30772);
    }

    BinderC25373aj(C25368ae aeVar) {
        this.f60204a = new WeakReference<>(aeVar);
    }

    @Override // com.google.android.gms.signin.internal.BinderC26549d, com.google.android.gms.signin.internal.AbstractC26548c
    /* renamed from: a */
    public final void mo41580a(zak zak) {
        C25368ae aeVar = this.f60204a.get();
        if (aeVar != null) {
            aeVar.f60175a.mo41600a(new C25376am(aeVar, aeVar, zak));
        }
    }
}
