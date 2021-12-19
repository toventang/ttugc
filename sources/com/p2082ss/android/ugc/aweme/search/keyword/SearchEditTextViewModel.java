package com.p2082ss.android.ugc.aweme.search.keyword;

import android.widget.EditText;
import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.search.keyword.SearchEditTextViewModel */
public final class SearchEditTextViewModel extends AbstractC1174ac {

    /* renamed from: a */
    private final AbstractC89244h f151352a = C89250i.m154773a((AbstractC89171a) C67588a.f151353a);

    static {
        Covode.recordClassIndex(79225);
    }

    /* renamed from: a */
    public final NextLiveData<EditText> mo106527a() {
        return (NextLiveData) this.f151352a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.keyword.SearchEditTextViewModel$a */
    static final class C67588a extends AbstractC89220m implements AbstractC89171a<NextLiveData<EditText>> {

        /* renamed from: a */
        public static final C67588a f151353a = new C67588a();

        static {
            Covode.recordClassIndex(79226);
        }

        C67588a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NextLiveData<EditText> invoke() {
            return new NextLiveData();
        }
    }
}
