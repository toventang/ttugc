package com.google.android.gms.internal.p1942authapi;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.AbstractC25282a;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.C25287f;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.C25351e;
import com.google.android.gms.common.api.C25354h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC25468s;
import com.google.android.gms.common.api.internal.C25450f;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.safeparcel.C25570c;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.google.android.gms.internal.auth-api.e */
public final class C25683e extends C25354h<C25287f> implements AbstractC25282a {

    /* renamed from: i */
    private static final C25335a.C25344g<C25689k> f60813i;

    /* renamed from: j */
    private static final C25335a.AbstractC25336a<C25689k, C25287f> f60814j;

    /* renamed from: k */
    private static final C25335a<C25287f> f60815k;

    static {
        Covode.recordClassIndex(31097);
        C25335a.C25344g<C25689k> gVar = new C25335a.C25344g<>();
        f60813i = gVar;
        C25686h hVar = new C25686h();
        f60814j = hVar;
        f60815k = new C25335a<>("Auth.Api.Identity.SignIn.API", hVar, gVar);
    }

    @Override // com.google.android.gms.auth.api.identity.AbstractC25282a
    /* renamed from: a */
    public final AbstractC25631h<Void> mo41298a() {
        C34822d.m71158a(this.f60118a, "com.google.android.gms.signin", 0).edit().clear().apply();
        for (AbstractC25357i iVar : AbstractC25357i.m48756a()) {
            iVar.mo41530d();
        }
        C25450f.m49080b();
        AbstractC25468s.C25469a a = AbstractC25468s.m49130a();
        a.f60459c = new Feature[]{C25690l.f60823b};
        a.f60457a = new C25684f(this);
        a.f60458b = false;
        return mo41510a(a.mo41715a());
    }

    @Override // com.google.android.gms.auth.api.identity.AbstractC25282a
    /* renamed from: a */
    public final SignInCredential mo41344a(Intent intent) {
        if (intent != null) {
            Status status = (Status) C25570c.m49362a(intent, "status", Status.CREATOR);
            if (status == null) {
                throw new C25351e(Status.f60104e);
            } else if (status.mo41477c()) {
                SignInCredential signInCredential = (SignInCredential) C25570c.m49362a(intent, "sign_in_credential", SignInCredential.CREATOR);
                if (signInCredential != null) {
                    return signInCredential;
                }
                throw new C25351e(Status.f60102c);
            } else {
                throw new C25351e(status);
            }
        } else {
            throw new C25351e(Status.f60102c);
        }
    }

    @Override // com.google.android.gms.auth.api.identity.AbstractC25282a
    /* renamed from: a */
    public final AbstractC25631h<BeginSignInResult> mo41346a(BeginSignInRequest beginSignInRequest) {
        C25565r.m49314a(beginSignInRequest);
        BeginSignInRequest.C25281a a = new BeginSignInRequest.C25281a().mo41338a(beginSignInRequest.f59948b);
        a.f59963a = (BeginSignInRequest.PasswordRequestOptions) C25565r.m49314a(beginSignInRequest.f59947a);
        a.f59965c = beginSignInRequest.f59950d;
        String str = beginSignInRequest.f59949c;
        if (str != null) {
            a.f59964b = str;
        }
        a.f59964b = ((C25287f) this.f60120c).f59975a;
        BeginSignInRequest a2 = a.mo41339a();
        AbstractC25468s.C25469a a3 = AbstractC25468s.m49130a();
        a3.f60459c = new Feature[]{C25690l.f60822a};
        a3.f60457a = new C25685g(this, a2);
        a3.f60458b = false;
        return mo41510a(a3.mo41715a());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25683e(android.app.Activity r4, com.google.android.gms.auth.api.identity.C25287f r5) {
        /*
            r3 = this;
            com.google.android.gms.common.api.a<com.google.android.gms.auth.api.identity.f> r2 = com.google.android.gms.internal.p1942authapi.C25683e.f60815k
            com.google.android.gms.auth.api.identity.f$a r1 = new com.google.android.gms.auth.api.identity.f$a
            r1.<init>()
            java.lang.String r0 = r5.f59975a
            if (r0 == 0) goto L_0x000e
            r1.mo41357a(r0)
        L_0x000e:
            java.lang.String r0 = com.google.android.gms.internal.p1942authapi.C25692n.m49618a()
            com.google.android.gms.auth.api.identity.f$a r0 = r1.mo41357a(r0)
            com.google.android.gms.auth.api.identity.f r1 = r0.mo41358a()
            com.google.android.gms.common.api.h$a r0 = com.google.android.gms.common.api.C25354h.C25355a.f60127a
            r3.<init>(r4, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p1942authapi.C25683e.<init>(android.app.Activity, com.google.android.gms.auth.api.identity.f):void");
    }
}
