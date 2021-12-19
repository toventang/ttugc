package com.p2082ss.android.ugc.aweme.keyword;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.keyword.SearchKeywordViewModel */
public final class SearchKeywordViewModel extends AbstractC1174ac {

    /* renamed from: a */
    private final AbstractC89244h f129934a = C89250i.m154773a((AbstractC89171a) C57064a.f129935a);

    static {
        Covode.recordClassIndex(66956);
    }

    /* renamed from: a */
    public final NextLiveData<C57071b> mo94221a() {
        return (NextLiveData) this.f129934a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.keyword.SearchKeywordViewModel$a */
    static final class C57064a extends AbstractC89220m implements AbstractC89171a<NextLiveData<C57071b>> {

        /* renamed from: a */
        public static final C57064a f129935a = new C57064a();

        static {
            Covode.recordClassIndex(66957);
        }

        C57064a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NextLiveData<C57071b> invoke() {
            return new NextLiveData();
        }
    }
}
