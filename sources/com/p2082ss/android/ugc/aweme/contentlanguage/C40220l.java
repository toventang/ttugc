package com.p2082ss.android.ugc.aweme.contentlanguage;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.contentlanguage.api.AbstractC40187b;
import com.p2082ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68343a;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.l */
public final class C40220l {

    /* renamed from: a */
    public C88411a f94417a = new C88411a();

    /* renamed from: b */
    public AbstractC40222a f94418b;

    /* renamed from: c */
    private LanguageApi f94419c = AbstractC40187b.m81299a();

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.l$a */
    public interface AbstractC40222a {
        static {
            Covode.recordClassIndex(48017);
        }

        /* renamed from: a */
        void mo69391a();

        /* renamed from: a */
        void mo69392a(Throwable th);
    }

    static {
        Covode.recordClassIndex(48015);
    }

    /* renamed from: b */
    private void m81329b(C68343a aVar, int i) {
        if (i == 0) {
            ContentLanguageServiceImpl.m81266f().mo69373a(aVar.getLanguageCode());
        } else {
            ContentLanguageServiceImpl.m81266f().mo69371a(aVar);
        }
        this.f94418b.mo69391a();
    }

    /* renamed from: a */
    public final void mo69420a(C68343a aVar, int i) {
        if (!C31575b.m65865g().isLogin()) {
            m81329b(aVar, i);
        } else {
            this.f94419c.setContentLanguage("content_language", aVar.getLanguageCode(), i).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new AbstractC88986z<BaseResponse>() {
                /* class com.p2082ss.android.ugc.aweme.contentlanguage.C40220l.C402211 */

                static {
                    Covode.recordClassIndex(48016);
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onComplete() {
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onSubscribe(AbstractC88412b bVar) {
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onError(Throwable th) {
                    if (C40220l.this.f94418b != null) {
                        C40220l.this.f94418b.mo69392a(th);
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.AbstractC88986z
                public final /* synthetic */ void onNext(BaseResponse baseResponse) {
                    BaseResponse baseResponse2 = baseResponse;
                    if (baseResponse2 != null && baseResponse2.status_code == 0 && C40220l.this.f94418b != null) {
                        C40220l.this.f94418b.mo69391a();
                    }
                }
            });
        }
    }
}
