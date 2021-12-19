package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.PromoteEntryCheckApi */
public interface PromoteEntryCheckApi {

    /* renamed from: a */
    public static final C67995a f152336a = C67995a.f152337a;

    static {
        Covode.recordClassIndex(80186);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/promote/api/entry/check/")
    AbstractFutureC27655q<PromoteEntryCheck> getPromoteEntryCheck(@AbstractC89736t(mo144292a = "item_id") String str, @AbstractC89736t(mo144292a = "source") String str2);

    /* renamed from: com.ss.android.ugc.aweme.setting.api.PromoteEntryCheckApi$a */
    public static final class C67995a {

        /* renamed from: a */
        static final /* synthetic */ C67995a f152337a = new C67995a();

        private C67995a() {
        }

        static {
            Covode.recordClassIndex(80187);
        }

        /* renamed from: a */
        public static PromoteEntryCheckApi m120304a() {
            String str = Api.f79771d;
            C89219l.m154716b(str, "");
            return (PromoteEntryCheckApi) C18097a.m33696a().mo28816a(str).mo28858a(PromoteEntryCheckApi.class);
        }
    }
}
