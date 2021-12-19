package com.bytedance.creativex.recorder.filter.p946e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50811a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.filter.e.a */
public final class C14258a {
    static {
        Covode.recordClassIndex(16327);
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.e.a$a */
    public static final class C14259a implements AbstractC50703k {

        /* renamed from: a */
        final /* synthetic */ AbstractC31193a f34560a;

        static {
            Covode.recordClassIndex(16328);
        }

        C14259a(AbstractC31193a aVar) {
            this.f34560a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50703k
        /* renamed from: a */
        public final float mo23007a(FilterBean filterBean) {
            C89219l.m154721d(filterBean, "");
            float c = C50811a.m95161c(filterBean);
            if (c != 0.0f) {
                return c;
            }
            AbstractC31193a aVar = this.f34560a;
            String filterFolder = filterBean.getFilterFolder();
            C89219l.m154716b(filterFolder, "");
            return aVar.mo56792b(filterFolder);
        }
    }

    /* renamed from: a */
    public static final AbstractC50703k m26000a(AbstractC31193a aVar) {
        C89219l.m154721d(aVar, "");
        return new C14259a(aVar);
    }
}
