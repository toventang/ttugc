package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.vesdk.C85302aa;
import java.lang.ref.WeakReference;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.i */
public final class C72793i implements C85302aa.AbstractC85303a {

    /* renamed from: a */
    public final C2563k<C89378p<Integer, Integer>> f163229a;

    /* renamed from: b */
    private final WeakReference<SafeHandler> f163230b;

    static {
        Covode.recordClassIndex(85479);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.i$a */
    static final class RunnableC72794a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C72793i f163231a;

        /* renamed from: b */
        final /* synthetic */ int f163232b;

        /* renamed from: c */
        final /* synthetic */ int f163233c;

        static {
            Covode.recordClassIndex(85480);
        }

        RunnableC72794a(C72793i iVar, int i, int i2) {
            this.f163231a = iVar;
            this.f163232b = i;
            this.f163233c = i2;
        }

        public final void run() {
            this.f163231a.f163229a.mo6999a(C89387v.m154943a(Integer.valueOf(this.f163232b), Integer.valueOf(this.f163233c)));
        }
    }

    public C72793i(WeakReference<SafeHandler> weakReference, C2563k<C89378p<Integer, Integer>> kVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(kVar, "");
        this.f163230b = weakReference;
        this.f163229a = kVar;
    }

    @Override // com.p2082ss.android.vesdk.C85302aa.AbstractC85303a
    /* renamed from: a */
    public final void mo115078a(int i, int i2) {
        SafeHandler safeHandler = this.f163230b.get();
        if (safeHandler != null) {
            safeHandler.post(new RunnableC72794a(this, i, i2));
        }
    }
}
