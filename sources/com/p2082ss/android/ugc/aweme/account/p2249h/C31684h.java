package com.p2082ss.android.ugc.aweme.account.p2249h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.auth.AuthResult;
import com.p2082ss.android.ugc.aweme.account.login.C31942i;
import com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32840d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.h.h */
public final class C31684h implements AbstractC31679e {
    static {
        Covode.recordClassIndex(38418);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2249h.AbstractC31679e
    /* renamed from: a */
    public final void mo57668a(AuthResult authResult) {
        if (authResult != null) {
            int i = 0;
            String str = null;
            C20891c cVar = authResult.f49369c;
            if (cVar != null) {
                C89219l.m154716b(cVar, "");
                i = cVar.getErrorCode();
                str = cVar.getMessage();
            }
            if (authResult.f49367a) {
                C31869a.m66221a(C31869a.EnumC31871a.SUCCESS, "", "vk");
            } else if (authResult.f49368b) {
                C32840d.C32841a.m67413a(2, "vk", i, str);
                C31869a.m66221a(C31869a.EnumC31871a.CANCEL, "", "vk");
            } else {
                C32840d.C32841a.m67413a(1, "vk", i, str);
                C31942i.m66313a("", str, "vk");
                C31869a.m66221a(C31869a.EnumC31871a.FAILURE, "errorCode: ".concat(String.valueOf(i)), "vk");
            }
        }
    }
}
