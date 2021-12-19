package com.p2082ss.android.ugc.aweme.keyword;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.keyword.SugKeywordViewModel */
public final class SugKeywordViewModel extends AbstractC1174ac {

    /* renamed from: a */
    private final AbstractC89244h f129936a = C89250i.m154773a((AbstractC89171a) C57065a.f129937a);

    static {
        Covode.recordClassIndex(66958);
    }

    /* renamed from: a */
    public final NextLiveData<String> mo94222a() {
        return (NextLiveData) this.f129936a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.keyword.SugKeywordViewModel$a */
    static final class C57065a extends AbstractC89220m implements AbstractC89171a<NextLiveData<String>> {

        /* renamed from: a */
        public static final C57065a f129937a = new C57065a();

        static {
            Covode.recordClassIndex(66959);
        }

        C57065a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NextLiveData<String> invoke() {
            return new NextLiveData();
        }
    }
}
