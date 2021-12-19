package com.p2082ss.android.ugc.aweme.comment.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.comment.model.LikeListResponse;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.comment.api.LikeApi */
public final class LikeApi {

    /* renamed from: a */
    static final String f85696a = ("https://" + C17867d.f42587k.f42569a);

    /* renamed from: b */
    public static final LikeApi f85697b = new LikeApi();

    /* renamed from: c */
    private static final AbstractC89244h f85698c = C89250i.m154773a((AbstractC89171a) C36266b.f85701a);

    /* renamed from: com.ss.android.ugc.aweme.comment.api.LikeApi$Api */
    public interface Api {

        /* renamed from: com.ss.android.ugc.aweme.comment.api.LikeApi$Api$a */
        public static final class C36264a {
            static {
                Covode.recordClassIndex(43538);
            }
        }

        static {
            Covode.recordClassIndex(43537);
        }

        @AbstractC89731o(mo144285a = "/tiktok/video/like/list/v1")
        @AbstractC89721e
        AbstractC88979t<LikeListResponse> fetchLikeList(@AbstractC89719c(mo144273a = "aweme_id") String str, @AbstractC89719c(mo144273a = "cursor") long j, @AbstractC89719c(mo144273a = "count") int i, @AbstractC89719c(mo144273a = "insert_ids") String str2, @AbstractC89719c(mo144273a = "scenario") int i2);
    }

    /* renamed from: a */
    public static Api m73906a() {
        return (Api) f85698c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.api.LikeApi$a */
    public enum EnumC36265a {
        NORMAL(0),
        BULLET(1);
        

        /* renamed from: b */
        private final int f85700b;

        public final int getValue() {
            return this.f85700b;
        }

        static {
            Covode.recordClassIndex(43539);
        }

        private EnumC36265a(int i) {
            this.f85700b = i;
        }
    }

    private LikeApi() {
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.api.LikeApi$b */
    static final class C36266b extends AbstractC89220m implements AbstractC89171a<Api> {

        /* renamed from: a */
        public static final C36266b f85701a = new C36266b();

        static {
            Covode.recordClassIndex(43540);
        }

        C36266b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Api invoke() {
            return RetrofitFactory.m33635a().mo28816a(LikeApi.f85696a).mo28858a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(43536);
    }
}
