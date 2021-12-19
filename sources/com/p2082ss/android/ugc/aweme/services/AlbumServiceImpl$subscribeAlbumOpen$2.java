package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.AlbumServiceImpl$subscribeAlbumOpen$2 */
final class AlbumServiceImpl$subscribeAlbumOpen$2 extends AbstractC89220m implements AbstractC89172b<OpeningChooseMediaPageState, C89391z> {
    final /* synthetic */ AbstractC89171a $runnable;

    static {
        Covode.recordClassIndex(79580);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlbumServiceImpl$subscribeAlbumOpen$2(AbstractC89171a aVar) {
        super(1);
        this.$runnable = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* bridge */ /* synthetic */ C89391z invoke(OpeningChooseMediaPageState openingChooseMediaPageState) {
        invoke(openingChooseMediaPageState);
        return C89391z.f203057a;
    }

    public final void invoke(OpeningChooseMediaPageState openingChooseMediaPageState) {
        C89219l.m154721d(openingChooseMediaPageState, "");
        if (C89219l.m154714a(openingChooseMediaPageState, OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE)) {
            this.$runnable.invoke();
        }
    }
}
