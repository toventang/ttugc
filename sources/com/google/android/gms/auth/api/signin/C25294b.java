package com.google.android.gms.auth.api.signin;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.b */
public final class C25294b implements AbstractC25485p {

    /* renamed from: a */
    public Status f60029a;

    /* renamed from: b */
    public GoogleSignInAccount f60030b;

    static {
        Covode.recordClassIndex(30681);
    }

    @Override // com.google.android.gms.common.api.AbstractC25485p
    /* renamed from: D_ */
    public final Status mo41384D_() {
        return this.f60029a;
    }

    public C25294b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f60030b = googleSignInAccount;
        this.f60029a = status;
    }
}
