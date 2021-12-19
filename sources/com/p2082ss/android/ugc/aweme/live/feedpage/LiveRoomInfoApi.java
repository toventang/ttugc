package com.p2082ss.android.ugc.aweme.live.feedpage;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.LiveRoomInfoApi */
public interface LiveRoomInfoApi {

    /* renamed from: a */
    public static final C58616a f133499a = C58616a.f133500a;

    static {
        Covode.recordClassIndex(68913);
    }

    @AbstractC22000h(mo35789a = "/webcast/room/info_by_user/")
    AbstractC88979t<LiveRoomInfoResponse> fetchUserRoom(@AbstractC22018z(mo35807a = "user_id") long j, @AbstractC22018z(mo35807a = "sec_user_id") String str);

    /* renamed from: com.ss.android.ugc.aweme.live.feedpage.LiveRoomInfoApi$a */
    public static final class C58616a {

        /* renamed from: a */
        static final /* synthetic */ C58616a f133500a = new C58616a();

        private C58616a() {
        }

        static {
            Covode.recordClassIndex(68914);
        }
    }
}
