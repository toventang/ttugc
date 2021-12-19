package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.AlbumServiceImpl$subscribeAlbumClose$2 */
final class AlbumServiceImpl$subscribeAlbumClose$2 extends AbstractC89220m implements AbstractC89172b<ClosingChooseMediaPageState, C89391z> {
    final /* synthetic */ AbstractC89171a $runnable;

    static {
        Covode.recordClassIndex(79578);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlbumServiceImpl$subscribeAlbumClose$2(AbstractC89171a aVar) {
        super(1);
        this.$runnable = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* bridge */ /* synthetic */ C89391z invoke(ClosingChooseMediaPageState closingChooseMediaPageState) {
        invoke(closingChooseMediaPageState);
        return C89391z.f203057a;
    }

    public final void invoke(ClosingChooseMediaPageState closingChooseMediaPageState) {
        C89219l.m154721d(closingChooseMediaPageState, "");
        if (C89219l.m154714a(closingChooseMediaPageState, ClosingChooseMediaPageState.Closed.INSTANCE)) {
            this.$runnable.invoke();
        }
    }
}
