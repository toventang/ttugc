package com.p2082ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.api.EOYApi */
public interface EOYApi {

    /* renamed from: a */
    public static final C33530a f79636a = C33530a.f79637a;

    static {
        Covode.recordClassIndex(40396);
    }

    @AbstractC89722f(mo144276a = "/tiktok/eoy21/discover_more/list/v1")
    AbstractC88979t<Map<Object, Object>> discoverMore(@AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "offset") int i2, @AbstractC89736t(mo144292a = "extra") String str, @AbstractC89736t(mo144292a = "need_complete_aweme_list") boolean z);

    @AbstractC89722f(mo144276a = "/tiktok/eoy21/question_cloud/list/v1")
    AbstractC88979t<Map<Object, Object>> questionCloud();

    /* renamed from: com.ss.android.ugc.aweme.api.EOYApi$a */
    public static final class C33530a {

        /* renamed from: a */
        static final /* synthetic */ C33530a f79637a = new C33530a();

        private C33530a() {
        }

        static {
            Covode.recordClassIndex(40397);
        }

        /* renamed from: a */
        public static EOYApi m68693a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(EOYApi.class);
            C89219l.m154716b(create, "");
            return (EOYApi) create;
        }
    }
}
