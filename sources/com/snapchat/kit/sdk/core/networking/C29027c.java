package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.snapchat.kit.sdk.C29073m;
import com.snapchat.kit.sdk.core.controller.C28971b;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import okhttp3.AbstractC90202u;
import okhttp3.Request;

/* renamed from: com.snapchat.kit.sdk.core.networking.c */
public final class C29027c extends C29031g {

    /* renamed from: a */
    private final Fingerprint f68578a;

    static {
        Covode.recordClassIndex(35360);
    }

    /* access modifiers changed from: protected */
    @Override // com.snapchat.kit.sdk.core.networking.AbstractC29036k, com.snapchat.kit.sdk.core.networking.C29031g
    /* renamed from: a */
    public final Request.C90016a mo50702a(AbstractC90202u.AbstractC90203a aVar) {
        Request.C90016a a = super.mo50702a(aVar);
        String encryptedFingerprint = this.f68578a.getEncryptedFingerprint();
        if (encryptedFingerprint != null) {
            a.mo144692a("X-Snap-SDK-Client-Auth-Token", encryptedFingerprint);
        }
        return a;
    }

    C29027c(C29073m mVar, C28971b bVar, String str, Fingerprint fingerprint, C27910f fVar) {
        super(mVar, bVar, str, fVar);
        this.f68578a = fingerprint;
    }
}
