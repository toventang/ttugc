package com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.p2932a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.C47951b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a.b */
public final class C47947b extends AbstractC41261a<C47951b, C39101b<C47951b>> {

    /* renamed from: a */
    public static final C47948a f111059a = new C47948a((byte) 0);

    static {
        Covode.recordClassIndex(56655);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.a.b$a */
    public static final class C47948a {
        static {
            Covode.recordClassIndex(56656);
        }

        private C47948a() {
        }

        public /* synthetic */ C47948a(byte b) {
            this();
        }
    }

    public C47947b(AbstractC39100a<?, ?> aVar) {
        this.mModel = (C47951b) (!(aVar instanceof C47951b) ? null : aVar);
        this.mPresenter = new C39101b();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        this.mPresenter.mo57616a(Integer.valueOf(i));
    }
}
