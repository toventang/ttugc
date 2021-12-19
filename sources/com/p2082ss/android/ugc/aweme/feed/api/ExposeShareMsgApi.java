package com.p2082ss.android.ugc.aweme.feed.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.feed.model.ExposeSharerData;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.feed.api.ExposeShareMsgApi */
public final class ExposeShareMsgApi {

    /* renamed from: a */
    public static final ExposeShareMsgApi f111981a = new ExposeShareMsgApi();

    /* renamed from: b */
    private static final RealApi f111982b = ((RealApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.api.ExposeShareMsgApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(57074);
        }

        @AbstractC89722f(mo144276a = "/tiktok/v1/sharer/info/")
        AbstractC88979t<ExposeSharerData> getSharerMsg(@AbstractC89736t(mo144292a = "link_id") String str, @AbstractC89736t(mo144292a = "share_source") String str2, @AbstractC89736t(mo144292a = "from_uid") String str3, @AbstractC89736t(mo144292a = "sec_from_uid") String str4, @AbstractC89736t(mo144292a = "item_id") String str5, @AbstractC89736t(mo144292a = "checksum") String str6, @AbstractC89736t(mo144292a = "timestamp") String str7);
    }

    private ExposeShareMsgApi() {
    }

    static {
        Covode.recordClassIndex(57073);
    }

    /* renamed from: a */
    public static AbstractC88979t<ExposeSharerData> m91767a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (!TextUtils.isEmpty(str4)) {
            str3 = "";
        }
        return f111982b.getSharerMsg(str, str2, str3, str4, str5, str6, str7);
    }
}
