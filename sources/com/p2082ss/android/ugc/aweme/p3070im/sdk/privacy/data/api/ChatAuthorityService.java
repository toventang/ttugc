package com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88403ab;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService */
public interface ChatAuthorityService {

    /* renamed from: a */
    public static final C55704a f127060a = C55704a.f127062b;

    static {
        Covode.recordClassIndex(65487);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/im/set/chatpriv/")
    AbstractC88403ab<BaseResponse> setChatAuthority(@AbstractC89736t(mo144292a = "val") int i);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService$a */
    public static final class C55704a {

        /* renamed from: a */
        public static ChatAuthorityService f127061a;

        /* renamed from: b */
        static final /* synthetic */ C55704a f127062b = new C55704a();

        private C55704a() {
        }

        static {
            Covode.recordClassIndex(65488);
        }
    }
}
