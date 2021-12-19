package com.p2082ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.share.model.C69330b;
import com.p2082ss.android.ugc.aweme.share.model.ShortenModel;
import p4560f.p4561a.AbstractC88973n;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.share.ShortenUrlApi */
public final class ShortenUrlApi {

    /* renamed from: a */
    private static final String f153931a = "https://api.tiktokv.com/";

    /* renamed from: b */
    private static final RetrofitApi f153932b = ((RetrofitApi) RetrofitFactory.m33635a().mo28816a("https://api.tiktokv.com/").mo28858a(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.share.ShortenUrlApi$RetrofitApi */
    interface RetrofitApi {
        static {
            Covode.recordClassIndex(81130);
        }

        @AbstractC89722f(mo144276a = "/shorten/")
        AbstractC88973n<ShortenModel> fetchShortenUrl(@AbstractC89736t(mo144292a = "target") String str, @AbstractC89736t(mo144292a = "belong") String str2, @AbstractC89736t(mo144292a = "persist") String str3);

        @AbstractC89731o(mo144285a = "/tiktok/v1/sharer/info/sign")
        @AbstractC89721e
        AbstractC88973n<C69330b> getSharerInfoChecksum(@AbstractC89719c(mo144273a = "item_id") String str);
    }

    static {
        Covode.recordClassIndex(81129);
    }

    /* renamed from: a */
    public static AbstractC88973n<C69330b> m121477a(String str) {
        return f153932b.getSharerInfoChecksum(str);
    }

    /* renamed from: a */
    public static AbstractC88973n<ShortenModel> m121478a(String str, String str2) {
        return f153932b.fetchShortenUrl(str, str2, "1");
    }
}
