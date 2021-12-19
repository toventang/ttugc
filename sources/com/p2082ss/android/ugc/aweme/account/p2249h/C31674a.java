package com.p2082ss.android.ugc.aweme.account.p2249h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.auth.AuthResult;
import com.p2082ss.android.ugc.aweme.account.login.C31942i;
import com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32840d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.trill.p4373c.p4374a.C85079a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.h.a */
public final class C31674a implements AbstractC31679e {
    static {
        Covode.recordClassIndex(38408);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2249h.AbstractC31679e
    /* renamed from: a */
    public final void mo57668a(AuthResult authResult) {
        String str;
        int i;
        int i2;
        if (authResult != null) {
            if (authResult.f49367a) {
                String str2 = authResult.f49372f;
                long j = authResult.f49374h;
                C85079a.m146282a("fb_access_token", str2);
                C85079a.m146281a().edit().putLong("fb_access_token_exp", j).apply();
                C31869a.m66221a(C31869a.EnumC31871a.SUCCESS, null, "facebook");
                return;
            }
            C20891c cVar = authResult.f49369c;
            if (cVar != null) {
                C89219l.m154716b(cVar, "");
                i = cVar.getErrorCode();
                str = cVar.getMessage();
            } else {
                str = "";
                i = 0;
            }
            if (authResult.f49368b) {
                C31869a.m66221a(C31869a.EnumC31871a.CANCEL, null, "facebook");
                C32840d.C32841a.m67413a(2, "facebook", i, str);
                return;
            }
            C51423a.m95790a((Throwable) authResult.f49369c);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" | ");
            C20891c cVar2 = authResult.f49369c;
            if (!(cVar2 == null || cVar2.getStackTrace() == null)) {
                C20891c cVar3 = authResult.f49369c;
                if (cVar3 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(cVar3, "");
                for (StackTraceElement stackTraceElement : cVar3.getStackTrace()) {
                    sb.append(stackTraceElement.toString());
                }
            }
            String sb2 = sb.toString();
            C89219l.m154716b(sb2, "");
            if (!(str == null || str.length() == 0)) {
                if (str == null) {
                    C89219l.m154715b();
                }
                if (C89361p.m154908a((CharSequence) str, (CharSequence) "connection", true)) {
                    i2 = -10002;
                    C31942i.m66313a("", sb2, "facebook");
                    C32840d.C32841a.m67413a(1, "facebook", i2, sb2);
                    C31869a.m66221a(C31869a.EnumC31871a.FAILURE, sb2, "facebook");
                }
            }
            i2 = -10000;
            C31942i.m66313a("", sb2, "facebook");
            C32840d.C32841a.m67413a(1, "facebook", i2, sb2);
            C31869a.m66221a(C31869a.EnumC31871a.FAILURE, sb2, "facebook");
        }
    }
}
