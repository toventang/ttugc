package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import java.util.LinkedHashMap;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeApi */
public final class CreateAwemeApi {

    /* renamed from: a */
    public static API f162633a = ((API) RetrofitFactory.m33635a().mo28816a(Api.f79771d).mo28858a(API.class));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeApi$API */
    public interface API {
        static {
            Covode.recordClassIndex(85233);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/create/aweme/")
        @AbstractC89721e
        AbstractFutureC27655q<CreateAwemeResponse> createAweme(@AbstractC89719c(mo144273a = "material_id") String str, @AbstractC89720d LinkedHashMap<String, String> linkedHashMap);
    }

    static {
        Covode.recordClassIndex(85232);
    }
}
