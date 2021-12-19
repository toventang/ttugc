package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.setting.api.DataSaverApi */
public interface DataSaverApi {

    /* renamed from: a */
    public static final C67989a f152320a = C67989a.f152322b;

    static {
        Covode.recordClassIndex(80173);
    }

    @AbstractC89731o(mo144285a = "/aweme/v1/set/data-saver-setting/")
    @AbstractC89721e
    C1731i<BaseResponse> setDataSaverSetting(@AbstractC89719c(mo144273a = "data_saver_setting") int i);

    /* renamed from: com.ss.android.ugc.aweme.setting.api.DataSaverApi$a */
    public static final class C67989a {

        /* renamed from: a */
        public static final DataSaverApi f152321a;

        /* renamed from: b */
        static final /* synthetic */ C67989a f152322b = new C67989a();

        private C67989a() {
        }

        static {
            Covode.recordClassIndex(80174);
            String str = Api.f79771d;
            C89219l.m154716b(str, "");
            f152321a = (DataSaverApi) C18097a.m33696a().mo28816a(str).mo28858a(DataSaverApi.class);
        }
    }
}
