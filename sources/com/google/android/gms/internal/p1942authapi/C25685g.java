package com.google.android.gms.internal.p1942authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.internal.AbstractC25464o;
import com.google.android.gms.common.internal.AbstractC25526c;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.p1940d.C25632i;

/* renamed from: com.google.android.gms.internal.auth-api.g */
final /* synthetic */ class C25685g implements AbstractC25464o {

    /* renamed from: a */
    private final C25683e f60817a;

    /* renamed from: b */
    private final BeginSignInRequest f60818b;

    static {
        Covode.recordClassIndex(31099);
    }

    C25685g(C25683e eVar, BeginSignInRequest beginSignInRequest) {
        this.f60817a = eVar;
        this.f60818b = beginSignInRequest;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25464o
    /* renamed from: a */
    public final void mo41714a(Object obj, Object obj2) {
        BeginSignInRequest beginSignInRequest = this.f60818b;
        ((AbstractC25681c) ((AbstractC25526c) obj).mo41794q()).mo41933a(new BinderC25688j((C25632i) obj2), (BeginSignInRequest) C25565r.m49314a(beginSignInRequest));
    }
}
