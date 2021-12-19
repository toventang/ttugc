package com.bytedance.lobby.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.lobby.internal.e */
public final class C20920e {

    /* renamed from: a */
    static final boolean f49473a = m39345a("com.google.android.gms.auth.api.signin.GoogleSignInClient");

    /* renamed from: b */
    static final boolean f49474b = m39345a("com.google.android.gms.auth.api.identity.SignInCredential");

    /* renamed from: c */
    static final boolean f49475c = m39345a("com.facebook.login.LoginManager");

    /* renamed from: d */
    static final boolean f49476d = m39345a("com.linecorp.linesdk.auth.LineLoginApi");

    /* renamed from: e */
    static final boolean f49477e = m39345a("com.twitter.sdk.android.core.identity.TwitterAuthClient");

    /* renamed from: f */
    static final boolean f49478f = m39345a("com.kakao.auth.KakaoSDK");

    /* renamed from: g */
    static final boolean f49479g = m39345a("com.vk.api.sdk.VK");

    static {
        Covode.recordClassIndex(24526);
    }

    /* renamed from: a */
    private static boolean m39345a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
