package com.p2082ss.android.ugc.aweme.account.p2249h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.auth.AuthResult;
import com.p2082ss.android.ugc.aweme.account.login.C31942i;
import com.p2082ss.android.ugc.aweme.account.login.authorize.p2255a.C31869a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32840d;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.h.b */
public final class C31675b implements AbstractC31679e {

    /* renamed from: a */
    public static final List<Integer> f75788a = C89070n.m154522b(7, 8, 16, 12501, 12502);

    /* renamed from: c */
    private static final C31676a f75789c = new C31676a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.account.h.b$a */
    static final class C31676a {
        static {
            Covode.recordClassIndex(38410);
        }

        private C31676a() {
        }

        public /* synthetic */ C31676a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(38409);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2249h.AbstractC31679e
    /* renamed from: a */
    public final void mo57668a(AuthResult authResult) {
        if (authResult != null) {
            String str = null;
            if (authResult.f49367a) {
                C31869a.m66221a(C31869a.EnumC31871a.SUCCESS, null, "google");
                return;
            }
            int i = 0;
            C20891c cVar = authResult.f49369c;
            if (cVar != null) {
                C89219l.m154716b(cVar, "");
                i = cVar.getProviderErrorCode();
                cVar.getErrorCode();
                str = cVar.getMessage();
            }
            if (authResult.f49368b || f75788a.contains(Integer.valueOf(i))) {
                C32840d.C32841a.m67413a(2, "google", i, str);
                return;
            }
            C31942i.m66312a(i, str, "google");
            C32840d.C32841a.m67413a(1, "google", i, str);
            C31869a.m66221a(C31869a.EnumC31871a.FAILURE, "googleErrorCode: " + i + ", errorDesc: " + str, "google");
        }
    }
}
