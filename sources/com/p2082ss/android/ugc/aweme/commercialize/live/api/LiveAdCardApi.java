package com.p2082ss.android.ugc.aweme.commercialize.live.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2575a.C38050c;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.api.LiveAdCardApi */
public interface LiveAdCardApi {

    /* renamed from: a */
    public static final C38053a f89916a = C38053a.f89918b;

    static {
        Covode.recordClassIndex(45518);
    }

    @AbstractC22000h(mo35789a = "/tiktok/v1/ad/live/component/detail/")
    AbstractC21983b<C38050c> getLiveAdCardInfo(@AbstractC22018z(mo35807a = "room_id") String str, @AbstractC22018z(mo35807a = "author_id") String str2, @AbstractC22018z(mo35807a = "sec_author_id") String str3);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.api.LiveAdCardApi$a */
    public static final class C38053a {

        /* renamed from: a */
        public static final String f89917a = ("https://" + C17867d.f42587k.f42569a);

        /* renamed from: b */
        static final /* synthetic */ C38053a f89918b = new C38053a();

        private C38053a() {
        }

        static {
            Covode.recordClassIndex(45519);
        }
    }
}
