package com.p2082ss.android.ugc.aweme.discover.p2797ui.suggest;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.c */
public final class C42964c {

    /* renamed from: a */
    public static final C42964c f100188a = new C42964c();

    private C42964c() {
    }

    static {
        Covode.recordClassIndex(51096);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.c$b */
    public static final class C42966b extends AbstractC89220m implements AbstractC89171a<SuggestWordsApi.C41852a> {

        /* renamed from: a */
        public static final C42966b f100190a = new C42966b();

        static {
            Covode.recordClassIndex(51098);
        }

        C42966b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SuggestWordsApi.C41852a invoke() {
            String str;
            SuggestWordsApi.C41852a aVar = new SuggestWordsApi.C41852a();
            aVar.f97638a = "100010";
            aVar.f97639b = "general";
            if (C13627m.m24499a(C17867d.f42595s, "local_test")) {
                str = "1";
            } else {
                str = "0";
            }
            aVar.f97640c = str;
            aVar.f97647j = "discover_guess";
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.c$a */
    public static final class C42965a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C42965a f100189a = new C42965a();

        static {
            Covode.recordClassIndex(51097);
        }

        C42965a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            SuggestWordResponse suggestWordResponse = (SuggestWordResponse) obj;
            C89219l.m154721d(suggestWordResponse, "");
            return new DiscoverSectionItem.SuggestSearchSection(suggestWordResponse);
        }
    }
}
