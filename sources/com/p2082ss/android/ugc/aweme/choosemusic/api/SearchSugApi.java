package com.p2082ss.android.ugc.aweme.choosemusic.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35891ak;
import com.p2082ss.android.ugc.aweme.music.p3469d.AbstractC60751a;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.api.SearchSugApi */
public interface SearchSugApi {

    /* renamed from: a */
    public static final C35753a f84344a = C35753a.f84346b;

    static {
        Covode.recordClassIndex(42990);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/search/sug/")
    AbstractFutureC27655q<C35891ak> getSearchSugList(@AbstractC89736t(mo144292a = "keyword") String str, @AbstractC89736t(mo144292a = "source") String str2, @AbstractC89736t(mo144292a = "history_list") String str3);

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.api.SearchSugApi$a */
    public static final class C35753a {

        /* renamed from: a */
        public static final SearchSugApi f84345a;

        /* renamed from: b */
        static final /* synthetic */ C35753a f84346b = new C35753a();

        private C35753a() {
        }

        static {
            Covode.recordClassIndex(42991);
            Object a = RetrofitFactory.m33635a().mo28817b(AbstractC60751a.f138050a).mo28832d().mo28858a(SearchSugApi.class);
            C89219l.m154716b(a, "");
            f84345a = (SearchSugApi) a;
        }
    }
}
