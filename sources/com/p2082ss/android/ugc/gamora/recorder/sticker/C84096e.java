package com.p2082ss.android.ugc.gamora.recorder.sticker;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75299c;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.C75294b;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.e */
public final class C84096e implements AbstractC75299c {

    /* renamed from: a */
    private final AbstractC1204m f187674a;

    static {
        Covode.recordClassIndex(97989);
    }

    public C84096e(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.f187674a = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75299c
    /* renamed from: a */
    public final boolean mo118629a(Effect effect, AbstractC75655o oVar) {
        C89219l.m154721d(oVar, "");
        if (C75466g.m132357i(effect)) {
            AbstractC1196i lifecycle = this.f187674a.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (!lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
                return false;
            }
        }
        return C75294b.f169278a.mo118629a(effect, oVar);
    }
}
