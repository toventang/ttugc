package com.p2082ss.android.ugc.aweme.account.p2249h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.auth.AuthResult;
import com.p2082ss.android.ugc.aweme.account.login.C31942i;
import com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32840d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.h.d */
public final class C31678d implements AbstractC31679e {
    static {
        Covode.recordClassIndex(38412);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2249h.AbstractC31679e
    /* renamed from: a */
    public final void mo57668a(AuthResult authResult) {
        String str;
        int i;
        if (authResult != null) {
            if (!authResult.f49367a) {
                C20891c cVar = authResult.f49369c;
                if (cVar != null) {
                    C89219l.m154716b(cVar, "");
                    i = cVar.getErrorCode();
                    str = cVar.getMessage();
                } else {
                    str = null;
                    i = 0;
                }
                if (authResult.f49368b) {
                    C31869a.m66221a(C31869a.EnumC31871a.CANCEL, null, "line");
                    C32840d.C32841a.m67413a(2, "line", i, str);
                    return;
                }
                int i2 = authResult.f49376j.getInt("line_response_ordinal", 0);
                C31942i.m66312a(i2, str, "line");
                C31869a.m66221a(C31869a.EnumC31871a.FAILURE, "Internal error {code = " + i2 + ", desc = " + str + '}', "line");
                C32840d.C32841a.m67413a(1, "line", i2, str);
                C31942i.m66312a(i2, str, "line");
            } else if (!TextUtils.isEmpty(authResult.f49372f)) {
                C31869a.m66221a(C31869a.EnumC31871a.SUCCESS, null, "line");
            } else {
                C31869a.m66221a(C31869a.EnumC31871a.FAILURE, "token = null", "line");
            }
        }
    }
}
