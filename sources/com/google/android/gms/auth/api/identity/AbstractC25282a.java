package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25477j;
import com.google.android.gms.p1940d.AbstractC25631h;

/* renamed from: com.google.android.gms.auth.api.identity.a */
public interface AbstractC25282a extends AbstractC25477j<C25287f> {
    static {
        Covode.recordClassIndex(30664);
    }

    /* renamed from: a */
    SignInCredential mo41344a(Intent intent);

    /* renamed from: a */
    AbstractC25631h<Void> mo41345a();

    /* renamed from: a */
    AbstractC25631h<BeginSignInResult> mo41346a(BeginSignInRequest beginSignInRequest);
}
