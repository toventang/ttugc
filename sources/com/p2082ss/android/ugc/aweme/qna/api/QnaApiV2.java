package com.p2082ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.question.model.C66575a;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.qna.api.QnaApiV2 */
public interface QnaApiV2 {

    /* renamed from: a */
    public static final C66002a f148581a = C66002a.f148582a;

    static {
        Covode.recordClassIndex(77507);
    }

    @AbstractC89731o(mo144285a = "/tiktok/v1/forum/question/create/")
    @AbstractC89721e
    AbstractC88979t<C66575a> createQuestion(@AbstractC89719c(mo144273a = "user_id") Long l, @AbstractC89719c(mo144273a = "question_content") String str, @AbstractC89719c(mo144273a = "invited_users") String str2);

    @AbstractC89731o(mo144285a = "/tiktok/v1/forum/question/invite/delete/")
    @AbstractC89721e
    AbstractC88979t<Object> deleteInviteQuestion(@AbstractC89719c(mo144273a = "question_id") long j);

    @AbstractC89731o(mo144285a = "/tiktok/v1/forum/question/delete/")
    @AbstractC89721e
    AbstractC88979t<C66013j> deleteQuestion(@AbstractC89719c(mo144273a = "question_id") long j);

    @AbstractC22000h(mo35789a = "/tiktok/v1/forum/profile/answers/")
    AbstractC88979t<C66010g> getAnswersTabData(@AbstractC22018z(mo35807a = "user_id") Long l, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "cursor") int i2, @AbstractC22018z(mo35807a = "sec_user_id") String str);

    @AbstractC22000h(mo35789a = "/tiktok/v1/forum/profile/banner/")
    AbstractC88979t<C66011h> getBannerData(@AbstractC22018z(mo35807a = "user_id") Long l, @AbstractC22018z(mo35807a = "sec_user_id") String str);

    @AbstractC22000h(mo35789a = "/tiktok/v1/forum/profile/questions/")
    AbstractC88979t<C66012i> getQuestionsTabData(@AbstractC22018z(mo35807a = "user_id") Long l, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "cursor") int i2, @AbstractC22018z(mo35807a = "sec_user_id") String str);

    @AbstractC22000h(mo35789a = "/tiktok/v1/forum/question/suggest/")
    AbstractC88979t<C66014k> getSuggestedTabData(@AbstractC22018z(mo35807a = "user_id") Long l, @AbstractC22018z(mo35807a = "requests") String str);

    @AbstractC89731o(mo144285a = "/tiktok/v1/forum/question/collect/")
    AbstractC88979t<Object> sflQuestion(@AbstractC22018z(mo35807a = "question_id") long j, @AbstractC22018z(mo35807a = "action") int i);

    /* renamed from: com.ss.android.ugc.aweme.qna.api.QnaApiV2$a */
    public static final class C66002a {

        /* renamed from: a */
        static final /* synthetic */ C66002a f148582a;

        /* renamed from: b */
        private static final AbstractC89244h f148583b;

        /* renamed from: a */
        public static QnaApiV2 m117822a() {
            return (QnaApiV2) f148583b.getValue();
        }

        private C66002a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.qna.api.QnaApiV2$a$a */
        static final class C66003a extends AbstractC89220m implements AbstractC89171a<QnaApiV2> {

            /* renamed from: a */
            final /* synthetic */ C66002a f148584a;

            static {
                Covode.recordClassIndex(77509);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C66003a(C66002a aVar) {
                super(0);
                this.f148584a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ QnaApiV2 invoke() {
                return C66002a.m117823b();
            }
        }

        static {
            Covode.recordClassIndex(77508);
            C66002a aVar = new C66002a();
            f148582a = aVar;
            f148583b = C89250i.m154773a((AbstractC89171a) new C66003a(aVar));
        }

        /* renamed from: b */
        public static QnaApiV2 m117823b() {
            Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(QnaApiV2.class);
            C89219l.m154716b(a, "");
            return (QnaApiV2) a;
        }
    }
}
