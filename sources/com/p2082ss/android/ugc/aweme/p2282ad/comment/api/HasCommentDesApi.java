package com.p2082ss.android.ugc.aweme.p2282ad.comment.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.p2286a.AbstractC33137b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.api.HasCommentDesApi */
public final class HasCommentDesApi {

    /* renamed from: a */
    public static AbstractC33137b f78727a;

    /* renamed from: b */
    public static final AbstractC89244h f78728b = C89250i.m154773a((AbstractC89171a) C33142c.f78734a);

    /* renamed from: c */
    public static final HasCommentDesApi f78729c = new HasCommentDesApi();

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.api.HasCommentDesApi$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(39956);
        }

        @AbstractC22000h(mo35789a = "/tiktok/v1/ad/privacy/settings/description/")
        AbstractC21983b<C33139a> getResponse(@AbstractC22018z(mo35807a = "item_id") String str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ad.comment.api.HasCommentDesApi$a */
    public static final class C33139a {
        @AbstractC27891c(mo46611a = "status_code")

        /* renamed from: a */
        public final int f78730a;
        @AbstractC27891c(mo46611a = "status_msg")

        /* renamed from: b */
        public final String f78731b;
        @AbstractC27891c(mo46611a = "has_ad_comment_des")

        /* renamed from: c */
        public final boolean f78732c;

        static {
            Covode.recordClassIndex(39957);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C33139a)) {
                return false;
            }
            C33139a aVar = (C33139a) obj;
            return this.f78730a == aVar.f78730a && C89219l.m154714a(this.f78731b, aVar.f78731b) && this.f78732c == aVar.f78732c;
        }

        public final int hashCode() {
            int i = this.f78730a * 31;
            String str = this.f78731b;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.f78732c;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            return hashCode + i2;
        }

        public final String toString() {
            return "HasCResponse(statusCode=" + this.f78730a + ", statusMsg=" + this.f78731b + ", hasAdCommentDes=" + this.f78732c + ")";
        }
    }

    private HasCommentDesApi() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.api.HasCommentDesApi$b */
    public static final class C33140b implements AbstractC22030d<C33139a> {
        static {
            Covode.recordClassIndex(39958);
        }

        /* renamed from: com.ss.android.ugc.aweme.ad.comment.api.HasCommentDesApi$b$a */
        static final class RunnableC33141a implements Runnable {

            /* renamed from: a */
            public static final RunnableC33141a f78733a = new RunnableC33141a();

            static {
                Covode.recordClassIndex(39959);
            }

            RunnableC33141a() {
            }

            public final void run() {
                AbstractC33137b bVar = HasCommentDesApi.f78727a;
                if (bVar != null) {
                    bVar.mo58997a();
                }
                HasCommentDesApi.f78727a = null;
            }
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<C33139a> bVar, Throwable th) {
            HasCommentDesApi.f78727a = null;
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<C33139a> bVar, C22099u<C33139a> uVar) {
            if (uVar == null || !uVar.f52261a.mo35845a() || !uVar.f52262b.f78732c) {
                HasCommentDesApi.f78727a = null;
            } else {
                C34727m.m70944a(RunnableC33141a.f78733a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.api.HasCommentDesApi$c */
    static final class C33142c extends AbstractC89220m implements AbstractC89171a<Api> {

        /* renamed from: a */
        public static final C33142c f78734a = new C33142c();

        static {
            Covode.recordClassIndex(39960);
        }

        C33142c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Api invoke() {
            return RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(39955);
    }
}
