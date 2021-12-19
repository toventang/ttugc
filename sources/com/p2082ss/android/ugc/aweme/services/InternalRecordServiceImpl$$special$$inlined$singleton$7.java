package com.p2082ss.android.ugc.aweme.services;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76196m;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.TTSearchStickerViewModel;
import com.p2082ss.android.ugc.aweme.tools.AVApi;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$$special$$inlined$singleton$7 */
public final class InternalRecordServiceImpl$$special$$inlined$singleton$7 extends AbstractC21603p<AbstractC76329a> {
    static {
        Covode.recordClassIndex(79663);
    }

    @Override // com.bytedance.p1559o.AbstractC21603p
    public final AbstractC76329a get(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        AbstractC75655o t = ((AbstractC84089j) fVar.mo35248a(AbstractC84089j.class, (String) null)).mo23167t();
        AbstractC75300d u = ((AbstractC84089j) fVar.mo35248a(AbstractC84089j.class, (String) null)).mo23168u();
        Object a = fVar.mo35247a(AbstractC84398d.class);
        C89219l.m154716b(a, "");
        TTSearchStickerViewModel tTSearchStickerViewModel = new TTSearchStickerViewModel((AbstractC1204m) fVar.mo35248a(AbstractC1204m.class, (String) null), t, u, new C76196m((AbstractC84398d) a));
        AVApi b = AVApiImpl.m123134b();
        C89219l.m154716b(b, "");
        String a2 = b.mo109850a();
        C89219l.m154716b(a2, "");
        tTSearchStickerViewModel.mo120034b(a2);
        return tTSearchStickerViewModel;
    }
}
