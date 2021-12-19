package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59174d;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.View$OnClickListenerC72152av;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ag */
final /* synthetic */ class C72063ag implements View$OnClickListenerC72152av.AbstractC72156d {

    /* renamed from: a */
    private final C72060ae f161532a;

    static {
        Covode.recordClassIndex(84728);
    }

    C72063ag(C72060ae aeVar) {
        this.f161532a = aeVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.View$OnClickListenerC72152av.AbstractC72156d
    /* renamed from: a */
    public final void mo114350a(int i, AbstractC59174d dVar) {
        C72060ae aeVar = this.f161532a;
        if (i == 4) {
            if (!aeVar.f161522i) {
                return;
            }
            if (dVar != AbstractC59174d.C59175a.f134652a) {
                C59187c cVar = aeVar.f161518e;
                int i2 = C72060ae.f161515b;
                int i3 = aeVar.f161524k + 1;
                aeVar.f161524k = i3;
                cVar.mo96691a(i, i2, i3, aeVar.f161527n);
            } else if (C72216f.m127413a(aeVar) == OpeningChooseMediaPageState.NoSceneAnimation.INSTANCE) {
                C59187c.m108690a(i, C72060ae.f161515b, aeVar.f161524k, aeVar.f161527n, AbstractC59174d.C59176b.f134653a);
            }
        } else if ((i != 3 && i != 1) || !aeVar.f161521h) {
        } else {
            if (dVar != AbstractC59174d.C59175a.f134652a) {
                C59187c cVar2 = aeVar.f161518e;
                int i4 = C72060ae.f161516c;
                int i5 = aeVar.f161523j + 1;
                aeVar.f161523j = i5;
                cVar2.mo96691a(i, i4, i5, aeVar.f161527n);
            } else if (C72216f.m127413a(aeVar) == OpeningChooseMediaPageState.NoSceneAnimation.INSTANCE) {
                C59187c.m108690a(i, C72060ae.f161516c, aeVar.f161523j, aeVar.f161527n, AbstractC59174d.C59176b.f134653a);
            }
        }
    }
}
