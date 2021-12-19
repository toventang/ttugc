package com.p2082ss.android.ugc.aweme.share.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.ClientKeyScopesResponse;
import p4560f.p4561a.AbstractC88403ab;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.share.api.CheckScopeApi */
public interface CheckScopeApi {

    /* renamed from: a */
    public static final C68871a f154045a = C68871a.f154046a;

    static {
        Covode.recordClassIndex(81172);
    }

    @AbstractC89731o(mo144285a = "/oauth/get_client_scopes/")
    @AbstractC89721e
    AbstractC88403ab<ClientKeyScopesResponse> checkScopeExist(@AbstractC89719c(mo144273a = "client_key") String str, @AbstractC89719c(mo144273a = "app_identity") String str2);

    /* renamed from: com.ss.android.ugc.aweme.share.api.CheckScopeApi$a */
    public static final class C68871a {

        /* renamed from: a */
        static final /* synthetic */ C68871a f154046a = new C68871a();

        private C68871a() {
        }

        static {
            Covode.recordClassIndex(81173);
        }
    }
}
