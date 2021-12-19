package com.p2082ss.android.ugc.aweme.account.p2249h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.auth.AuthResult;
import com.p2082ss.android.ugc.aweme.account.login.C31942i;
import com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32840d;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.h.g */
public final class C31682g implements AbstractC31679e {

    /* renamed from: a */
    public static final String[] f75793a = {"Authorize failed.", "Authorization failed, request was canceled.", "Failed to get authorization, bundle incomplete"};

    /* renamed from: c */
    private static final C31683a f75794c = new C31683a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.account.h.g$a */
    static final class C31683a {
        static {
            Covode.recordClassIndex(38417);
        }

        private C31683a() {
        }

        public /* synthetic */ C31683a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(38416);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2249h.AbstractC31679e
    /* renamed from: a */
    public final void mo57668a(AuthResult authResult) {
        String str;
        int i;
        if (authResult != null) {
            if (authResult.f49367a) {
                C31869a.m66221a(C31869a.EnumC31871a.SUCCESS, null, "twitter");
                return;
            }
            C20891c cVar = authResult.f49369c;
            if (cVar != null) {
                C89219l.m154716b(cVar, "");
                i = cVar.getErrorCode();
                str = cVar.getMessage();
            } else {
                str = null;
                i = 0;
            }
            if (C89064i.m154489a(f75793a, str)) {
                C31869a.m66221a(C31869a.EnumC31871a.CANCEL, null, "twitter");
                C32840d.C32841a.m67413a(2, "twitter", i, str);
                return;
            }
            StringBuilder append = new StringBuilder().append(str).append(" | ");
            C20891c cVar2 = authResult.f49369c;
            if (!(cVar2 == null || cVar2.getStackTrace() == null)) {
                C20891c cVar3 = authResult.f49369c;
                if (cVar3 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(cVar3, "");
                for (StackTraceElement stackTraceElement : cVar3.getStackTrace()) {
                    append.append(stackTraceElement.toString());
                }
            }
            String sb = append.toString();
            C89219l.m154716b(sb, "");
            C31942i.m66313a("", sb, "twitter");
            C32840d.C32841a.m67413a(1, "twitter", -10000, sb);
            C31869a.m66221a(C31869a.EnumC31871a.FAILURE, sb, "twitter");
        }
    }
}
