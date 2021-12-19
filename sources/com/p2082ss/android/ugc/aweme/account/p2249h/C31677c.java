package com.p2082ss.android.ugc.aweme.account.p2249h;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.auth.AuthResult;
import com.p2082ss.android.ugc.aweme.account.login.C31942i;
import com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32840d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.h.c */
public final class C31677c implements AbstractC31679e {
    static {
        Covode.recordClassIndex(38411);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2249h.AbstractC31679e
    /* renamed from: a */
    public final void mo57668a(AuthResult authResult) {
        String str;
        int i;
        if (authResult != null) {
            C20891c cVar = authResult.f49369c;
            if (cVar != null) {
                C89219l.m154716b(cVar, "");
                i = cVar.getErrorCode();
                str = cVar.getMessage();
            } else {
                str = null;
                i = 0;
            }
            if (authResult.f49367a) {
                C31869a.m66221a(C31869a.EnumC31871a.SUCCESS, null, "kakaotalk");
            } else if (authResult.f49368b) {
                String str2 = str + " | " + Log.getStackTraceString(authResult.f49369c);
                C89219l.m154716b(str2, "");
                C31869a.m66221a(C31869a.EnumC31871a.CANCEL, str2, "kakaotalk");
                C32840d.C32841a.m67413a(2, "kakaotalk", 0, "");
            } else {
                C32840d.C32841a.m67413a(1, "kakaotalk", i, str);
                C31942i.m66312a(i, str, "kakaotalk");
                String str3 = "Error code = " + i + ", desc = " + str;
                C89219l.m154716b(str3, "");
                C31869a.m66221a(C31869a.EnumC31871a.FAILURE, str3, "kakaotalk");
            }
        }
    }
}
