package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FriendVideoMoreOperator */
public final class FriendVideoMoreOperator extends AbstractC41261a<AbstractC39100a<?, ?>, C39101b<AbstractC39100a<?, ?>>> implements AbstractC41262aa.AbstractC41264b {
    public static final Companion Companion = new Companion(null);

    static {
        Covode.recordClassIndex(58695);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa.AbstractC41264b
    public final void bindPreLoadView(AbstractC49992x xVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41261a
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa.AbstractC41264b
    public final void setPreLoad(boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.FriendVideoMoreOperator$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(58696);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public FriendVideoMoreOperator(AbstractC39100a<?, ?> aVar) {
    }
}
