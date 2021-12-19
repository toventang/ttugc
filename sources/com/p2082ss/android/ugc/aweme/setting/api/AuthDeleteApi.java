package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.LinkedHashMap;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.setting.api.AuthDeleteApi */
public interface AuthDeleteApi {

    /* renamed from: a */
    public static final C67987a f152315a = C67987a.f152316a;

    static {
        Covode.recordClassIndex(80167);
    }

    @AbstractC89731o(mo144285a = "/aweme/v1/openapi/authorized/app/remove/")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> deleteAuthInfoApp(@AbstractC89720d LinkedHashMap<String, String> linkedHashMap);

    /* renamed from: com.ss.android.ugc.aweme.setting.api.AuthDeleteApi$a */
    public static final class C67987a {

        /* renamed from: a */
        static final /* synthetic */ C67987a f152316a = new C67987a();

        private C67987a() {
        }

        static {
            Covode.recordClassIndex(80168);
        }
    }
}
