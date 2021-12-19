package com.p2082ss.android.ugc.aweme.commercialize.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.gson.C27910f;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38247o;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38251q;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import java.util.ArrayList;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi */
public final class AwemeAdRankApi {

    /* renamed from: a */
    public static final AwemeAdRankApi f88901a = new AwemeAdRankApi();

    /* renamed from: b */
    private static final RealApi f88902b;

    /* renamed from: c */
    private static final C27910f f88903c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(45024);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/ad/rank/")
        C1731i<C38251q> requestAwemeAdRank(@AbstractC22018z(mo35807a = "cached_aweme_list") String str, @AbstractC22018z(mo35807a = "last_ad_show_interval") long j, @AbstractC22018z(mo35807a = "action_mask") int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$a */
    public interface AbstractC37605a {
        static {
            Covode.recordClassIndex(45025);
        }

        /* renamed from: a */
        void mo65516a(String str);

        /* renamed from: a */
        void mo65517a(String str, Exception exc);

        /* renamed from: a */
        void mo65518a(List<C38247o> list, String str);
    }

    private AwemeAdRankApi() {
    }

    static {
        RealApi realApi;
        AbstractC18099f a;
        Covode.recordClassIndex(45023);
        IRetrofitFactory a2 = RetrofitFactory.m33635a();
        C27910f fVar = null;
        if (a2 == null || (a = a2.mo28816a(C29736b.f70924e)) == null) {
            realApi = null;
        } else {
            realApi = (RealApi) a.mo28858a(RealApi.class);
        }
        f88902b = realApi;
        GsonProvider c = GsonHolder.m138943c();
        if (c != null) {
            fVar = c.mo123620b();
        }
        f88903c = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$b */
    public static final class C37606b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC37605a f88904a;

        static {
            Covode.recordClassIndex(45026);
        }

        C37606b(AbstractC37605a aVar) {
            this.f88904a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            List<C38247o> f;
            String str = "";
            C89219l.m154716b(iVar, str);
            if (iVar.mo5539b()) {
                AbstractC37605a aVar = this.f88904a;
                if (aVar != null) {
                    aVar.mo65516a("request canceled");
                }
            } else if (iVar.mo5544c()) {
                AbstractC37605a aVar2 = this.f88904a;
                if (aVar2 != null) {
                    String message = iVar.mo5546e().getMessage();
                    if (message != null) {
                        str = message;
                    }
                    aVar2.mo65517a(str, iVar.mo5546e());
                }
            } else {
                C38251q qVar = (C38251q) iVar.mo5545d();
                if (qVar.f90380a == 204) {
                    AbstractC37605a aVar3 = this.f88904a;
                    if (aVar3 != null) {
                        String str2 = qVar.f90381b;
                        if (str2 == null) {
                            str2 = "204: no change";
                        }
                        aVar3.mo65516a(str2);
                    }
                } else {
                    List<C38247o> list = qVar.f90382c;
                    if (list == null || (f = C89070n.m154580f((Iterable) list)) == null) {
                        AbstractC37605a aVar4 = this.f88904a;
                        if (aVar4 != null) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("empty rank list");
                            C89219l.m154716b(qVar, str);
                            qVar.getRequestId();
                            aVar4.mo65517a("empty rank list", illegalArgumentException);
                        }
                    } else {
                        C48027ac acVar = C48027ac.C48028a.f111257a;
                        C89219l.m154716b(qVar, str);
                        acVar.mo80056a(qVar.getRequestId(), qVar.f90383d);
                        for (C38247o oVar : f) {
                            Aweme repackAweme = oVar.getRepackAweme();
                            if (repackAweme != null) {
                                repackAweme.setRequestId(qVar.getRequestId());
                                AwemeService.m70060b().mo60677a(repackAweme);
                            }
                        }
                        AbstractC37605a aVar5 = this.f88904a;
                        if (aVar5 != null) {
                            aVar5.mo65518a(f, qVar.getRequestId());
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m75861a(List<? extends Aweme> list, long j, AbstractC37605a aVar) {
        C1731i<C38251q> requestAwemeAdRank;
        String b;
        String str;
        Long creativeId;
        String str2 = "";
        C89219l.m154721d(list, str2);
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            String aid = t.getAid();
            boolean isAd = t.isAd();
            if (t.isAd()) {
                AwemeRawAd awemeRawAd = t.getAwemeRawAd();
                if (awemeRawAd == null || (creativeId = awemeRawAd.getCreativeId()) == null) {
                    str = null;
                } else {
                    str = String.valueOf(creativeId.longValue());
                }
            } else {
                str = str2;
            }
            arrayList.add(new C38247o(aid, isAd ? 1 : 0, str, null, 8, null));
        }
        C27910f fVar = f88903c;
        if (!(fVar == null || (b = fVar.mo46674b(arrayList)) == null)) {
            str2 = b;
        }
        try {
            RealApi realApi = f88902b;
            if (!(realApi == null || (requestAwemeAdRank = realApi.requestAwemeAdRank(str2, j, -1)) == null)) {
                requestAwemeAdRank.mo5532a(new C37606b(aVar));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
