package com.google.android.gms.internal.p1942authapi;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.AbstractC25266b;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.r */
public final class C25696r implements AbstractC25266b {

    /* renamed from: a */
    private final Status f60834a;

    /* renamed from: b */
    private final Credential f60835b;

    static {
        Covode.recordClassIndex(31110);
    }

    @Override // com.google.android.gms.common.api.AbstractC25485p
    /* renamed from: D_ */
    public final Status mo41384D_() {
        return this.f60834a;
    }

    @Override // com.google.android.gms.auth.api.credentials.AbstractC25266b
    /* renamed from: a */
    public final Credential mo41311a() {
        return this.f60835b;
    }

    /* renamed from: a */
    public static C25696r m49625a(Status status) {
        return new C25696r(status, null);
    }

    public C25696r(Status status, Credential credential) {
        this.f60834a = status;
        this.f60835b = credential;
    }
}
