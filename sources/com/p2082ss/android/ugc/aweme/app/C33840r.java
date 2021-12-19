package com.p2082ss.android.ugc.aweme.app;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37672f;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37674g;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37683p;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39044b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.app.r */
public final class C33840r implements AbstractC39044b {

    /* renamed from: a */
    public static final C33840r f80097a = new C33840r();

    /* renamed from: b */
    private static final AbstractC89244h f80098b = C89250i.m154773a((AbstractC89171a) C33841a.f80099a);

    /* renamed from: a */
    static SparseArray<AbstractC39043a> m69217a() {
        return (SparseArray) f80098b.getValue();
    }

    private C33840r() {
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39044b
    /* renamed from: b */
    public final SparseArray<AbstractC39043a> mo60056b() {
        return m69217a();
    }

    static {
        Covode.recordClassIndex(40740);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.r$a */
    static final class C33841a extends AbstractC89220m implements AbstractC89171a<SparseArray<AbstractC39043a>> {

        /* renamed from: a */
        public static final C33841a f80099a = new C33841a();

        static {
            Covode.recordClassIndex(40741);
        }

        C33841a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SparseArray<AbstractC39043a> invoke() {
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(4, new C37672f());
            sparseArray.put(5, new AdCommentDependImpl());
            sparseArray.put(17, new C37683p());
            sparseArray.put(19, new C37674g());
            return sparseArray;
        }
    }
}
