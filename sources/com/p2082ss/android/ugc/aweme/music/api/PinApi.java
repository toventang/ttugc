package com.p2082ss.android.ugc.aweme.music.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.music.api.PinApi */
public final class PinApi {

    /* renamed from: a */
    public static PinOperatorApi f137510a;

    /* renamed from: b */
    public static final C60332a f137511b = new C60332a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.music.api.PinApi$PinOperatorApi */
    public interface PinOperatorApi {
        static {
            Covode.recordClassIndex(70877);
        }

        @AbstractC89731o(mo144285a = "/tiktok/user/pinned_pgc_music/create/v1/")
        @AbstractC21999g
        AbstractC88979t<BaseResponse> pinMusic(@AbstractC21997e(mo35786a = "sec_user_id") String str, @AbstractC21997e(mo35786a = "music_id") String str2);

        @AbstractC89731o(mo144285a = "/tiktok/user/pinned_pgc_music/delete/v1/")
        @AbstractC21999g
        AbstractC88979t<BaseResponse> unpinMusic(@AbstractC21997e(mo35786a = "sec_user_id") String str, @AbstractC21997e(mo35786a = "music_id") String str2);
    }

    static {
        Covode.recordClassIndex(70876);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.api.PinApi$a */
    public static final class C60332a {
        static {
            Covode.recordClassIndex(70878);
        }

        private C60332a() {
        }

        /* renamed from: a */
        static PinOperatorApi m110047a() {
            if (PinApi.f137510a == null) {
                PinApi.f137510a = (PinOperatorApi) RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(PinOperatorApi.class);
            }
            PinOperatorApi pinOperatorApi = PinApi.f137510a;
            if (pinOperatorApi == null) {
                C89219l.m154715b();
            }
            return pinOperatorApi;
        }

        public /* synthetic */ C60332a(byte b) {
            this();
        }
    }
}
