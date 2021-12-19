package com.p2082ss.android.ugc.aweme.compliance.protection.common.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.p2673a.C40069d;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.api.ProtectionApi */
public interface ProtectionApi {

    /* renamed from: a */
    public static final C40070a f94121a = C40070a.f94123b;

    static {
        Covode.recordClassIndex(47841);
    }

    @AbstractC89722f(mo144276a = "/tiktok/v1/compliance/guadig/settings/")
    AbstractC88979t<C40069d> getProtectionSettings();

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.api.ProtectionApi$a */
    public static final class C40070a {

        /* renamed from: a */
        public static final ProtectionApi f94122a = ((ProtectionApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C29736b.f70924e).create(ProtectionApi.class));

        /* renamed from: b */
        static final /* synthetic */ C40070a f94123b = new C40070a();

        private C40070a() {
        }

        static {
            Covode.recordClassIndex(47842);
        }
    }
}
