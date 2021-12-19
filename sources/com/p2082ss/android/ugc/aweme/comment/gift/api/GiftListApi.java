package com.p2082ss.android.ugc.aweme.comment.gift.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftResponse;
import java.util.concurrent.ExecutionException;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.api.GiftListApi */
public final class GiftListApi {

    /* renamed from: a */
    public static FetchGiftListApi f86124a;

    /* renamed from: b */
    public static final C36433a f86125b = new C36433a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.api.GiftListApi$FetchGiftListApi */
    public interface FetchGiftListApi {
        static {
            Covode.recordClassIndex(43730);
        }

        @AbstractC22000h(mo35789a = "/tiktok/v1/gift/list/")
        AbstractC88979t<GiftResponse> getGiftList(@AbstractC22018z(mo35807a = "aweme_id") String str, @AbstractC22018z(mo35807a = "creator_uid") String str2);
    }

    static {
        Covode.recordClassIndex(43729);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.api.GiftListApi$a */
    public static final class C36433a {
        static {
            Covode.recordClassIndex(43731);
        }

        private C36433a() {
        }

        public /* synthetic */ C36433a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC88979t<GiftResponse> m74205a(String str, String str2) {
            try {
                if (GiftListApi.f86124a == null) {
                    GiftListApi.f86124a = (FetchGiftListApi) RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(FetchGiftListApi.class);
                }
                FetchGiftListApi fetchGiftListApi = GiftListApi.f86124a;
                if (fetchGiftListApi == null) {
                    C89219l.m154715b();
                }
                return fetchGiftListApi.getGiftList(str, str2);
            } catch (ExecutionException e) {
                AbstractC34479a.getCompatibleException(e);
                AbstractC88979t<GiftResponse> a = C88925a.m154171a(C88790v.f201616a);
                C89219l.m154716b(a, "");
                return a;
            }
        }
    }
}
