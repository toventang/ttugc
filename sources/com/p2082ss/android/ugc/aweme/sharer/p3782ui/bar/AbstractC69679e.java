package com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.e */
public abstract class AbstractC69679e implements AbstractC69681f {

    /* renamed from: d */
    public final Context f155545d;

    /* renamed from: e */
    public final SharePackage f155546e;

    static {
        Covode.recordClassIndex(82055);
    }

    /* renamed from: a */
    public abstract void mo60849a(AbstractC69581b bVar);

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.e$a */
    static final class C69680a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC69679e f155547a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69581b f155548b;

        static {
            Covode.recordClassIndex(82056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69680a(AbstractC69679e eVar, AbstractC69581b bVar) {
            super(0);
            this.f155547a = eVar;
            this.f155548b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f155547a.mo60849a(this.f155548b);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69681f
    /* renamed from: a_ */
    public final void mo87413a_(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        SharePackage sharePackage = this.f155546e;
        if (sharePackage != null) {
            sharePackage.mo109570a(this.f155545d, bVar, new C69680a(this, bVar));
        } else {
            mo60849a(bVar);
        }
    }

    public AbstractC69679e(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        this.f155545d = context;
        this.f155546e = sharePackage;
    }
}
