package com.snapchat.kit.sdk.core.networking;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.Request;

/* renamed from: com.snapchat.kit.sdk.core.networking.i */
public final class C29034i extends AbstractC29036k {

    /* renamed from: a */
    private final Fingerprint f68598a;

    static {
        Covode.recordClassIndex(35367);
    }

    @Override // com.snapchat.kit.sdk.core.networking.AbstractC29036k, okhttp3.AbstractC90202u
    public final /* bridge */ /* synthetic */ C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        return super.intercept(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.snapchat.kit.sdk.core.networking.AbstractC29036k
    /* renamed from: a */
    public final Request.C90016a mo50702a(AbstractC90202u.AbstractC90203a aVar) {
        Request.C90016a a = super.mo50702a(aVar);
        String encryptedFingerprint = this.f68598a.getEncryptedFingerprint();
        if (encryptedFingerprint != null) {
            a.mo144692a("X-Snap-SDK-Client-Auth-Token", encryptedFingerprint);
        }
        return a;
    }

    C29034i(String str, Fingerprint fingerprint) {
        super(str);
        this.f68598a = fingerprint;
    }
}
