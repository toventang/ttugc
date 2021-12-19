package com.p2082ss.android.ugc.aweme.profile.widgets.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.api.BAProfileGrowthShowApi */
public interface BAProfileGrowthShowApi {

    /* renamed from: a */
    public static final C64511a f146177a = C64511a.f146178a;

    static {
        Covode.recordClassIndex(75974);
    }

    @AbstractC22012t(mo35799a = "/tiktok/v1/ad/ba/profile/message/show/")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> sendMessageIsShown(@AbstractC21997e(mo35786a = "message_id") String str);

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.api.BAProfileGrowthShowApi$a */
    public static final class C64511a {

        /* renamed from: a */
        static final /* synthetic */ C64511a f146178a = new C64511a();

        private C64511a() {
        }

        static {
            Covode.recordClassIndex(75975);
        }
    }
}
