package com.p2082ss.android.ugc.aweme.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63502h;
import com.p2082ss.android.ugc.aweme.shoutouts.api.AbstractC74385a;
import com.p2082ss.android.ugc.aweme.shoutouts.api.IShoutoutsReviewService;
import com.p2082ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewService;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.internal.ShoutOutServiceImpl */
public final class ShoutOutServiceImpl implements IShoutOutApiService {
    static {
        Covode.recordClassIndex(66686);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IShoutOutApiService
    /* renamed from: a */
    public final void mo93979a() {
        AbstractC81915c.m141874a(new C63502h());
    }

    /* renamed from: b */
    public static IShoutOutApiService m103042b() {
        MethodCollector.m26663i(6244);
        Object a = C81908b.m141854a(IShoutOutApiService.class, false);
        if (a != null) {
            IShoutOutApiService iShoutOutApiService = (IShoutOutApiService) a;
            MethodCollector.m26664o(6244);
            return iShoutOutApiService;
        }
        if (C81908b.f183209bL == null) {
            synchronized (IShoutOutApiService.class) {
                try {
                    if (C81908b.f183209bL == null) {
                        C81908b.f183209bL = new ShoutOutServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6244);
                    throw th;
                }
            }
        }
        ShoutOutServiceImpl shoutOutServiceImpl = (ShoutOutServiceImpl) C81908b.f183209bL;
        MethodCollector.m26664o(6244);
        return shoutOutServiceImpl;
    }

    /* renamed from: com.ss.android.ugc.aweme.internal.ShoutOutServiceImpl$a */
    public static final class C56807a implements AbstractC74385a {

        /* renamed from: a */
        final /* synthetic */ AbstractC56811d f129375a;

        static {
            Covode.recordClassIndex(66687);
        }

        C56807a(AbstractC56811d dVar) {
            this.f129375a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shoutouts.api.AbstractC74385a
        /* renamed from: a */
        public final void mo93983a(boolean z) {
            this.f129375a.mo93984a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IShoutOutApiService
    /* renamed from: a */
    public final void mo93982a(String str, long j) {
        C89219l.m154721d(str, "");
        C47809e.C47810a.f110762a.mo79877b(str, String.valueOf(j));
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IShoutOutApiService
    /* renamed from: a */
    public final void mo93980a(Context context, String str, Integer num, Float f, String str2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        IShoutoutsReviewService a = ShoutoutsReviewService.m130953a();
        if (a != null) {
            a.mo117002a(context, str, num, f, str2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IShoutOutApiService
    /* renamed from: a */
    public final void mo93981a(ViewGroup viewGroup, int i, float f, String str, String str2, AbstractC56811d dVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        IShoutoutsReviewService a = ShoutoutsReviewService.m130953a();
        if (a != null) {
            a.mo117003a(viewGroup, i, f, str, str2, new C56807a(dVar));
        }
    }
}
