package com.p2082ss.android.ugc.aweme.deeplink.p2734c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.AppLinkHandlerV2;
import com.p2082ss.android.ugc.aweme.deeplink.C41035d;
import com.p2082ss.android.ugc.aweme.deeplink.C41050m;
import com.p2082ss.android.ugc.aweme.deeplink.C41065u;
import com.p2082ss.android.ugc.aweme.deeplink.RequireLoginActivity;
import com.p2082ss.android.ugc.aweme.deeplink.p2735d.C41039c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.c.e */
public final class C41029e extends AbstractC41025b {

    /* renamed from: a */
    public static final C41030a f95911a = new C41030a((byte) 0);

    static {
        Covode.recordClassIndex(48899);
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.c.e$a */
    public static final class C41030a {
        static {
            Covode.recordClassIndex(48900);
        }

        private C41030a() {
        }

        public /* synthetic */ C41030a(byte b) {
            this();
        }
    }

    public C41029e() {
        super(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.p2734c.AbstractC41025b
    /* renamed from: b */
    public final boolean mo70240b(C41035d dVar) {
        C89219l.m154721d(dVar, "");
        return RequireLoginActivity.C40992a.m82602a(dVar.f95922e);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.p2734c.AbstractC41025b
    /* renamed from: a */
    public final boolean mo70238a(C41035d dVar) {
        String str;
        C89219l.m154721d(dVar, "");
        C41039c.m82675c("LoginNode");
        C41065u.m82724a("LoginNode");
        if (dVar.f95921d instanceof AppLinkHandlerV2) {
            str = "from_app_link";
        } else {
            str = "from_deep_link";
        }
        C41050m.f95959a.mo70177b(dVar.f95921d, str, true);
        return true;
    }
}
