package com.p2082ss.android.ugc.aweme.account.p2249h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C20886c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.h.f */
public final class C31681f {

    /* renamed from: a */
    public static final C31681f f75792a = new C31681f();

    private C31681f() {
    }

    static {
        Covode.recordClassIndex(38415);
    }

    /* renamed from: a */
    public static final String m66000a(AuthResult authResult) {
        if (authResult != null) {
            return authResult.f49376j.getString("code");
        }
        return "";
    }

    /* renamed from: b */
    public static final String m66003b(AuthResult authResult) {
        if (authResult != null) {
            return authResult.f49376j.getString("profile_key");
        }
        return "";
    }

    /* renamed from: d */
    public static final String m66005d(AuthResult authResult) {
        if (authResult == null) {
            return "";
        }
        return m66002a(authResult.f49370d);
    }

    /* renamed from: a */
    public static final String m66001a(C20886c cVar) {
        if (cVar == null) {
            return "";
        }
        return m66002a(cVar.f49387b);
    }

    /* renamed from: c */
    public static final String m66004c(AuthResult authResult) {
        if (authResult == null) {
            return "";
        }
        if (C89219l.m154714a((Object) authResult.f49370d, (Object) "google")) {
            C89219l.m154716b("", "");
            return "";
        } else if (C89219l.m154714a((Object) authResult.f49370d, (Object) "facebook")) {
            C89219l.m154716b("", "");
            return "";
        } else if (C89219l.m154714a((Object) authResult.f49370d, (Object) "twitter")) {
            C89219l.m154716b("504", "");
            return "504";
        } else if (C89219l.m154714a((Object) authResult.f49370d, (Object) "instagram")) {
            C89219l.m154716b("204", "");
            return "204";
        } else if (C89219l.m154714a((Object) authResult.f49370d, (Object) "vk")) {
            C89219l.m154716b("", "");
            return "";
        } else if (C89219l.m154714a((Object) authResult.f49370d, (Object) "google_web")) {
            C89219l.m154716b("935", "");
            return "935";
        } else {
            if (C89219l.m154714a((Object) authResult.f49370d, (Object) "google_onetap")) {
                C89219l.m154716b("", "");
            }
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000e A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m66002a(java.lang.String r3) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.p2249h.C31681f.m66002a(java.lang.String):java.lang.String");
    }
}
