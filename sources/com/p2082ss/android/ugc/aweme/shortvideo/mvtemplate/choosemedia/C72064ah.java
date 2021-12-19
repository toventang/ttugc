package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59174d;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ah */
final /* synthetic */ class C72064ah implements AbstractC89172b {

    /* renamed from: a */
    private final C72060ae f161533a;

    static {
        Covode.recordClassIndex(84729);
    }

    C72064ah(C72060ae aeVar) {
        this.f161533a = aeVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C72060ae aeVar = this.f161533a;
        if (obj == OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE) {
            if (aeVar.f161524k == 0) {
                C59187c.m108690a(4, C72060ae.f161515b, aeVar.f161524k, aeVar.f161527n, AbstractC59174d.C59176b.f134653a);
            }
            if (aeVar.f161523j == 0) {
                C59187c.m108690a(aeVar.f161526m ? 1 : 3, C72060ae.f161516c, aeVar.f161523j, aeVar.f161527n, AbstractC59174d.C59176b.f134653a);
            }
        }
        return C89391z.f203057a;
    }
}
