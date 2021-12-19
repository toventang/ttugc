package com.p2082ss.android.ugc.aweme.browserecord;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.browserecord.BrowseRecordSettingApi */
final class BrowseRecordSettingApi {

    /* renamed from: a */
    public static final BrowseRecordSettingApi f82398a = new BrowseRecordSettingApi();

    /* renamed from: b */
    private static final Api f82399b;

    /* renamed from: com.ss.android.ugc.aweme.browserecord.BrowseRecordSettingApi$Api */
    interface Api {
        static {
            Covode.recordClassIndex(41948);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/user/set/settings/")
        AbstractC88979t<BaseResponse> setSetting(@AbstractC89736t(mo144292a = "field") String str, @AbstractC89736t(mo144292a = "value") int i);
    }

    private BrowseRecordSettingApi() {
    }

    static {
        Covode.recordClassIndex(41947);
        String str = C29736b.f70924e;
        C89219l.m154716b(str, "");
        f82399b = (Api) C18097a.m33696a().mo28816a(str).mo28858a(Api.class);
    }
}
