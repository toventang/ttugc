package com.p2082ss.android.ugc.aweme.challenge.recommend;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.challenge.recommend.p2453a.C35538a;
import com.p2082ss.android.ugc.aweme.challenge.recommend.p2453a.C35540b;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.Comparator;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi */
public final class RecommendHashTagApi {

    /* renamed from: a */
    static final HashTagApi f83799a = ((HashTagApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(HashTagApi.class));

    /* renamed from: b */
    public static final RecommendHashTagApi f83800b = new RecommendHashTagApi();

    /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi$HashTagApi */
    public interface HashTagApi {

        /* renamed from: a */
        public static final C35535a f83801a = C35535a.f83802a;

        static {
            Covode.recordClassIndex(42751);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/challenge/history/intervene/")
        C1731i<C35540b> fetchRecommendHashTagsMT(@AbstractC89736t(mo144292a = "zip_uri") String str, @AbstractC89736t(mo144292a = "effect_ids") String str2, @AbstractC89736t(mo144292a = "music_id") String str3, @AbstractC89736t(mo144292a = "video_id") String str4);

        /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi$HashTagApi$a */
        public static final class C35535a {

            /* renamed from: a */
            static final /* synthetic */ C35535a f83802a = new C35535a();

            private C35535a() {
            }

            static {
                Covode.recordClassIndex(42752);
            }
        }
    }

    private RecommendHashTagApi() {
    }

    static {
        Covode.recordClassIndex(42750);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi$a */
    public static final class C35536a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C1213t f83803a;

        static {
            Covode.recordClassIndex(42753);
        }

        C35536a(C1213t tVar) {
            this.f83803a = tVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            List<C35538a> list;
            C89219l.m154716b(iVar, "");
            if (!iVar.mo5535a()) {
                return null;
            }
            C35540b bVar = (C35540b) iVar.mo5545d();
            if (!(bVar == null || (list = bVar.f83814a) == null)) {
                C89070n.m154530a((List) list, (Comparator) C355371.f83804a);
            }
            this.f83803a.setValue(iVar.mo5545d());
            return null;
        }
    }
}
