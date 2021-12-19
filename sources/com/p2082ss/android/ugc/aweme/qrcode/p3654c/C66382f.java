package com.p2082ss.android.ugc.aweme.qrcode.p3654c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.p2479ck.C36132v;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.f */
public final class C66382f implements AbstractC66380d {

    /* renamed from: a */
    public static final C66383a f149287a = new C66383a((byte) 0);

    static {
        Covode.recordClassIndex(77914);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66380d
    /* renamed from: a */
    public final String mo90115a() {
        return "schema";
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c.f$a */
    public static final class C66383a {
        static {
            Covode.recordClassIndex(77915);
        }

        private C66383a() {
        }

        public /* synthetic */ C66383a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66380d
    /* renamed from: a */
    public final boolean mo90116a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str == null) {
            C89219l.m154715b();
        }
        if (C89361p.m154874b(str, "aweme://authorize", false)) {
            Context a = C17867d.m33078a();
            Bundle bundle = new Bundle();
            if (!(C36132v.m73608b(str, "client_key") == null || C36132v.m73608b(str, "scope") == null || (C36132v.m73608b(str, "token") == null && C36132v.m73608b(str, "bc_params") == null))) {
                if (C36132v.m73608b(str, "authType") != null) {
                    String b = C36132v.m73608b(str, "authType");
                    C89219l.m154716b(b, "");
                    bundle.putInt("authType", Integer.parseInt(b));
                }
                SmartRouter.buildRoute(a, str).withParam("_bytedance_params_client_key", C36132v.m73608b(str, "client_key")).withParam("_bytedance_params_scope", C36132v.m73608b(str, "scope")).withParam("key_qrcode_auth", true).withParam("key_qrcode_token", C36132v.m73608b(str, "token")).withParam("key_qrcode_bc_params", C36132v.m73608b(str, "bc_params")).withParam("key_qrcode_redirect_uri", C36132v.m73608b(str, "redirect_url")).withParam("_bytedance_params_extra", bundle).open();
                return true;
            }
        }
        return false;
    }
}
