package com.p2082ss.android.ugc.aweme.live;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.C58492ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.ao */
public final class C58581ao implements AbstractC58649l {

    /* renamed from: a */
    public static final C58582a f133443a = new C58582a((byte) 0);

    static {
        Covode.recordClassIndex(68876);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.ao$a */
    public static final class C58582a {
        static {
            Covode.recordClassIndex(68877);
        }

        private C58582a() {
        }

        public /* synthetic */ C58582a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.ao$b */
    public static final class C58583b {

        /* renamed from: a */
        static C58581ao f133444a = new C58581ao();

        /* renamed from: b */
        public static final C58583b f133445b = new C58583b();

        private C58583b() {
        }

        static {
            Covode.recordClassIndex(68878);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58649l
    /* renamed from: a */
    public final Boolean mo96041a() {
        AbstractC58593c cVar = C58492ad.C58493a.f133169a;
        C89219l.m154716b(cVar, "");
        AbstractC11643g f = cVar.mo13025f();
        if (f != null) {
            return Boolean.valueOf(f.mo12928l());
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58649l
    /* renamed from: a */
    public final void mo96042a(boolean z) {
        AbstractC2953a a = C6193a.m13435a(AbstractC4357d.class);
        C89219l.m154716b(a, "");
        AbstractC5777j livePlayController = ((AbstractC4357d) a).getLivePlayController();
        if (livePlayController != null) {
            livePlayController.mo11531a(z, livePlayController.mo11533b());
        }
    }
}
