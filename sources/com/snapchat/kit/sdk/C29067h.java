package com.snapchat.kit.sdk;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.p2067a.C28954b;
import com.snapchat.kit.sdk.core.p2067a.C28958f;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.List;

/* renamed from: com.snapchat.kit.sdk.h */
final class C29067h {

    /* renamed from: a */
    private static String f68657a = "AuthRequestFactory";

    /* renamed from: b */
    private static int f68658b = 32;

    /* renamed from: c */
    private static int f68659c = 32;

    static {
        Covode.recordClassIndex(35416);
    }

    /* renamed from: a */
    private static String m58062a(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: a */
    private static String m58063a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("US-ASCII"));
            return Base64.encodeToString(instance.digest(), 11);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    static C28954b m58060a(String str, String str2, List<String> list, C28958f fVar, KitPluginType kitPluginType, boolean z, boolean z2) {
        return m58061a(str, str2, list, m58062a(f68658b), m58062a(f68659c), fVar, kitPluginType, z, z2);
    }

    /* renamed from: a */
    static C28954b m58061a(String str, String str2, List<String> list, String str3, String str4, C28958f fVar, KitPluginType kitPluginType, boolean z, boolean z2) {
        return new C28954b().withResponseType("code").withClientId(str).withScope(TextUtils.join(" ", list)).withRedirectUri(str2).withCodeChallengeMethod("S256").withCodeVerifier(str4).withCodeChallenge(m58063a(str4)).withState(str3).withFeatures(fVar.mo50314a()).withKitPluginType(kitPluginType).withSdkIsFromReactNativePlugin(z).withIsForFirebaseAuthentication(z2);
    }
}
